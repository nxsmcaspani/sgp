package com.example.sgp;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Collaborateur {
    private String matricule;
    private String nom ;
    private String prenom ;
    private LocalDate dateDeNaissance;
    private String Adresse;
    private String numeroSecu;
    private String emailPro ;
    private String photo ;
    private ZonedDateTime dateHeureCreation ;
    private Boolean actif;

    public Collaborateur(String nom, String prenom, LocalDate dateDeNaissance, String adresse, String numeroSecu) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
        this.Adresse = adresse;
        this.numeroSecu = numeroSecu;
        this.dateHeureCreation = ZonedDateTime.now();
        this.matricule = DateTimeFormatter.ofPattern("yMdHmsS").format(ZonedDateTime.now());
        this.actif = true;
        this.emailPro = prenom+"."+nom+"@sgp.wcs";
        this.photo = "https://i.pinimg.com/originals/ac/a3/27/aca3270e1bfcb034363463172320f63c.png";
    }

    public String getNom() {
        return this.nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public LocalDate getDateDeNaissance() {
        return this.dateDeNaissance;
    }

    public String getAdresse() {
        return this.Adresse;
    }

    public String getNumeroSecu() {
        return this.numeroSecu;
    }

    public String getPhoto() {
        return this.photo;
    }

    public String getMatricule() {
        return matricule;
    }
}
