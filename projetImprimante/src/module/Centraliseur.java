package module;

public final class Centraliseur {
	private static Centraliseur instance;
	private Imprimante[] tab = { new Imprimante(1), new Imprimante(2) };
	private boolean b;

	/**
	 * @param tab
	 */
	private Centraliseur() {
	}

	public static Centraliseur guetInstance() {
		if (instance == null) {
			instance = new Centraliseur();
		}
		;
		return instance;
	}

	public void print(String message) {
		if (b) {
			tab[0].print(message);
		} else {
			tab[1].print(message);
		}
		b = !b;
	}

}
