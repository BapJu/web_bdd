package com.example.web_bdd.entity;


import jakarta.persistence.*;



@Entity
@Table(name="personnes")
public class Personne {
    private @Id @GeneratedValue Long id;
    private String nom;
    private String email;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
