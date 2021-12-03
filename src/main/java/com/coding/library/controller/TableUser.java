package com.coding.library.controller;

public class TableUser {
    private String colonnetitre;
    private String colonneauteur;
    private int colonnecolonne;
    private int colonnerangee;
    private int colonneparution;
    private String colonneresume;

    public String getColonnetitre() {
        return colonnetitre;
    }

    public void setColonnetitre(String colonnetitre) {
        this.colonnetitre = colonnetitre;
    }

    public String getColonneauteur() {
        return colonneauteur;
    }

    public void setColonneauteur(String colonneauteur) {
        this.colonneauteur = colonneauteur;
    }

    public int getColonnecolonne() {
        return colonnecolonne;
    }

    public void setColonnecolonne(int colonnecolonne) {
        this.colonnecolonne = colonnecolonne;
    }

    public int getColonnerangee() {
        return colonnerangee;
    }

    public void setColonnerangee(int colonnerangee) {
        this.colonnerangee = colonnerangee;
    }

    public int getColonneparution() {
        return colonneparution;
    }

    public void setColonneparution(int colonneparution) {
        this.colonneparution = colonneparution;
    }

    public String getColonneresume() {
        return colonneresume;
    }

    public void setColonneresume(String colonneresume) {
        this.colonneresume = colonneresume;
    }

    public TableUser(String colonnetitre, String colonneauteur, int colonnecolonne, int colonnerangee, int colonneparution, String colonneresume) {
        this.colonnetitre = colonnetitre;
        this.colonneauteur = colonneauteur;
        this.colonnecolonne = colonnecolonne;
        this.colonnerangee = colonnerangee;
        this.colonneparution = colonneparution;
        this.colonneresume = colonneresume;
    }

}
