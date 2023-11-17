package tn.tuniprob.gestionmagasin.Exercice1;

public class Date {
    int j,m,a;

    public Date(int j, int m, int a) {
        this.j = j;
        this.m = m;
        this.a = a;
    }

    public Date() {
    }

    public void affDate(){
        System.out.println(j+"/"+m+"/"+a);
    }

}
