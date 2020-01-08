package singleton;

public class Personne {

	static void Personne() {

	}

	private String nom = "dupond";

	public Personne() {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Personne [nom=" + nom + "]";
	}

}
