package com.prog2.examen;

public class Main {
	public static void main(String[] args) {
		Quartier quartier = new Quartier("Q1", "Analamahitsy");

		Immeuble immeuble = new Immeuble("I1", "Jade", 5);
		quartier.ajouterImmeuble(immeuble);

		Appartement appartement1 = new Appartement("1", "Trano tsinjo 1", "Trano mora", 200.000, Statut.LIBRE, immeuble);
		Appartement appartement2 = new Appartement("2", "Trano tsinjo 2", "Trano lafo", 500.000, Statut.EN_COURS_DE_LIBERATION, immeuble);

		immeuble.ajouterAppartement(appartement1);
		immeuble.ajouterAppartement(appartement2);

		System.out.println("Nombre total d'appartements dans le quartier : " + quartier.compterAppartements());

		System.out.println("Le quartier Trano tsinjo 1 : " + quartier.contientAppartement(appartement1));
		System.out.println("Le quartier Trano tsinjo 2 : " + quartier.contientAppartement(appartement2));
	}
}
