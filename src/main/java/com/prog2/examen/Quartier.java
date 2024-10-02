package com.prog2.examen;

import java.util.ArrayList;
import java.util.List;

class Quartier extends Endroit {
    private List<Immeuble> immeubles;

    public Quartier(String id, String nom) {
        super(id, nom);
        this.immeubles = new ArrayList<>();
    }

    public void ajouterImmeuble(Immeuble immeuble) {
        immeubles.add(immeuble);
    }

    @Override
    public int compterAppartements() {
        int total = 0;
        for (Immeuble immeuble : immeubles) {
            total += immeuble.compterAppartements();
        }
        return total;
    }

    public boolean contientAppartement(Appartement appartement) {
        for (Immeuble immeuble : immeubles) {
            if (immeuble.contientAppartement(appartement)) {
                return true;
            }
        }
        return false;
    }
}

