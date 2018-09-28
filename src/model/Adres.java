package model;

public class Adres {
    private String ulica;
    private String nrDomu;
    private String kodPocztowy;
    private String miasto;

    public Adres(String ulica, String nrDomu, String kodPocztowy, String miasto) {
        this.ulica = ulica;
        this.nrDomu = nrDomu;
        this.kodPocztowy = kodPocztowy;
        this.miasto = miasto;
    }

    public Adres() {
    }

    public String getUlica() {
        return ulica;
    }

    public String getNrDomu() {
        return nrDomu;
    }

    public String getKodPocztowy() {
        return kodPocztowy;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public void setNrDomu(String nrDomu) {
        this.nrDomu = nrDomu;
    }

    public void setKodPocztowy(String kodPocztowy) {
        this.kodPocztowy = kodPocztowy;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }
}
