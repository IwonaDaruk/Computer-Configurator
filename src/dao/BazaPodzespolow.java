package dao;

import model.PodzespolKomputera;

public class BazaPodzespolow {

    PodzespolKomputera[] tablicaPodzespolow = new PodzespolKomputera[10];

    public BazaPodzespolow(PodzespolKomputera[] tablicaPodzespolow) {
        this.tablicaPodzespolow = tablicaPodzespolow;
    }

    public BazaPodzespolow() {
    }

    public PodzespolKomputera stworzPOdzespol(PodzespolKomputera podzespolKomputera) {
        PodzespolKomputera podzespolKomputera1 = new PodzespolKomputera();
        return podzespolKomputera1;
    }

    public void usunPodzespol(PodzespolKomputera podzespolKomputera) {
    }

    public PodzespolKomputera modyfikujPodzespol(PodzespolKomputera podzespolKomputera) {

        return podzespolKomputera;
    }
}


