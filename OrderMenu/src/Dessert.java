
public enum Dessert {
	sang(60), rizAuLaid(50), fruit(500);
	private int prix;

	/**
	 * @param prix
	 */
	private Dessert(int prix) {
		this.prix = prix;
	}

	public String toString() {
		return "Dessert: " + name() + "prix: " + prix;
	}
}
