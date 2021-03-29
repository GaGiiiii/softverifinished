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
import rs.ac.bg.fon.ps.logic.SistemskeOperacije;

/**
 *
 * @author GaGiiiii
 */
public class UcitajListuPDR extends SistemskeOperacije {

    public UcitajListuPDR(LinkedList<IDomain> pdrs) {
        super();
        list = pdrs;
    }

    @Override
    protected void operation() throws Exception {
        String join = "projekcija p ON pdr.projekcija_id = p.projekcija_id JOIN dnevni_raspored dr ON dr.dnevni_raspored_id = pdr.dnevni_raspored_id JOIN film f ON p.film_id = f.film_id JOIN sala s ON p.sala_id = s.sala_id";
        LinkedList<IDomain> pdrs = database.getAll(P_DR.class, join, "", "");
        list = pdrs;
    }
}
