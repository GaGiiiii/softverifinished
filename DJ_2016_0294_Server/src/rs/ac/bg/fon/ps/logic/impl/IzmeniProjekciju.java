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
import rs.ac.bg.fon.ps.validation.impl.ProjekcijaValidation;

/**
 *
 * @author GaGiiiii
 */
public class IzmeniProjekciju extends SistemskeOperacije {

    public IzmeniProjekciju(Projekcija projekcija) {
        super();
        projekcija.setVreme(new java.sql.Timestamp(projekcija.getVreme().getTime()));
        domainObject = projekcija;
        validator = new ProjekcijaValidation();

    }

    @Override
    protected void operation() throws Exception {
        String join = "film f ON projekcija.film_id = f.film_id JOIN sala s ON projekcija.sala_id = s.sala_id";
        LinkedList<IDomain> projekcije = database.getAll(Projekcija.class, join, "", "");

        for (IDomain domainObject : projekcije) {
            Projekcija projekcijaFromDB = (Projekcija) domainObject;
            Projekcija projekcijaToEdit = (Projekcija) this.domainObject;

            System.out.println(projekcijaToEdit.equals(projekcijaFromDB));

            if (projekcijaToEdit.equals(projekcijaFromDB)) {
                throw new Exception("Postoji projekcija u zadatom terminu.");
            }
        }
               
        domainObject = database.update(domainObject);
    }

}
