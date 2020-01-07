package model;

public class PersonneV6 {
	private String nom;
	private String prenom;
	private Adress adresse;
	private Info info;
	
	/**
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param info
	 */
	public PersonneV6(String nom, String prenom, Adress adresse, int poids, double taille) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.info = new Info(poids,taille);
	}
	/**
	 * @param nom
	 * @param prenom
	 * @param info
	 */
	public PersonneV6(String nom, String prenom, int poids, double taille) {
		this.nom = nom;
		this.prenom = prenom;
		this.info = new Info(poids,taille);
	}
	/**
	 * @param nom
	 * @param prenom
	 * @param adresse
	 */
	public PersonneV6(String nom, String prenom, Adress adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}
	/**
	 * @param nom
	 * @param prenom
	 */
	public PersonneV6(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
	String response= "PersonneV6 [nom=" + nom + ", prenom=" + prenom; 
		response+=(adresse!=null)? "\nadresse"+adresse : "";
		response+=", info=" + info + "]";
		return response;
	}
	/**
	 * @return the adresse
	 */
	public Adress getAdresse() {
		return adresse;
	}
	/**
	 * @return the info
	 */
	public Info getInfo() {
		return info;
	}

	
}

