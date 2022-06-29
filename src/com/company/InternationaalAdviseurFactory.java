package com.company;

public class InternationaalAdviseurFactory extends AdviseurFactory{
    @Override
    public Revieuw createRevieuw() {
        return new ExcelentRevieuw();
    }

    @Override
    public TypeKosten createKosten() {
        return new Duur();
    }
}
