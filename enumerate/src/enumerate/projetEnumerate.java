package enumerate;

public class projetEnumerate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// testweek();
		// testgender();
		// testformation();
		testformationV2();
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
