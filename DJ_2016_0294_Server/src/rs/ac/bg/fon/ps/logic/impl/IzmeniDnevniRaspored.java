/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.ps.logic.impl;

import java.util.LinkedList;
import rs.ac.bg.fon.ps.domain.DnevniRaspored;
import rs.ac.bg.fon.ps.domain.IDomain;
import rs.ac.bg.fon.ps.domain.P_DR;
import rs.ac.bg.fon.ps.domain.Projekcija;
import rs.ac.bg.fon.ps.helpClasses.KreirajDnevniRasporedHelp;
import rs.ac.bg.fon.ps.logic.SistemskeOperacije;

/**
 *
 * @author GaGiiiii
 */
public class IzmeniDnevniRaspored extends SistemskeOperacije {

    private LinkedList<Projekcija> projekcije;

    public IzmeniDnevniRaspored(KreirajDnevniRasporedHelp kdrh) {
        super();
        kdrh.getDnevni_Raspored().setDatum(new java.sql.Date(kdrh.getDnevni_Raspored().getDatum().getTime()));
        domainObject = kdrh.getDnevni_Raspored();
        projekcije = kdrh.getProjekcije();
    }

    @Override
    protected void operation() throws Exception {
        LinkedList<IDomain> dnevniRasporedi = database.getAll(DnevniRaspored.class, "", "", "datum ASC");

        for (IDomain domainObject : dnevniRasporedi) {
            DnevniRaspored drFromDB = (DnevniRaspored) domainObject;
            DnevniRaspored drToInsert = (DnevniRaspored) this.domainObject;

            if (drToInsert.equals(drFromDB)) {
                throw new Exception("Postoji dnevni raspored za zadati datum.");
            }
        }

        domainObject = database.update(domainObject);

        String join = "projekcija p ON pdr.projekcija_id = p.projekcija_id JOIN dnevni_raspored dr ON dr.dnevni_raspored_id = pdr.dnevni_raspored_id JOIN film f ON p.film_id = f.film_id JOIN sala s ON p.sala_id = s.sala_id";
        LinkedList<IDomain> pdrsDB = database.getAll(P_DR.class, join, "", "");

        for (IDomain pdr : pdrsDB) {
            P_DR pdr2 = (P_DR) pdr;
            if (pdr2.getDnevniRaspored().getId().equals(domainObject.getId())) {
                database.remove(pdr);
            }
        }

        for (Projekcija projekcija : projekcije) {
            P_DR p_dr = new P_DR(Long.MIN_VALUE, projekcija, (DnevniRaspored) domainObject);
            database.insert(p_dr);
        }

    }

}
