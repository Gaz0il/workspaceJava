package model;

public class InfoVoiture {
	private String matricule;
	private String marque;
	/**
	 * @param matricule
	 * @param marque
	 */
	public InfoVoiture(String matricule, String marque) {
		this.matricule = matricule;
		this.marque = marque;
	}
	/**
	 * @return the matricule
	 */
	public String getMatricule() {
		return matricule;
	}
	/**
	 * @return the marque
	 */
	public String getMarque() {
		return marque;
	}

}
