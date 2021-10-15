package carnetcontacts;

import carnetcontacts.adresse.AdresseFr;

public class App {
    public static void main(String[] args) {
        System.out.println("Wsh la zone");

        AdresseFr adresse_eu = new AdresseFr(20, "Boulevard des Freres lumiere",
                "Chasseneuil du poitou","86360");
        System.out.println(adresse_eu.getNomRue());
        System.out.println(adresse_eu.getNomVille());

        System.out.println(adresse_eu.toString());

    }
}