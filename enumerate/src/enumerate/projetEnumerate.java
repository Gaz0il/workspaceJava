package enumerate;

import java.util.Scanner;

public class projetEnumerate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// testweek();
		// testgender();
		// testformation();
		// testformationV2();
		// testformationV4();
		testformationV5();
	}

	static void testformationV5() {
		Scanner sc = new Scanner(System.in);
		Formation[] tab = Formation.values();
		System.out.println("choisis ta formation");
		for (Formation f : tab)
			System.out.print(f.name() + "\n");
		String choix = sc.nextLine();
		Formation c = Formation.valueOf(choix);
		System.out.println(c);
	}

	static void testformationV4() {
		Formation f = Formation.python;
		System.out.println(f.name());
		System.out.println(f.toString());

	}

	static void testformationV2() {
		Formation f = Formation.python;
		System.out.println(f.name());
		System.out.println(f.getPrix());
		System.out.println(Formation.python.getLieu() + " " + Formation.python.getPrix() + "$");
	}

	static void testformation() {
		System.out.println(Formation.java);
		Formation f = Formation.python;
		System.out.println(f.name());
		System.out.println(f.toString());
	}

	static void testgender() {
		System.out.println(Gender.Mister);
	}

	static void testweek() {
		System.out.println(Weekly.lundi);
	}
}
