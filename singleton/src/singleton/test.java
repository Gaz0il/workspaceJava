package singleton;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();

	}

	static void test1() {
		Personne p1 = new Personne();
		Personne p2 = new Personne();
		System.out.println(p1);
		System.out.println(p1);

	}

}
