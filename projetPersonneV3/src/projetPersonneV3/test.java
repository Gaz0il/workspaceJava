package projetPersonneV3;


import projetPersonneV3.Personne;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		test1();
	}

	static void test1() {
		Personne p = new Personne("Marc","Hassin",9);
		p.setAge(10);
		System.out.println("Nouvel age: "+p.getAge());
		p.setNom("Pablo");
		System.out.println("Nouveau Nom: "+p.getNom());
		p.setNom("");
		System.out.println("Nouveau Nom: "+p.getNom());
		System.out.println("Prenom: "+p.getPrenom());
		
		
		
	}
	
}