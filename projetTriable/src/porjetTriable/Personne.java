package porjetTriable;

public class Personne implements Comparable<Personne> {
	private String nom;
	private String prenom;
	private int age;

	/**
	 * @param nom
	 * @param prenom
	 * @param age
	 */
	public Personne(String nom, String prenom, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}

	public int compareTo(Personne nom) {
		return this.nom.compareTo(nom.nom);
	}

}
