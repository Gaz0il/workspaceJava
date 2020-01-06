package projetPersonneV3;

public class Personne {

	// attribut
	private String nom;
	private String prenom;
	private int age;
	private final int ageMin=0;
	private final int ageMax=120;
	//private String status;
	//private int ageMineur=18;
	
	public Personne(){
		
	}
	
	public Personne(String nom, String prenom){
		//this.nom=nom; // this. permet d'eviter les conflits de nommage
		setNom(nom);
		this.prenom=prenom;
		
	}
	public Personne(String nom, String prenom,int age){
		//this.nom=nom; // this. permet d'eviter les conflits de nommage
		setNom(nom);
		this.prenom=prenom;
		setAge(age);
	}
	public void setAge (int age){
		if (age>ageMin&&age<ageMax && this.age< age)
		this.age=age;
	
	}
	public String toString() {
		String reponse="Nom: "+getNom();
		reponse+=" Prenom: "+prenom;
		reponse+=" Age: "+age;
		//reponse+=" \nStatus: ";
		//reponse+=(age<ageMineur)? " Mineur":" Majeur";
		return reponse;
	}
	public String getPrenom() {
		return prenom.toLowerCase();
	}
	public int getAge(){
		return age;
	}
		public String getNom(){
			return nom.toUpperCase();
	}
		public void setNom (String nom){
			if(!nom.isEmpty())
			this.nom=nom;
		
		}


}
