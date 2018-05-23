package dev.sgp.entite;

public class VisiteWeb {
	private int id;
	private String chemin;
	private int tempsExecution;

	public VisiteWeb(int i, String c, int tpsExe) {
		this.id = i;
		this.chemin = c;
		this.tempsExecution = tpsExe;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getChemin() {
		return chemin;
	}

	public void setChemin(String chemin) {
		this.chemin = chemin;
	}

	public int getTempsExecution() {
		return tempsExecution;
	}

	public void setTempsExecution(int tempsExecution) {
		this.tempsExecution = tempsExecution;
	}
}
