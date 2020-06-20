package com.exemple;

import com.exemple.business.*;

import java.util.ArrayList;
import java.util.List;

public class MyApp {

    public static void main(String[] args) {
        Deplacable voiture = new Voiture(3, "Renault");
        Deplacable camion = new Camion(2, "IVECO", 200);
        Deplacable humain = new Humain();

        List<Deplacable> deplacables = new ArrayList<>();
        deplacables.add(voiture);
        deplacables.add(camion);
        deplacables.add(humain);

        for (Deplacable deplacable: deplacables) {
            deplacable.seDeplace();
        }

        System.out.println("Salut");
    }

}
