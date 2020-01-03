import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tpCalcul();

	}
	static void tpCalcul(){
		//utilisateur
		
		//saisir les 2 operants et l'operateur
		Scanner clavier1 = new Scanner(System.in);
		System.out.println("saisir le premier nombre");
		double nb1=clavier1.nextDouble();
		System.out.println("saisir le deuxieme");
		double nb2=clavier1.nextDouble();
		Scanner clavier2 = new Scanner(System.in);
		System.out.println(
				"Veuillez choisir  dans la liste suivante l'opérateur voulu:\n +/add\t -/sous\t */mult\t / div");
		String operateur = clavier2.nextLine();
		double resultat=Traitement.calcul(nb1, nb2, operateur);
		String str="le résultat de l'opération : " + nb1 + " " + operateur + "" + nb2 + " = " + resultat;
		System.out.println(str);
		resultat=Traitement.calcul(nb1,nb2,operateur);
		//afficher le resultat
		
		
	}

	

}
