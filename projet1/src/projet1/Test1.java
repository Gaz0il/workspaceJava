package projet1;
import java.util.Scanner;
public class Test1 {

	public static void main(String[] args) {
		//testEgalitestring();
		//m2();
		//m10();
		//testSwitch();
		//testFor();
		//testWhile();
		//While();
		//testadd();
		testaffiche();
		//testaffichetableau();
	}
	static void testaffiche(){
		affiche();
		affiche("Hassin","jean-marc");
	}
	static void affiche (){
		System.out.println("hello");
	}
	static void affiche (String nom){
		System.out.println("hello"+nom);
		
	}
	static void affiche (String nom,String prenom){
		System.out.println("hello "+prenom+" "+nom);
		
	}
	static void testadd(){
		int resultat= add(10,15);
		System.out.println("resultat"+resultat);
	}
		static int add(int a,int b){
			int res=a+b;
			return res;
		}
		
		
	static void doWhile(){
		int s=0;int i=0;
		do{
		s+=i;
		i++;
		}while(i<10);
		System.out.println("Somme="+s);
	} //difference avec while, meme si i>10 il ya aura au moins une boucle
	
	
	static void testWhile(){
		int s=0;int i=0;
		while(i<10){
		s+=i;
		i++;
		}
		System.out.println("Somme="+s);

	}
	
	static void testFor(){
		for (int i = 0; i<10;i++)
			System.out.println("I="+i);
	}
	static void testSwitch(){
		System.out.print("Donner un nombre:");
		Scanner clavier=new Scanner(System.in);
		int nb=clavier.nextInt();
		switch(nb){
		case 1 : System.out.println("Lundi");break;
		case 2 : System.out.println("Mardi");break;
		case 3 : System.out.println("Mercredi");break;
		default :System.out.println("Autrement");break;
		}
	}
	static void m10(){
		// condition ternaire
		Scanner clavier = new Scanner(System.in);
		System.out.println("age??");
		int age=clavier.nextInt();
		String reponse;
		reponse=(age<18)? "mineur" : "majeur";
		System.out.println(reponse);
	}
	static void testEgalitestring(){
		String s1="toto";
		String s2="toto";
		//if (s1==s2);
		if (s1.equals(s2))
		System.out.println("ok");
		else
			System.out.println("ko");
	}
	static void m1()
	{
		System.out.println("je suis m1");
		
	}
	static void m2()
	{
		System.out.println("je suis m2");
		int x=0;
		
	}
	static void m3()
	{
		System.out.println("je suis m3");
		String s1="bonjour";
		String s2="toto";
		String s3=s1+s2;
		System.out.println(s3);
	
	}
	static void m4(){
		int a=5;
		int b;
		b=a++;
		System.out.println(a);
		System.out.println(b);
		b=++a;
		System.out.println(a);
		System.out.println(b);
	}
	
	static void m5(){
		System.out.println("nom????");
		Scanner clavier=new Scanner(System.in);
		String nom=clavier.nextLine();
		String s="bienvenue"+nom;
		System.out.println(s);
		
		
	}
	static void m6() {
		Scanner clavier=new Scanner(System.in);
		System.out.println("age ??");
		int age=clavier.nextInt();
		if (age<18)
			System.out.println("mineur");
		else System.out.println("majeur");
		
		System.out.println("à bientot");
		
		
	}
	
}
