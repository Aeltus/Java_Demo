package com.exemple.business;

public abstract class Vehicule implements Deplacable {

    private int nbPortes;
    private String marque;

    public Vehicule() {
    }

    public Vehicule(int nbPortes, String marque) {
        this.nbPortes = nbPortes;
        this.marque = marque;
    }

    public int getNbPortes() {
        return nbPortes;
    }

    public void setNbPortes(int nbPortes) {
        this.nbPortes = nbPortes;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque.substring(0, 1).toUpperCase() + marque.substring(1).toLowerCase();
    }

    @Override
    public abstract void seDeplace();
}
