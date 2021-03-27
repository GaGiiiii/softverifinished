/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.ps.controller;

import java.util.LinkedList;
import rs.ac.bg.fon.ps.domain.DnevniRaspored;
import rs.ac.bg.fon.ps.domain.Film;
import rs.ac.bg.fon.ps.domain.IDomain;
import rs.ac.bg.fon.ps.domain.Projekcija;
import rs.ac.bg.fon.ps.domain.Sala;
import rs.ac.bg.fon.ps.helpClasses.KreirajDnevniRasporedHelp;
import rs.ac.bg.fon.ps.logic.SistemskeOperacije;
import rs.ac.bg.fon.ps.logic.impl.IzmeniDnevniRaspored;
import rs.ac.bg.fon.ps.logic.impl.IzmeniProjekciju;
import rs.ac.bg.fon.ps.logic.impl.NadjiDnevniRaspored;
import rs.ac.bg.fon.ps.logic.impl.NadjiFilm;
import rs.ac.bg.fon.ps.logic.impl.NadjiProjekciju;
import rs.ac.bg.fon.ps.logic.impl.NadjiSalu;
import rs.ac.bg.fon.ps.logic.impl.ZapamtiDnevniRaspored;
import rs.ac.bg.fon.ps.logic.impl.ZapamtiFilm;
import rs.ac.bg.fon.ps.logic.impl.ZapamtiProjekciju;
import rs.ac.bg.fon.ps.logic.impl.ZapamtiSalu;
import rs.ac.bg.fon.ps.logic.impl.ObrisiFilm;
import rs.ac.bg.fon.ps.logic.impl.PretraziDnevneRasporede;
import rs.ac.bg.fon.ps.logic.impl.PretraziFilmove;
import rs.ac.bg.fon.ps.logic.impl.PretraziProjekcije;
import rs.ac.bg.fon.ps.logic.impl.PretraziSale;
import rs.ac.bg.fon.ps.logic.impl.UcitajListuDnevnihRasporeda;
import rs.ac.bg.fon.ps.logic.impl.UcitajListuFilmova;
import rs.ac.bg.fon.ps.logic.impl.UcitajListuKorisnika;
import rs.ac.bg.fon.ps.logic.impl.UcitajListuPDR;
import rs.ac.bg.fon.ps.logic.impl.UcitajListuProjekcija;
import rs.ac.bg.fon.ps.logic.impl.UcitajListuSala;

/**
 *
 * @author GaGiiiii
 */
public class Controller {

    private static Controller instance;

    private Controller() {
    }

    public static Controller getInstance() {
        if (instance == null) {
            instance = new Controller();
        }
        return instance;
    }

    public LinkedList<IDomain> ucitajListuKorisnika(LinkedList<IDomain> korisnici) throws Exception {
        SistemskeOperacije so = new UcitajListuKorisnika(korisnici);
        so.execute();

        return so.getList();
    }

    public IDomain zapamtiFilm(Film film) throws Exception {
        SistemskeOperacije so = new ZapamtiFilm(film);
        so.execute();

        return so.getDomainObject();
    }

    public IDomain zapamtiSalu(Sala sala) throws Exception {
        SistemskeOperacije so = new ZapamtiSalu(sala);
        so.execute();

        return so.getDomainObject();
    }

    public LinkedList<IDomain> ucitajListuFilmova(LinkedList<IDomain> filmovi) throws Exception {
        SistemskeOperacije so = new UcitajListuFilmova(filmovi);
        so.execute();

        return so.getList();
    }

    public LinkedList<IDomain> ucitajListuSala(LinkedList<IDomain> sale) throws Exception {
        SistemskeOperacije so = new UcitajListuSala(sale);
        so.execute();

        return so.getList();
    }

    public IDomain zapamtiProjekciju(Projekcija projekcija) throws Exception {
        SistemskeOperacije so = new ZapamtiProjekciju(projekcija);
        so.execute();

        return so.getDomainObject();
    }

    public LinkedList<IDomain> pretraziFilmove(String kriterijum, LinkedList<IDomain> list) throws Exception {
        SistemskeOperacije so = new PretraziFilmove(kriterijum, list);
        so.execute();

        return so.getList();
    }

    public boolean obrisiFilm(Film film) throws Exception {
        SistemskeOperacije so = new ObrisiFilm(film);
        so.execute();

        return so.isRet();
    }

    public LinkedList<IDomain> pretraziSale(String kriterijum, LinkedList<IDomain> list) throws Exception {
        SistemskeOperacije so = new PretraziSale(kriterijum, list);
        so.execute();

        return so.getList();
    }

    public LinkedList<IDomain> pretraziProjekcije(String kriterijum, LinkedList<IDomain> list) throws Exception {
        SistemskeOperacije so = new PretraziProjekcije(kriterijum, list);
        so.execute();

        return so.getList();
    }

    public LinkedList<IDomain> ucitajListuProjekcija(LinkedList<IDomain> projekcije) throws Exception {
        SistemskeOperacije so = new UcitajListuProjekcija(projekcije);
        so.execute();

        return so.getList();
    }

    public IDomain izmeniProjekciju(Projekcija projekcija) throws Exception {
        SistemskeOperacije so = new IzmeniProjekciju(projekcija);
        so.execute();

        return so.getDomainObject();
    }

    public IDomain zapamtiDnevniRaspored(KreirajDnevniRasporedHelp kdrh) throws Exception {
        SistemskeOperacije so = new ZapamtiDnevniRaspored(kdrh);
        so.execute();

        return so.getDomainObject();
    }

    public LinkedList<IDomain> ucitajListuDnevnihRasporeda(LinkedList<IDomain> dnevniRasporedi) throws Exception {
        SistemskeOperacije so = new UcitajListuDnevnihRasporeda(dnevniRasporedi);
        so.execute();

        return so.getList();
    }

    public LinkedList<IDomain> ucitajListuPDR(LinkedList<IDomain> pdrs) throws Exception {
        SistemskeOperacije so = new UcitajListuPDR(pdrs);
        so.execute();

        return so.getList();
    }

    public IDomain izmeniDnevniRaspored(KreirajDnevniRasporedHelp kdrh) throws Exception {
        SistemskeOperacije so = new IzmeniDnevniRaspored(kdrh);
        so.execute();

        return so.getDomainObject();
    }

    public IDomain nadjiFIlm(Film film) throws Exception {
        SistemskeOperacije so = new NadjiFilm(film);
        so.execute();

        return so.getDomainObject();
    }

    public IDomain nadjiSalu(Sala sala) throws Exception {
        SistemskeOperacije so = new NadjiSalu(sala);
        so.execute();

        return so.getDomainObject();
    }

    public IDomain nadjiProjekciju(Projekcija projekcija) throws Exception {
        SistemskeOperacije so = new NadjiProjekciju(projekcija);
        so.execute();

        return so.getDomainObject();
    }

    public IDomain nadjiDnevniRaspored(DnevniRaspored dnevniRaspored) throws Exception {
        SistemskeOperacije so = new NadjiDnevniRaspored(dnevniRaspored);
        so.execute();

        return so.getDomainObject();
    }

    public LinkedList<IDomain> pretraziDnevneRasporede(String kriterijum, LinkedList<IDomain> list) throws Exception {
        SistemskeOperacije so = new PretraziDnevneRasporede(kriterijum, list);
        so.execute();

        return so.getList();
    }

}
