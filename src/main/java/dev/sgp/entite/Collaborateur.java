package dev.sgp.entite;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Collaborateur {
	private String matricule;
	private String nom;
	private String prenom;
	private LocalDate dateNaissance;
	private String adresse;
	private String noSecu;
	private String emailPro;
	private String photo;
	private ZonedDateTime dateHeureCreation;
	private boolean actif;

	public Collaborateur(String n, String p, LocalDate dN, String a, String noS, String em) {
		this.matricule = "random";
		this.nom = n;
		this.prenom = p;
		this.dateNaissance = dN;
		this.adresse = a;
		this.noSecu = noS;
		this.emailPro = em;
		this.photo = "default-profile.png";
		this.dateHeureCreation = ZonedDateTime.now();
		this.actif = true;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
}
