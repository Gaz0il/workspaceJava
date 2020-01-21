package model;

public class Gateau extends Article {
	private Egateau Egateau;

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Gateau [Egateau=" + Egateau + ", nom=" + nom + ", prix=" + prix + "]";
	}

	/**
	 * @param nom
	 * @param prix
	 * @param egateau
	 */
	public Gateau(String nom, model.Egateau egateau) {
		super(nom);
		Egateau = egateau;
		this.prix = egateau.getPrix();

	}

	/**
	 * @param egateau
	 */

}
