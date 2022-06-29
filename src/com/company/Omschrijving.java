package com.company;

public class Omschrijving {
    private String titel;
    private String werkgever;
    private int btw;
    private double bedrag;
    private int aantal;

    public Omschrijving(String titel, String werkgever, int btw, int bedrag, int aantal) {
        this.titel = titel;
        this.werkgever = werkgever;
        this.btw = btw;
        this.bedrag = bedrag;
        this.aantal = aantal;
    }

    public Omschrijving(String titel, int aantal, double bedrag, int btw){
        this.titel = titel;
        this.aantal = aantal;
        this.bedrag = bedrag;
        this.btw = btw;
    }



    public String getTitel() {
        return titel;
    }

    public String getWerkgever() {
        return werkgever;
    }

    public double getBtw() {
        return btw;
    }

    public double getBedrag() {
        return bedrag;
    }

    public int getAantal() {
        return aantal;
    }


}
