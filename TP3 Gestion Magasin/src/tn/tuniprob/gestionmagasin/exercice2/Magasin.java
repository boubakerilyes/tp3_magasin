package tn.tuniprob.gestionmagasin.exercice2;

import tn.tuniprob.gestionmagasin.Exercice1.Produit;

public class Magasin {
    public int identifiant;
    public String adresse;
    public int capacite=50;
    public Produit[] produits=new Produit[capacite];
    public int nombreDeProduit=0;

    public Magasin(int identifiant, String adresse) {
        this.identifiant = identifiant;
        this.adresse = adresse;


    }

    public Magasin() {

    }

    public void ajoutProduit(Produit produit){
        if(nombreDeProduit<=capacite){
            produits[nombreDeProduit]=produit;
            nombreDeProduit++;
        }else {
            System.out.println("le contene maximale de la magasin est 50");
        }
    }
    public void afficher(){
        System.out.println("identifiant de magasin est :"+identifiant
            +"\n Adresse :"+adresse
                +"\ncapacite :"+capacite
                +"\nLes produits de magasin sont:"
        );
        for (int i = 0; i < nombreDeProduit; i++) {
            System.out.println(
                    "le nom de la produit n°"+(i+1)+"est :"+produits[i].getLibelle()
                    +"\nle prix de la produit n°"+(i+1)+"est :"+produits[i].getPrix()

            );
        }
    }



}
