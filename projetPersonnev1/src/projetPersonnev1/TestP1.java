package projetPersonnev1;

public class TestP1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
	}

	static void test1() {
		Personne p = new Personne();
		p.nom = "Hassin";
		p.prenom = "Marc";
		System.out.println(p.getInfo());
	}
}
