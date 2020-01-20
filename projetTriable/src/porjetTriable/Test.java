package porjetTriable;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test2();

	}

	static void test2() {
		Article[] tab = { new Article("xx", 12), new Article("aa", 1249), new Article("tt", 125),
				new Article("qq", 1255) };
		for (Article t : tab)
			System.out.println(t);
		Arrays.sort(tab, new ComparePrix());
		System.out.println("**************");
		for (Article t : tab)
			System.out.println(t);
	}

	static void test4() {
		Article[] tab = { new Article("xx", 12), new Article("aa", 124), new Article("tt", 125),
				new Article("qq", 1255) };
		for (Article t : tab)
			System.out.println(t);
		Arrays.sort(tab, new CompareMarc());
		System.out.println("**************");
		for (Article t : tab)
			System.out.println(t);
	}

	static void test3() {
		Personne[] p = { new Personne("popo", "mop", 102), new Personne("mlkj", "qsdd", -93),
				new Personne("mlk", "cde", -10) };
		affiche(p);
		Arrays.sort(p);
		affiche(p);

	}

	static void test() {
		int[] t = { 2, 3, 4, 8, 6, 4, 5, 9, 2 };
		affiche(t);
	}

	static void affiche(int[] t) {
		for (int e : t)
			System.out.println(e + "\t");
		System.out.println();

	}

	static void affiche(String[] s) {
		for (String e : s)
			System.out.println(e + "\t");
		System.out.println();

	}

	static void affiche(Personne[] p) {
		for (Personne e : p)
			System.out.println(e + "\t");
		System.out.println();

	}
}
