package com.exemple.business;

public class Voiture extends Vehicule {

    public Voiture() {

    }

    public Voiture(int nbPortes, String marque) {
        super(nbPortes, marque);
    }

    @Override
    public void seDeplace() {
        System.out.println("Voiture se déplace");
    }

    @Override
    public String toString() {
        return "Je suis" + getMarque() + " avec " + getNbPortes() + " portes";
    }
}
