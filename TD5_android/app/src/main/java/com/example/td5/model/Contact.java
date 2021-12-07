package com.example.td5.model;

public class Contact {

    public String nom;
    public String prenom;
    public String imageURL;

    public Contact(String nom, String prenom, String imageURL) {
        this.nom = nom;
        this.prenom = prenom;
        this.imageURL = imageURL;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getImageURL(){
        return imageURL;
    }

}
