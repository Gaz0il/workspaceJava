package model;

public class PersonneV7 {
	private int id;
	private String nom;
	private String prenom;
	private int age;

	/**
	 * @param nom
	 * @param prenom
	 * @param age
	 */
	public PersonneV7(int is,String nom, String prenom, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}

	@Override
	public String toString() {
		return "PersonneV4 [nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}

}
