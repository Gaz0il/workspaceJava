package user;

import model.Bateau;
import model.Ebateau;
import model.Vehicule;
import model.Velo;
import model.Voiture;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// test();
		// test2();
		// test3();
		// test4();
		// test6();
		test8();
	}

	static void test8() {
		Vehicule[] tab = { new Velo("scott", 200), new Voiture("fiat", 2000),
				new Bateau("ultramar", 2, Ebateau.grand) };
		for (Vehicule i : tab) {
			System.out.println(i.demarrer());
		}
	}

	static void test6() {
		Vehicule v4 = new Voiture("corvette", 100);
		testavancer(v4);
		Voiture v2 = new Voiture("BMW", 10);

		Vehicule v5 = new Velo("Scott", 1);
		testavancer(v5);
		Bateau v3 = new Bateau("Beneteau", 3, Ebateau.moyen);
	}

	static void testavancer(Vehicule v) {
		System.out.println(v.avancer());

	}

	static void test4() {
		Voiture v1 = new Voiture("corvette", 100);
		Voiture v2 = v1;
		Voiture v4 = (Voiture) v2;
		System.out.println(v1);
		System.out.println(v2);
	}

	static void test3() {

		Vehicule v4 = new Voiture("corvette", 100);
		Voiture v2 = new Voiture("BMW", 10);
		Vehicule v5 = new Velo("Scott", 1);
		Bateau v3 = new Bateau("Beneteau", 3, Ebateau.moyen);
		Vehicule[] tab = { v4, v2, v5, v3 };
		for (Vehicule v : tab)
			System.out.println(v.avancer());
		Object v6 = new Voiture("mustang", 999);

		System.out.println(v6.toString());

		Object v7 = new Bateau("popo", 7, Ebateau.grand);
		System.out.println(v7);
		Vehicule v9 = v2;

	}

	static void test2() {
		Vehicule v4 = new Voiture("corvette", 100);
		Voiture v2 = new Voiture("BMW", 10);
		Vehicule v5 = new Velo("Scoot", 1);
		System.out.println(v5.avancer());

	}

	static void test() {
		Velo v = new Velo("toto", 120);
		Voiture v2 = new Voiture("BMW", 10);
		Bateau v3 = new Bateau("Beneteau", 3, Ebateau.moyen);

		System.out.println(v);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v3.avancer());
		System.out.println(v.avancer());
		System.out.println(v2.avancer());
		v2.setGps(true);
		System.out.println(v2.isGps());

	}
}
