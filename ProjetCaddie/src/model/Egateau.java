package model;

public enum Egateau {
	vanille(200), choco(2);

	private int prix;

	/**
	 * @param prix
	 */
	private Egateau(int prix) {
		this.prix = prix;
	}

	/**
	 * @return the prix
	 */
	public int getPrix() {
		return prix;
	}

}
