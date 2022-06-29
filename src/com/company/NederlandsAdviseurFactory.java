package com.company;

public class NederlandsAdviseurFactory extends AdviseurFactory{
    @Override
    public Revieuw createRevieuw() {
        return new GemiddeldRevieuw();
    }

    @Override
    public TypeKosten createKosten() {
        return new Goedkoop();
    }
}
