package projetStatic;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// test();
		// test2();
		// test3();
		test4();

	}

	static void test4() {
		Personne p1 = new Personne("toto");
		Personne p2 = new Personne("toto");
		new Personne("jean");
		new Personne("alf");
		System.out.println(Personne.getCompteur());

	}

	static void test3() {
		Personne p1 = new Personne("Marc");
		Personne p2 = new Personne("Marc");
		System.out.println(p1);
		System.out.println(p2);
		p1.setPrenom("JeanMarc");
		System.out.println(p1);
		System.out.println(p2);
		Personne.setNom("Brown");
		System.out.println(p1);
		System.out.println(p2);

	}

	private static void test2() {
		double res;
		res = Traitement.calcul(2, 2, "add");
		System.out.println(res);

	}

	private static void test() {
		A.m1();
		A a = new A();
		a.m3();

	}

}
