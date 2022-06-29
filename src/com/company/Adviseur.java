package com.company;

abstract class Adviseur {
    String naam;
    TypeKosten kosten;
    Revieuw revieuw;

    public Adviseur(String naam, AdviseurFactory factory){
        this.naam = naam;
        this.kosten = factory.createKosten();
        this.revieuw = factory.createRevieuw();
    }

    public String getSamenStelling(){
        return "naam van adviseur: " + naam + " kosten: " + kosten.getKosten() + " revieuw: " +revieuw.getAantalSterren() ;
    }
}
