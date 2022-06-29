package com.company;

import java.util.ArrayList;

public class Observer {
    private String betaalOproep;
    private int aantalLeden;
    private ArrayList<BedrijfObserver> listeners;

    void setListeners(){
        listeners = new ArrayList<BedrijfObserver>();
        listeners.add(new BedrijfKlein("test", 3));
        listeners.add(new BedrijfGroot("Mediamarkt", 5));
        listeners.add(new BedrijfMid("bol.com", 7));
    }

    public void herinneringObservers(){
        for(BedrijfObserver observer: listeners){
            observer.herinneren(this.betaalOproep);
        }
    }

    void setBetaalOproep(String betaalOproep){
        this.betaalOproep = betaalOproep;
        herinneringObservers();
    }

}

