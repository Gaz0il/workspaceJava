package tpTableau;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// testint();
		// testStringv1();

		// testcalcul();
		// testdoublertableauv2();

		// tpOccurence();

		// tpReverse();
		// tpTestsplit();
		tpTraintementtext();
	}

	static void tpTraintementtext() {
		System.out.println("Insert text");
		Scanner clavier = new Scanner(System.in);
		String text = clavier.nextLine();
		String txet = traitementText(text);
		System.out.println("New text: " + txet);

	}

	static String traitementText(String x) {
		// String [] tab=new String [o];
		String y = x.toUpperCase();
		String sepa = " ";
		String[] tab = y.split(sepa);
		//affichetableau(tab);
		int i = 0;
		for (String s : tab)
			i++;//System.out.println(i);
		String[] h = new String[tab.length];
		int curseur = tab.length - 1;
		for (int p = 0; p < tab.length; p++)
			h[curseur--] = tab[p];
		String txet = "";
		int w = 0;
		for (String m : h) {
			txet = txet + " " + m;
			w++;//System.out.println(w);
		}
		;

		return txet;

	}

	static void tpTestsplit() {
		String sepa = ";";
		String str = "aa;bb; ppp ooo po";
		String[] tab = str.split(sepa);
		for (String s : tab)
			System.out.println(s);
	}

	static void tpReverse() {
		int[] tab1 = { 10, 20, 30, 40 };
		int[] tab2 = reverse(tab1);
		affichetableau(tab1);
		affichetableau(tab2);

	}

	static int[] reverse(int[] x) {
		int[] y = new int[x.length];
		int curseur = x.length - 1;
		for (int i = 0; i < x.length; i++)
			y[curseur--] = x[i];
		return y;

	}

	static void tpOccurence() {
		int[] tab = { 1, 2, 5, 8, 2, 2, 1 };
		System.out.println("choisir un chiffre dans la liste");
		affichetableau(tab);
		Scanner clavier = new Scanner(System.in);
		int x = clavier.nextInt();
		int compteur = occurence(x, tab);
		System.out.println("le chiffre apparait " + compteur + " fois");

	}

	static int occurence(int x, int[] y) {
		int j = 0;
		for (int i = 0; i < y.length; i++)
			if (x == y[i])
				j++;
		return j;
	}

	static void testdoublertableauv2() {
		int[] tab1 = { 10, 20, 30, 40, 50 };
		affichetableau(tab1);
		doublertableauv2(tab1);
		affichetableau(tab1);

	}

	static void doublertableauv2(int[] x) {
		for (int i = 0; i < x.length; i++)
			x[i] *= 2;

	};

	static int[] doublertableau(int[] x) {
		int[] res = new int[x.length];
		for (int i = 0; i < x.length; i++)
			res[i] = x[i] * 2;
		return res;
	};

	static void testcalcul() {
		int y = 10;
		int x = 5;
		int[] res = calcul(y, x);
		System.out.println(x + "\t" + y);
		System.out.println(res[0] + "\t" + res[1]);

	}

	static int[] calcul(int a, int b) {
		int[] tab = new int[2];
		tab[0] = a + b;
		tab[1] = a - b;
		return tab;
	}

	static void testaffichetableau() {
		int[] tab1 = { 10, 20, 30, };
		String[] tab2 = { "hjh", "gfyfyf", "hgugu" };
		affichetableau(tab1);
		affichetableau(tab2);
	}

	static void affichetableau(int[] x) {
		for (int e : x)
			System.out.print(e + "\t");
		System.out.println();
	}

	static void affichetableau(String[] x) {
		for (String e : x)
			System.out.print(e + "\t");
		System.out.println();
	}

	static void testStringv1() {
		String[] tab = { "aa", "bb", null, "cccc" };
		for (int i = 0; i < tab.length; i++)
			if (tab[i] != null)
				System.out.println(tab[i].toUpperCase());
	}

	static void testint() {
		int[] tab = new int[3];
		tab[0] = 10;
		tab[2] = 100;
		for (int i = 0; i < tab.length; i++)
			System.out.println(tab[i]);
	}

}
