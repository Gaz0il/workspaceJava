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

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
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

	public int compareTo(Personne o) {
		Personne i = (Personne) o;
		if (this.age < i.age)
			return -1;

		if (this.age > i.age)
			return 1;

		return 0;
	}

}
