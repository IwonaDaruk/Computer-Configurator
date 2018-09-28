package model;

public class Klient {
    private String imie;
    private int id= 0;
    private String nazwisko;
    Adres adres = new Adres();

    public Klient(String imie, int id, String nazwisko, Adres adres) {
        this.imie = imie;
        this.id = id;
        this.nazwisko = nazwisko;
        this.adres = adres;
    }

    public Klient() {
    }

    public String getImie() {
        return imie;
    }

    public int getId() {
        return id;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }
}
