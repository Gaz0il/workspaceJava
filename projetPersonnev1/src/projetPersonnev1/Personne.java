package projetPersonnev1;

public class Personne {

	// attribut
	String nom;
	String prenom;
	int age;
	String status;
	int ageMineur=18;
	
	Personne(){
		
	}
	
	Personne(String nom, String prenom){
		this.nom=nom; // this. permet d'eviter les conflits de nommage
		this.prenom=prenom;
		
	}
	Personne(String nom, String prenom,int age){
		this.nom=nom; // this. permet d'eviter les conflits de nommage
		this.prenom=prenom;
		this.age=age;
	}

	String getInfo() {
		String reponse="Nom: "+nom;
		reponse+=" Prenom: "+prenom;
		reponse+=" Age: "+age;
		reponse+=" \nStatus: ";
		reponse+=(age<ageMineur)? " Mineur":" Majeur";
		return reponse;
	}

}
