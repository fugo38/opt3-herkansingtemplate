package com.company;

public class Zzp implements BedrijfObserver{
    String betaalOproep;
    String naam;


    public Zzp(String naam){
        this.naam = naam;
    }

    @Override
    public void herinneren(String betaalOproep){
        this.betaalOproep = betaalOproep;
        System.out.println("maandelijks te betalen bedrag van " + naam+ "is " + betaalOproep);
        System.out.println();
    }
}
