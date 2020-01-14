package modul;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
	}

	static void test() {
		Traitement<Personne> t = new Traitement<Personne>();
		Personne p = new Personne("aa", "pp");
		t.setA(p);
		Personne p2 = t.getA();

		Traitement<Integer> t2 = new Traitement<Integer>();
		t2.setA(10);

	}

	static void test3() {

		Personne p = new Personne("aa", "bb");
		Traitement t3 = new Traitement();
		t3.setA(p);
		Personne p2 = (Personne) t3.getA();
		System.out.println(t3.getA());
		System.out.println(p2.getNom());

	}

	static void test2() {
		Traitement t = new Traitement();
		t.setA(10);
		System.out.println(t.getA());

		Traitement t1 = new Traitement();
		t.setA("toto");
		System.out.println(t1.getA());

		Personne p = new Personne("aa", "bb");
		Traitement t3 = new Traitement();
		t3.setA(p);
		System.out.println(t3.getA());
	}
}
