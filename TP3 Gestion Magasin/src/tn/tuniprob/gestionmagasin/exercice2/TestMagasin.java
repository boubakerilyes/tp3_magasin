package tn.tuniprob.gestionmagasin.exercice2;

import tn.tuniprob.gestionmagasin.Exercice1.Produit;

public class TestMagasin {
    public static void main(String[] args) {
        Produit p1=new Produit(1021,"Lait","delic",2.0);
        Produit p2=new Produit(2510,"Yaiurt","Vitalait",0.5);
        Produit p3=new Produit(3250,"Tomate","sucam",5);
        Magasin magasin=new Magasin(100," Monastir");
        magasin.ajoutProduit(p1);
        magasin.ajoutProduit(p3);
        magasin.ajoutProduit(p3);
        magasin.afficher();

        System.out.println("le nombre des produits de magasin  est "+magasin.nombreDeProduit);
    }
}
