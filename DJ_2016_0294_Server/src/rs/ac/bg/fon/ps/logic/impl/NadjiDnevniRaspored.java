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
public class NadjiDnevniRaspored extends SistemskeOperacije {

    public NadjiDnevniRaspored(DnevniRaspored dnevniRaspored) {
        super();
        domainObject = dnevniRaspored;
    }

    @Override
    protected void operation() throws Exception {
        LinkedList<IDomain> rasporedi = database.getAll(DnevniRaspored.class, "", "dnevni_raspored_id = " + domainObject.getId(), "");
        if (rasporedi.isEmpty()) {
            throw new Exception();
        }
    }
}
