package com.example.m201_poo;

public class TestEmploye {
    public static void main(String[] args) {
        //Créer un objet employé e1
        Employe e1 = new Employe("ZT230",8000);

        // calculer salaire Net de e1
        System.out.println(e1.salaireNet());

        //augmenter e1
        e1.augmenter(2500);

        // Réafficher salaire Net de e1
        System.out.println(e1.salaireNet());

    }
}
