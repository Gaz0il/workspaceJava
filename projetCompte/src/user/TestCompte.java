package user;

import module.CompteSimple;

public class TestCompte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		test();

	}

	static void test() {
		CompteSimple c1 = new CompteSimple("Hassin");
		System.out.println(c1.toString());
	}
}
