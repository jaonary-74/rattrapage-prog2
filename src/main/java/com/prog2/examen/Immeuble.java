package com.prog2.examen;

import java.util.ArrayList;
import java.util.List;

class Immeuble extends Endroit {
    private int nombreEtages;
    private List<Appartement> appartements;

    public Immeuble(String id, String nom, int nombreEtages) {
        super(id, nom);
        this.nombreEtages = nombreEtages;
        this.appartements = new ArrayList<>();
    }

    public void ajouterAppartement(Appartement appartement) {
        appartements.add(appartement);
    }

    @Override
    public int compterAppartements() {
        return appartements.size();
    }

    public boolean contientAppartement(Appartement appartement) {
        return appartements.contains(appartement);
    }
}
