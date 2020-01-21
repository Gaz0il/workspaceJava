package user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import module.Client;
import module.Commercial;
import module.Epole;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();

	}

	static void test() {

		Commercial c1 = new Commercial("pp", "plm", 1);
		Commercial c2 = new Commercial("lkm", "etyu", 2);

		HashMap<Commercial, ArrayList<Client>> hm = new HashMap<Commercial, ArrayList<Client>>();
		Client cl1 = new Client(12, "Polo", Epole.assurance);
		Client cl2 = new Client(2, "azzer", Epole.assurance);
		Client cl3 = new Client(111, "kyser", Epole.auto);
		Client cl4 = new Client(1222, "olo", Epole.banque);

		ArrayList<Client> liste1 = new ArrayList<Client>();
		liste1.add(cl1);
		liste1.add(cl2);
		ArrayList<Client> liste2 = new ArrayList<Client>();
		liste2.add(cl3);
		liste2.add(cl4);

		hm.put(c1, liste1);
		hm.put(c2, liste2);

		System.out.println(hm.keySet());
		Scanner sc=new Scanner(System.in);
		int saisie=sc.nextInt();
		
		System.out.println(hm.(saisie));
		

	}
}
