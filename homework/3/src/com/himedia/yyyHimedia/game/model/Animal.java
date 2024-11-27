package com.himedia.yyyHimedia.game.model;

public abstract class Animal {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
    @Override
    public String toString() {
        return name;
    }


    public abstract void eat ();
    public abstract void wash ();

    public abstract void sleep ();

    public abstract void play ();

}
