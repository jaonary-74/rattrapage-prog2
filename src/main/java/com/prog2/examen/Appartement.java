package com.prog2.examen;

class Appartement {
    private String id;
    private String titre;
    private String description;
    private double loyerMensuel;
    private Statut statut;
    private Endroit endroit;

    public Appartement(String id, String titre, String description, double loyerMensuel, Statut statut, Endroit endroit) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.loyerMensuel = loyerMensuel;
        this.statut = statut;
        this.endroit = endroit;
    }

    public String getId() {
        return id;
    }

    public Endroit getEndroit() {
        return endroit;
    }
}

