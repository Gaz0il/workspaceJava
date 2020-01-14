package model;

public abstract class Vehicule {
	private String marque;
	private int prix;

	/**
	 * @param marque
	 * @param prix
	 */
	public Vehicule(String marque, int prix) {
		this.marque = marque;
		this.prix = prix;
	}

	public String avancer() {
		return "Je roule";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Vehicule [marque=" + marque + ", prix=" + prix + "]";
	}

	public abstract String demarrer();

}
