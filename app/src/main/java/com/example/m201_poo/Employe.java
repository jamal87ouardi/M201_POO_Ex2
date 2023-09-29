package com.example.m201_poo;

public class Employe {
    private String cin;
    private double salaireBrut;

    public Employe(String cin, double salaireBrut) {
        this.cin = cin;
        this.salaireBrut = salaireBrut;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public double getSalaireBrut() {
        return salaireBrut;
    }

    public void setSalaireBrut(double salaireBrut) {
        this.salaireBrut = salaireBrut;
    }

    public double salaireNet() {

        double sn = (salaireBrut-2500)*0.85;
        return sn;
    }

    public void augmenter(double montant) {

        salaireBrut = salaireBrut + montant;
    }

}
