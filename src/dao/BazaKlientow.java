package dao;

import model.Klient;

public class BazaKlientow {

    Klient[] tablicaKlientow = new Klient[12];

    public BazaKlientow(Klient[] tablicaKlientow) {
        this.tablicaKlientow = tablicaKlientow;
    }

    public BazaKlientow() {
        Klient klient1 = new Klient();
        Klient klient2 = new Klient();
        Klient klient3 = new Klient();
        Klient klient4 = new Klient();
        Klient klient5 = new Klient();
        Klient klient6 = new Klient();
        Klient klient7 = new Klient();
        Klient klient8 = new Klient();
        Klient klient9 = new Klient();
        Klient klient0 = new Klient();
        Klient klient10 = new Klient();
        Klient klient11 = new Klient();
        tablicaKlientow[0] = klient0;
        tablicaKlientow[1] = klient1;
        tablicaKlientow[2] = klient2;
        tablicaKlientow[3] = klient3;
        tablicaKlientow[4] = klient4;
        tablicaKlientow[5] = klient5;
        tablicaKlientow[6] = klient6;
        tablicaKlientow[7] = klient7;
        tablicaKlientow[8] = klient8;
        tablicaKlientow[9] = klient9;
        tablicaKlientow[10] = klient10;
        tablicaKlientow[11] = klient11;
    }


    public void stworzKLienta() {


    }



    public void usunKlienta(Klient klient) {
    }

    public Klient modyfikujKlienta(Klient klient) {

        return klient;
    }


}
