package model;

import java.math.BigDecimal;

public class PodzespolKomputera {
    private  int id;
    String nazwa;
    String opis;
    BigDecimal cena;

    public PodzespolKomputera() {
    }

    public PodzespolKomputera(int id, String nazwa, String opis, BigDecimal cena) {
        this.id = id;
        this.nazwa = nazwa;
        this.opis = opis;
        this.cena = cena;
    }

    public int getId() {
        return id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public String getOpis() {
        return opis;
    }

    public BigDecimal getCena() {
        return cena;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public void setCena(BigDecimal cena) {
        this.cena = cena;
    }
}
