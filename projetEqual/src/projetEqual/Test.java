package projetEqual;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
	}

	static void test1() {
		Personn p1 = new Personn("aze", "poi", 52);
		Personn p2 = p1;
		Personn p3 = new Personn("aze", "poi", 52);
		Personn p4 = new Personn("aze", "poi", 52);
		System.out.println(p3.hashCode());
		System.out.println(p4.hashCode());

	}
}
