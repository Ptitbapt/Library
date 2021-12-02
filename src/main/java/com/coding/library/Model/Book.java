package com.coding.library.Model;

import javafx.beans.property.SimpleStringProperty;

public class Book {
    private SimpleStringProperty titre;
    private SimpleStringProperty auteur;
    private SimpleStringProperty colonne;
    private SimpleStringProperty rangee;
    private SimpleStringProperty parution;
    private SimpleStringProperty resume;

    public String getTitre() {
        return titre.get();
    }

    public SimpleStringProperty titreProperty() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre.set(titre);
    }

    public String getAuteur() {
        return auteur.get();
    }

    public SimpleStringProperty auteurProperty() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur.set(auteur);
    }

    public String getColonne() {
        return colonne.get();
    }

    public SimpleStringProperty colonneProperty() {
        return colonne;
    }

    public void setColonne(String colonne) {
        this.colonne.set(colonne);
    }

    public String getRangee() {
        return rangee.get();
    }

    public SimpleStringProperty rangeeProperty() {
        return rangee;
    }

    public void setRangee(String rangee) {
        this.rangee.set(rangee);
    }

    public String getParution() {
        return parution.get();
    }

    public SimpleStringProperty parutionProperty() {
        return parution;
    }

    public void setParution(String parution) {
        this.parution.set(parution);
    }

    public String getResume() {
        return resume.get();
    }

    public SimpleStringProperty resumeProperty() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume.set(resume);
    }

    public Book(String titre, String auteur, String colonne, String rangee, String parution, String resume) {
        this.titre = new SimpleStringProperty(titre);
        this.auteur = new SimpleStringProperty(auteur);
        this.colonne = new SimpleStringProperty(colonne);
        this.rangee = new SimpleStringProperty(rangee);
        this.parution = new SimpleStringProperty(parution);
        this.resume = new SimpleStringProperty(resume);
    }
}
