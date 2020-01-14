package user;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
	}

	static void test() {

	}

	static void test1() {
		A a1 = new A();
		a1.m1();
		a1.mA();

		I1 a2 = a1;
		I2 a3 = a1;
		a2.m1();
		a3.m2();
	}

}
