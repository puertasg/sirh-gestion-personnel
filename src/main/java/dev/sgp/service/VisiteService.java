package dev.sgp.service;

import java.util.ArrayList;
import java.util.List;

import dev.sgp.entite.VisiteWeb;

public class VisiteService {
	private List<VisiteWeb> listeVisites = new ArrayList<>();

	public List<VisiteWeb> listerVistes() {
		return listeVisites;
	}

	public void sauvegarderVisite(VisiteWeb visite) {
		this.listeVisites.add(visite);
	}
}