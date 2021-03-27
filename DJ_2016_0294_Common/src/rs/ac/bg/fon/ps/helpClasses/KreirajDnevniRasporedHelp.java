/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.ps.helpClasses;

import java.io.Serializable;
import java.util.LinkedList;
import rs.ac.bg.fon.ps.domain.DnevniRaspored;
import rs.ac.bg.fon.ps.domain.Projekcija;

/**
 *
 * @author GaGiiiii
 */
public class KreirajDnevniRasporedHelp implements Serializable {

    private DnevniRaspored dnevni_Raspored;
    private LinkedList<Projekcija> projekcije;

    public KreirajDnevniRasporedHelp(DnevniRaspored dnevni_Raspored, LinkedList<Projekcija> projekcije) {
        this.dnevni_Raspored = dnevni_Raspored;
        this.projekcije = projekcije;
    }

    public LinkedList<Projekcija> getProjekcije() {
        return projekcije;
    }

    public void setProjekcije(LinkedList<Projekcija> projekcije) {
        this.projekcije = projekcije;
    }

    public DnevniRaspored getDnevni_Raspored() {
        return dnevni_Raspored;
    }

    public void setDnevni_Raspored(DnevniRaspored dnevni_Raspored) {
        this.dnevni_Raspored = dnevni_Raspored;
    }

}
