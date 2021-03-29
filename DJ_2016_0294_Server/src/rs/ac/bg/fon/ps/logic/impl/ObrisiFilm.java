/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.ps.logic.impl;

import java.util.LinkedList;
import rs.ac.bg.fon.ps.domain.Film;
import rs.ac.bg.fon.ps.domain.IDomain;
import rs.ac.bg.fon.ps.domain.P_DR;
import rs.ac.bg.fon.ps.domain.Projekcija;
import rs.ac.bg.fon.ps.logic.SistemskeOperacije;

/**
 *
 * @author GaGiiiii
 */
public class ObrisiFilm extends SistemskeOperacije {

    public ObrisiFilm(Film film) {
        super();
        domainObject = film;
    }

    @Override
    protected void operation() throws Exception {
        Film film = (Film) domainObject;
        String join = "film f ON projekcija.film_id = f.film_id JOIN sala s ON projekcija.sala_id = s.sala_id";
        LinkedList<IDomain> projekcije = database.getAll(Projekcija.class, join, "f.film_id=" + film.getFilm_id(), "");
        for (IDomain projekcija : projekcije) {
//            IZBRISI I P_DR za ove projekcije===================================================================================================
            join = "projekcija p ON pdr.projekcija_id = p.projekcija_id JOIN dnevni_raspored dr ON dr.dnevni_raspored_id = pdr.dnevni_raspored_id JOIN film f ON p.film_id = f.film_id JOIN sala s ON p.sala_id = s.sala_id";
            LinkedList<IDomain> pdrsDB = database.getAll(P_DR.class, join, "", "");

            for (IDomain pdr : pdrsDB) {
                P_DR pdr2 = (P_DR) pdr;
                if (pdr2.getProjekcija().getId().equals(projekcija.getId())) {
                    database.remove(pdr);
                }
            }
            
            database.remove(projekcija);
        }
        ret = database.remove(domainObject);
    }
}
