package model;

public class Bateau extends Vehicule {
	Ebateau taille;

	/**
	 * @param marque
	 * @param prix
	 * @param taille
	 */
	public Bateau(String marque, int prix, Ebateau taille) {
		super(marque, prix);
		this.taille = taille;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */

	@Override
	public String avancer() {
		return "Je flotte";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Bateau [taille=" + taille + ", toString()=" + super.toString() + "]";
	}
}
