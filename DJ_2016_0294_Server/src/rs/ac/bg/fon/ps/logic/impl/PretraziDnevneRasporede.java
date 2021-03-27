/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.ps.logic.impl;

import java.util.LinkedList;
import rs.ac.bg.fon.ps.domain.DnevniRaspored;
import rs.ac.bg.fon.ps.domain.IDomain;
import rs.ac.bg.fon.ps.logic.SistemskeOperacije;

/**
 *
 * @author GaGiiiii
 */
public class PretraziDnevneRasporede extends SistemskeOperacije {

    private String kriterijum;

    public PretraziDnevneRasporede(String kriterijum, LinkedList<IDomain> dnevniRasporedi) {
        super();
        this.kriterijum = kriterijum;
        list = dnevniRasporedi;
    }

    @Override
    protected void operation() throws Exception {
        if (!kriterijum.isEmpty()) {
            String[] dateArray = kriterijum.split("-");
            if (dateArray.length != 3) {
                throw new Exception();
            }
            String year = dateArray[2];
            String month = dateArray[1];
            String day = dateArray[0];
            System.out.println(year + month + day);
            kriterijum = "EXTRACT(YEAR FROM datum) = " + year + " AND EXTRACT(MONTH FROM datum) = " + month + " AND EXTRACT(DAY FROM datum) = " + day;
        }
        
        LinkedList< IDomain> projekcije = database.getAll(DnevniRaspored.class, "", kriterijum, "");
        list = projekcije;
    }

}
