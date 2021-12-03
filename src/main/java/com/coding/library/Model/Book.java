package com.coding.library.Model;



public class Book {
    private String Titre;
    private String Auteur;
    private int Colonne;
    private int Rangee;
    private int Parution;
    private String Resume;

    public Book(String titre, String auteur, int colonne, int rangee, int parution, String resume) {
        Titre = titre;
        Auteur = auteur;
        Colonne = colonne;
        Rangee = rangee;
        Parution = parution;
        Resume = resume;
    }

    public String getTitre() {
        return Titre;
    }

    public void setTitre(String titre) {
        Titre = titre;
    }

    public String getAuteur() {
        return Auteur;
    }

    public void setAuteur(String auteur) {
        Auteur = auteur;
    }

    public int getColonne() {
        return Colonne;
    }

    public void setColonne(int colonne) {
        Colonne = colonne;
    }

    public int getRangee() {
        return Rangee;
    }

    public void setRangee(int rangee) {
        Rangee = rangee;
    }

    public int getParution() {
        return Parution;
    }

    public void setParution(int parution) {
        Parution = parution;
    }

    public String getResume() {
        return Resume;
    }

    public void setResume(String resume) {
        Resume = resume;
    }
}