package projet2;

import java.util.Scanner;

public class test {
	public static void main (String[]args){
	testinfo();
		
	}
	static void testinfo(){
		Scanner clavier = new Scanner(System.in);
		System.out.println("votre age:");
		int age=clavier.nextInt();
		Scanner clavier1 = new Scanner(System.in);
		System.out.println("Votre nom:");
		String nom=clavier1.next();
		Scanner clavier2 = new Scanner(System.in);
		System.out.println("votre prenom");
		String prenom=clavier2.next();
		info (nom,prenom,age);
	}
	static void info ( String nom,String prenom,int age){
		String resultat="NOM: " + nom.toUpperCase()+"\t";
		resultat += "Prenom: " + prenom.toUpperCase()+"\n";
		resultat += "AGE: " +age+"\n";
		resultat += "status: "+((age<18)? "mineur":"majeur");
		System.out.println(resultat);
	}
	
static void testhello() {
		hello("jean");
		String s="test";
		hello (s);
		
	}
static void hello(String nom){
	System.out.println("hello "+nom);
}
}
