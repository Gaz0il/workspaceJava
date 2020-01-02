package projet2;

import java.util.*;

public class Test2 {

	public static void main(String[] args) {
		// tpInfo();
		// tpAge();
		// menu();
		//tpBoucle();
		//tpBoucle2();
		//tpBouclev3();
		//tpPuissance();
		//tpWhile();
		//tpRandom();
		tpCalculsalaire();
	}
		
		static void tpCalculsalaire(){
			Scanner clavier1 = new Scanner(System.in);
			System.out.println("Votre nom:");
			String nom=clavier1.next();
			Scanner clavier2 = new Scanner(System.in);
			System.out.println("Votre salaire annuel brut: ");
			double salaire=clavier2.nextDouble();
			Calculsalaire (nom,salaire);
			
		}
			
		
		static void Calculsalaire ( String nom,double salaire){
			String resultat="NOM: " + nom.toUpperCase()+"\t";
			resultat += "salaire mensuel net: " + (salaire-salaire*0.23)/12+" €";
			System.out.println(resultat);
		}
		
	static void tpRandom(){
		Random r=new Random();
		int res=r.nextInt(10);
		System.out.println(res);
		int t=0; int s=0;
		while (res!=s){t++;
		Scanner clavier=new Scanner(System.in);
		System.out.println("saisir nombre");
		s =clavier.nextInt();
		if (t<=4 && res<s) System.out.println("--");
		else if (t<=4 && res>s)System.out.println("++");
		else if (t==5)break;
		}
		if (t==5)System.out.println("Game Over");
		else System.out.println("trouvé en "+t+" coup(s)");
		
	};
	
	static void tpWhile(){
		Random r=new Random();
		int res=r.nextInt(10);
		System.out.println(res);
	}
	static void tpPuissance(){
		
		Scanner clavier=new Scanner(System.in);
		System.out.println("saisir nombre");
		double nombre=clavier.nextDouble();
		System.out.println("saisir puissance");
		double puissance=clavier.nextDouble();
		
		double res=Math.pow(nombre, puissance);
		System.out.println(nombre+"puissance"+puissance+"="+res);
				
		
	}
	
	static void tpBouclev3() {
			// avec un string builder pour optimiser les performances
		StringBuilder sb = new StringBuilder();
		// L'utilisateur renseigne les données
		Scanner clavierst = new Scanner(System.in);
		Scanner clavierint = new Scanner(System.in);
		System.out.println("Donner un caractère:");
		String car = clavierst.nextLine();

		System.out.println("Donner la hauteur:");
		int hauteur = clavierint.nextInt();

		System.out.println("Donner la largeur:");
		int largeur = clavierint.nextInt();

		for (int j = 0; j < hauteur; j++) {
			for (int i = 0; i < largeur; i++)
				sb.append(car + "\t");
			sb.append("\n");

		}
		String resultat = sb.toString();

		System.out.println(resultat);
	}
	static void tpBoucle2() {
		// for caractere
		System.out.println("caractere=?");
		Scanner clavier = new Scanner(System.in);
		String caractere = clavier.nextLine();

		// for hauteur
		System.out.println("hauteur=?");
		Scanner clavier1 = new Scanner(System.in);
		int hauteur = clavier1.nextInt();

		// for longueur
		System.out.println("longueur=?");
		Scanner clavier2 = new Scanner(System.in);
		int longueur = clavier2.nextInt();
		
		String resultat="";
		
		for (int h = 0; h < hauteur; h++) {
			for (int l = 0; l < longueur; l++) {
				resultat +=caractere+"\t";
			}
			resultat+="\n";
		}
		
		System.out.println(resultat);

	}
	static void tpBoucle() {
		// for caractere
		System.out.println("caractere=?");
		Scanner clavier = new Scanner(System.in);
		String caractere = clavier.nextLine();

		// for hauteur
		System.out.println("hauteur=?");
		Scanner clavier1 = new Scanner(System.in);
		int hauteur = clavier1.nextInt();

		// for longueur
		System.out.println("longueur=?");
		Scanner clavier2 = new Scanner(System.in);
		int longueur = clavier2.nextInt();

		for (int h = 0; h < hauteur; h++) {
			for (int l = 0; l < longueur; l++) {
				System.out.print(caractere+"\t");
			}
			System.out.print("\n");
		}

	}

	static void menu() {
		System.out.println("tpAge:1 tpInfo:2 \t saisir chiffre:");
		Scanner clavier = new Scanner(System.in);
		int nb = clavier.nextInt();
		switch (nb) {
		case 1:
			tpAge();
			break;
		case 2:
			tpInfo();
			break;
		default:
			System.out.println("error");

		}
	}

	static void tpInfo() {
		System.out.println("prenom ?");
		Scanner clavier = new Scanner(System.in);
		Scanner clavier2 = new Scanner(System.in);
		String prenom = clavier.nextLine();

		System.out.println("nom ?");
		String nom = clavier.nextLine();

		System.out.println("age ?");
		int age = clavier2.nextInt();

		String s = prenom + " " + nom + " " + age + " ans";
		System.out.println(s);
	}

	static void tpAge() {
		Scanner clavier = new Scanner(System.in);
		Scanner clavier2 = new Scanner(System.in);

		System.out.println("Quel est votre nom?");
		String nom = clavier2.nextLine();
		System.out.println("Quel est votre age?");
		int age = clavier.nextInt();

		final int ageMin = 0;
		final int ageMax = 120;
		final int ageMineur = 18;
		final int ageMajeur = 50;

		String status = nom + "\t" + age;
		if ((age >= ageMin) && (age < ageMineur))
			status += " Vous êtes mineur !";
		else if ((age >= ageMineur) && (age < ageMajeur))
			status += " Vous êtes majeur !";
		else if ((age >= ageMajeur) && (age <= ageMax))
			status += " Vous êtes senior !";
		else
			status += " erreur de saisie";

		System.out.println(status);
	}
}
