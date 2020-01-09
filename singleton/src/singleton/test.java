package singleton;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();

	}

	static void test1() {
		Personne p1 = Personne.getInstance();
		System.out.println(p1);

	}

}
