/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.ps.domain;

import java.io.Serializable;
import java.sql.ResultSet;
import java.util.LinkedList;

/**
 *
 * @author GaGiiiii
 */
public class P_DR implements IDomain, Serializable {

    private Long p_dr_id;
    private Projekcija projekcija;
    private DnevniRaspored dnevniRaspored;

    public P_DR() {
    }

    public P_DR(Long p_dr_id, Projekcija projekcija, DnevniRaspored dnevniRaspored) {
        this.p_dr_id = p_dr_id;
        this.projekcija = projekcija;
        this.dnevniRaspored = dnevniRaspored;
    }

    public Long getP_dr_id() {
        return p_dr_id;
    }

    public void setP_dr_id(Long p_dr_id) {
        this.p_dr_id = p_dr_id;
    }

    public Projekcija getProjekcija() {
        return projekcija;
    }

    public void setProjekcija(Projekcija projekcija) {
        this.projekcija = projekcija;
    }

    public DnevniRaspored getDnevniRaspored() {
        return dnevniRaspored;
    }

    public void setDnevniRaspored(DnevniRaspored dnevniRaspored) {
        this.dnevniRaspored = dnevniRaspored;
    }

    @Override
    public String getTableName() {
        return "p_dr";
    }

    @Override
    public boolean isAutoincrement() {
        return true;
    }

    @Override
    public void setObjectId(long aLong) {
        p_dr_id = aLong;
    }

    @Override
    public String getAttributeNamesForInsert() {
        return "projekcija_id,dnevni_raspored_id";
    }

    @Override
    public String getAttributeValuesForInsert() {
        return projekcija.getId() + ", " + dnevniRaspored.getId();
    }

    @Override
    public Long getId() {
        return p_dr_id;
    }

    @Override
    public String getIdName() {
        return "p_dr_id";
    }

    @Override
    public LinkedList<IDomain> getListFromRs(ResultSet rs) throws Exception {
        LinkedList<IDomain> list = new LinkedList<>();
        while (rs.next()) {
            Long id = rs.getLong("p_dr_id");

            Film film = new Film(rs.getLong("film_id"), rs.getString("f.naziv"), rs.getString("f.zanr"),
                    rs.getInt("f.trajanje"), rs.getDouble("f.cena_karte"), rs.getString("f.reziser"), rs.getString("f.glumci"), new java.util.Date(rs.getDate("f.datum_izlaska").getTime()), rs.getString("f.opis"));
            Sala sala = new Sala(rs.getLong("sala_id"), rs.getString("s.naziv"), rs.getInt("s.broj_mesta"),
                    rs.getBoolean("s.vip_mesta"), rs.getBoolean("s.klima"), rs.getBoolean("s.has3D"));

            Projekcija projekcija = new Projekcija(rs.getLong("p.projekcija_id"), new java.util.Date(rs.getTimestamp("vreme").getTime()), film, sala);

            DnevniRaspored dnevniRaspored = new DnevniRaspored(rs.getLong("dr.dnevni_raspored_id"), new java.util.Date(rs.getDate("dr.datum").getTime()));

            P_DR pdr = new P_DR(id, projekcija, dnevniRaspored);
            list.add(pdr);
        }

        return list;
    }

    @Override
    public String setQueryForUpdate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String prepareQueryForSelect() {
        return "SELECT * FROM `P_DR` pdr";
    }

}
