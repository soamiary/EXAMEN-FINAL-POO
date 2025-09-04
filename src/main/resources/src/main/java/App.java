package $org.example;

/**// =======================
// HistoriquePrix.java
// =======================
        package com.restaurant; // Déclare que la classe est dans le package com.restaurant

import java.time.Instant; // On utilise Instant pour représenter une date précise

public class HistoriquePrix {
    private double prix;             // Prix du plat
    private Instant dateChangement;  // Date à laquelle ce prix est entré en vigueur
    private String raison;           // La raison du changement (inflation, promo, etc.)

    // Constructeur
    public HistoriquePrix(double prix, Instant dateChangement, String raison) {
        this.prix = prix;
        this.dateChangement = dateChangement;
        this.raison = raison;
    }

    // Getters (accesseurs)
    public double getPrix() { return prix; }
    public Instant getDateChangement() { return dateChangement; }
    public String getRaison() { return raison; }
}


// =======================
// Plat.java
// =======================
package com.restaurant;

import java.time.Instant;
import java.util.*;

public class Plat {
    private int id;                            // Identifiant unique du plat
    private String nom;                        // Nom du plat (ex: Pizza)
    private List<HistoriquePrix> historiquePrix = new ArrayList<>(); // Historique des prix

    // Constructeur
    public Plat(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    // Ajouter un prix à l’historique avec sa date et la raison
    public void ajouterChangementPrix(double prix, Instant date, S

 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
