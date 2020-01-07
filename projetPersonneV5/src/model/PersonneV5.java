package model;

public class PersonneV5 {
	private String nom;
	private String prenom;
	private Adress adresse;
	/**
	 * @param nom
	 * @param prenom
	 * @param adresse
	 */
	public PersonneV5(String nom, String prenom, Adress adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}
	/**
	 * @param nom
	 * @param prenom
	 */
	public PersonneV5(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String response= "PersonneV5 nom=" + nom + ", prenom=" + prenom; 
		response+=(adresse!=null)? "\nadresse"+adresse : "";
		return response;
	}
	/**
	 * @return the adresse
	 */
	public Adress getAdresse() {
		return adresse;
	}

	
}

