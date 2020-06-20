package com.exemple.business;

public class Camion extends Vehicule {

    private int volumeBenne;

    public Camion() {

    }

    public Camion(int nbPortes, String marque, int volumeBenne) {
        super(nbPortes, marque);
    }

    public int getVolumeBenne() {
        return volumeBenne;
    }

    public void setVolumeBenne(int volumeBenne) {
        this.volumeBenne = volumeBenne;
    }

    @Override
    public void seDeplace() {
        System.out.println("Camion se déplace");
    }

    @Override
    public String toString() {
        return "Je suis un camion " + getMarque() + " avec " + getNbPortes() + " portes";
    }
}
