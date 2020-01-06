package model;

public class PersonneV4 {
	private String nom;
	private String prenom;
	private int age;
	/**
	 * @param nom
	 * @param prenom
	 */
	public PersonneV4(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	/**
	 * @param nom
	 * @param prenom
	 * @param age
	 */
	public PersonneV4(String nom, String prenom, int age) {
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
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	@Override
	public String toString() {
		return "PersonneV4 [nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}

}
