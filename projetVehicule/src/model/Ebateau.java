package model;

public enum Ebateau {
	petit(2), moyen(10), grand(50);
	private int taille;

	/**
	 * @param taille
	 */
	private Ebateau(int taille) {
		this.taille = taille;
	}

	/**
	 * @param taille
	 */

}
