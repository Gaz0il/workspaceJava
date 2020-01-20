package projetCollection;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
	}

	static void test() {
		ArrayList<Integer> all = new ArrayList<Integer>();
		all.add(10);
		all.add(20);
		all.add(30);
		all.add(40);
		all.add(50);
		all.add(60);
		for (int e : all) {
			System.out.println(e);
		}
		ArrayList<Personne> alll = new ArrayList<Personne>();
		alll.add(new Personne("pp", "pp"));
		alll.add(new Personne("pjjp", "pap"));
		alll.add(new Personne("pp", "pp"));
		alll.add(new Personne("pjjjp", "pqqsp"));
		alll.add(new Personne("pyp", "pdcp"));
		alll.add(new Personne("hhpp", "pcp"));

		System.out.println(alll);

	}
}
