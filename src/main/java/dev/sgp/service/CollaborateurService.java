package dev.sgp.service;

import java.util.ArrayList;
import java.util.List;

import dev.sgp.entite.Collaborateur;

public class CollaborateurService {
	private List<Collaborateur> listeCollaborateur = new ArrayList<>();

	public List<Collaborateur> listerCollaborateurs() {
		return listeCollaborateur;
	}

	public void sauvegarderCollaborateur(Collaborateur collab) {
		this.listeCollaborateur.add(collab);
	}
}
