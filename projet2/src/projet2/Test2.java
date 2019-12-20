package projet2;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		//tpInfo();
		tpAge();
	}
	static void tpInfo(){
		System.out.println("prenom ?");
		Scanner clavier=new Scanner(System.in);
		Scanner clavier2=new Scanner (System.in);
		String prenom=clavier.nextLine();
		
		System.out.println("nom ?");
		String nom=clavier.nextLine();
		
		
		System.out.println("age ?");
		int age=clavier2.nextInt();
		
		String s=prenom+" "+nom+" "+age+" ans";
		System.out.println(s);
	}
	static void tpAge() {
		Scanner clavier = new Scanner(System.in);
		Scanner clavier2 = new Scanner(System.in);

		System.out.println("Quel est votre nom?");
		String nom = clavier2.nextLine();
		System.out.println("Quel est votre age?");
		int age = clavier.nextInt();
		
		final int ageMin=0;
		final int ageMax=120;
		final int ageMineur=18;
		final int ageMajeur=50;

		String status = nom + "\t" + age;
		if ((age >= ageMin) && (age < ageMineur))
			status += " Vous êtes mineur !";
		else if ((age >= ageMineur) && (age <ageMajeur))
			status += " Vous êtes majeur !";
		else if ((age >= ageMajeur) && (age <= ageMax))
			status += " Vous êtes senior !";
		else
			status += " erreur de saisie";

		System.out.println(status);
	}
}
