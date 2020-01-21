package projetCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// test();
		testhashmap();
	}

	static void testhashmap() {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		HashMap<String, String> alll = new HashMap<String, String>();
		alll.put("pp", "pp");
		alll.put("pjjp", "pap");
		alll.put("pp", "pp");
		alll.put("pjjjp", "pqqsp");
		Set<String> cle = alll.keySet();
		System.out.println("choisir" + cle);
		String resultat = alll.get(n);
		System.out.println(n + "       " + resultat);

	}

	static void test() {
		LinkedList<Personne> alll = new LinkedList<Personne>();
		alll.add(new Personne("pp", "pp"));
		alll.add(new Personne("pjjp", "pap"));
		alll.add(new Personne("pp", "pp"));
		alll.add(new Personne("pjjjp", "pqqsp"));
		alll.add(new Personne("pyp", "pdcp"));
		System.out.println(alll);
		Personne nom1 = alll.peekLast();
		System.out.println(nom1);
		Personne nom2 = alll.pollLast();
		System.out.println(alll);

	}

	static void test1() {
		ArrayList<Integer> all = new ArrayList<Integer>();
		all.add(10);
		all.add(20);
		all.add(30);
		all.add(40);
		all.add(50);
		all.add(60);
		// for (int e : all) {
		// System.out.println(e);
		// }
		ArrayList<Personne> alll = new ArrayList<Personne>(150);
		alll.add(new Personne("pp", "pp"));
		alll.add(new Personne("pjjp", "pap"));
		alll.add(new Personne("pp", "pp"));
		alll.add(new Personne("pjjjp", "pqqsp"));
		alll.add(new Personne("pyp", "pdcp"));
		alll.add(new Personne("hhpp", "pcp"));

		System.out.println(alll);
		System.out.println(alll.get(1));
		System.out.println(alll.size());

	}
}
