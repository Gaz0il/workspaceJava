package model;

public class PersonneV8 {
	private String nom;
	private String prenom;
	private Adress adresse;

	/**
	 * @param nom
	 * @param prenom
	 */
	public PersonneV8(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String response= "PersonneV5 nom=" + nom + ", prenom=" + prenom; 
		
		return response;
	}
	/**
	 * @return the adresse
	 */
	public Adress getAdresse() {
		return adresse;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(Adress adresse) {
		this.adresse = adresse;
	}
	

	
}

