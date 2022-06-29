package com.company;

public class BedrijfKlein implements BedrijfObserver, aantalGebruikers {
    String betaalOproep;
    String naam;
    int gebruikersAantal;


    public BedrijfKlein(String naam, int gebruikersAantal){
        this.naam = naam;
        this.gebruikersAantal = gebruikersAantal;
    }

    @Override
    public void herinneren(String betaalOproep){
        this.betaalOproep = betaalOproep;
        System.out.println("maandelijks te betalen bedrag van " + naam+ "is " + betaalOproep);
        System.out.println();
    }

    @Override
    public void aantalGebruikers(){
        System.out.println("er kunnen maximaal" + this.gebruikersAantal+ "gebruikers tegelijkertijd gebruik maken van de aplicatie in uw bedrijf");
        System.out.println();
    }
}
