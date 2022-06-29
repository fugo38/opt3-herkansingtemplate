package com.company;

import java.util.ArrayList;

public abstract class Factuur implements bedragBerekent{
    protected String naam;
    private int factuurNummer = 0;
    protected ArrayList<Omschrijving> alleOmschrijvingen = new ArrayList<>();
    protected int btwNummer;
    protected String factuurDatum;
    protected User user;

    public Factuur(User user, String naam, int btwNummer, String factuurDatum) {
        this.user = user;
        this.naam = naam;
        this.factuurNummer = uniekFactuurnummer();
//        this.alleOmschrijvingen = initialiseerOmschrijving();
        this.btwNummer = btwNummer;
        this.factuurDatum = factuurDatum;
    }

    public Factuur(User user, String naam, String factuurDatum) {
        this.user = user;
        this.naam = naam;
        this.factuurDatum = factuurDatum;
    }

    protected int uniekFactuurnummer(){
        factuurNummer++;
        return factuurNummer;

    }

    public double totaalBedrag(){
        int bedrag = 0;
        for(int i = 0; i < alleOmschrijvingen.size(); i++){
            bedrag += alleOmschrijvingen.get(i).getBedrag() * alleOmschrijvingen.get(i).getAantal();
        }
        return bedrag;
    }


    public double btwBedrag(){
        double btwBedrag = 0;
        for(int i = 0; i < alleOmschrijvingen.size(); i++){
            btwBedrag += (alleOmschrijvingen.get(i).getBedrag() * alleOmschrijvingen.get(i).getAantal()) * (alleOmschrijvingen.get(i).getBtw() /100);
        }
        return btwBedrag;
    }

    public void templateMethod(){
        printFactuurCredentials();
        printOmschrijving(alleOmschrijvingen);
        printKosten();
    }



    abstract public void printFactuurCredentials();
    abstract public void printKosten();
    abstract protected void printOmschrijving(ArrayList<Omschrijving> alleOmschrijvingen);
}
