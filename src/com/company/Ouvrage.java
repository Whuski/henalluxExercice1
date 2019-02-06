package com.company;

public class Ouvrage {
    public String titre;
    public int anneeEdition;
    public Editeur editeur;


    public Ouvrage(String titre, int anneeEdition, Editeur editeur) {
        this.titre = titre;
        this.anneeEdition = anneeEdition;
        this.editeur = editeur;
    }

    public String Categorie() {
        return "L'ouvrage";
    }

    @Override
    public String toString() {
        return this.Categorie() + this.anneeEdition + this.editeur;
    }
}
