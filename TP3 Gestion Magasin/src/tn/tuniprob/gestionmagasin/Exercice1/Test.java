package tn.tuniprob.gestionmagasin.Exercice1;
public class Test {
    public static void main(String[] args) {
        Produit p1=new Produit();
        Produit p2=new Produit(1021,"Lait","delic");
        Produit p3=new Produit(2510,"Yaiurt","Vitalait");
        Produit p4=new Produit(3250,"Tomate","sucam",1.2);
        p2.afficher();
        p3.afficher();
        p4.afficher();
        p2.setPrix(0.7);
        System.out.println("produit modifé");
        p2.afficher();
        p1.setIdentifiant(101);
        p1.setLibelle("Lait");
        p1.setMarque("delic");
        p1.setPrix(1.3);
        p1.afficher();
        p3.setPrix(1.1);
        p3.afficher();
        System.out.println("dd");
        System.out.println(p1.toString());
        System.out.println( p2.toString());
        System.out.println( p3.toString());
        System.out.println(p4.toString());
        p1.setDate(new Date(8,5,2023));
        p2.setDate(new Date(15,4,2023));
        p3.setDate(new Date(1,11,2023));
        p4.setDate(new Date(2,3,2023));
        System.out.println("le date de produit N°1 est");
        p1.getDate().affDate();
        System.out.println("le date de produit N°2 est");
        p2.getDate().affDate();
        System.out.println("le date de produit N°3 est");
        p3.getDate().affDate();
        System.out.println("le date de produit N°4 est");
        p4.getDate().affDate();
    }
}
