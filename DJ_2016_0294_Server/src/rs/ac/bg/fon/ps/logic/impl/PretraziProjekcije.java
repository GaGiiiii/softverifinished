/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.ps.logic.impl;

import java.util.LinkedList;
import rs.ac.bg.fon.ps.domain.IDomain;
import rs.ac.bg.fon.ps.domain.Projekcija;
import rs.ac.bg.fon.ps.logic.SistemskeOperacije;

/**
 *
 * @author GaGiiiii
 */
public class PretraziProjekcije extends SistemskeOperacije {

    private String kriterijum;

    public PretraziProjekcije(String kriterijum, LinkedList<IDomain> projekcije) {
        super();
        this.kriterijum = kriterijum;
        list = projekcije;
    }

    @Override
    protected void operation() throws Exception {
        String join = "film f ON projekcija.film_id = f.film_id JOIN sala s ON projekcija.sala_id = s.sala_id";
        LinkedList<IDomain> projekcije = database.getAll(Projekcija.class,
                join, "f.naziv LIKE '%" + kriterijum + "%' OR s.naziv LIKE '%" + kriterijum + "%'", "");
        list = projekcije;
    }

}
