package projetPersonnev1;

public class TestP1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		test3();
	}

	static void test3() {
		Personne x=new Personne("JeanMarc","Hassin",89);
		Personne [] tab={new Personne(),
				new Personne("aa","bb"),
				new Personne("aa","ll",24),x};
		for (Personne p: tab)
			System.out.println(p.getInfo()+"\r--------");
		}
	static void test1() {
		Personne p = new Personne();
		p.nom = "Hassin";
		p.prenom = "Marc";
		p.age=10;
		System.out.println(p.getInfo());
	}
}
