package enumerate;

public enum Formation {
	java(500, "Paris"), python(500, "Marseille"), cpp, HTML(900);
	private int prix;
	private String lieu;

	/**
	 * @param prix
	 * @param lieu
	 */
	private Formation(int prix, String lieu) {
		this.prix = prix;
		this.lieu = lieu;
	}

	/**
	 * @return the lieu
	 */
	public String getLieu() {
		return lieu;
	}

	public int getPrix() {
		return prix;
	}

	private Formation(int prix) {
		this.prix = prix;
	}

	/**
	 * 
	 */
	private Formation() {
	}

	public String toString() {
		return "nom:" + name() + "Lieu: " + lieu + " prix:" + prix + "$";
	}

}
