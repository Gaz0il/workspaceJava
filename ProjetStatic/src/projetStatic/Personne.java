package projetStatic;

public class Personne {
	private static String nom = "Hassin";
	private String prenom;
	private static final int ageMin = 0;
	private static int compteur;

	/**
	 * @param nom
	 * @param prenom
	 */

	public Personne(String prenom) {
		this.prenom = prenom;
		compteur++;
	}

	/**
	 * @return the compteur
	 */
	public static int getCompteur() {
		return compteur;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + "]";
	}

	/**
	 * @param prenom
	 *            the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @param nom
	 *            the nom to set
	 */
	public static void setNom(String nom) {
		Personne.nom = nom;
	}

}
