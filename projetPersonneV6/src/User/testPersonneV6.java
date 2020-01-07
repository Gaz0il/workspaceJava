package User;

import model.*;

public class testPersonneV6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		//test2();
		//test4();
		test5();
		
		
	}
	
	static void test5(){
		Adress adr=new Adress(161,"verdun","94200");
		int poids=152;
		double taille=2.54;
		PersonneV6 p=new PersonneV6("dupond","toto",adr,poids,taille);
		System.out.println(p);
		p.getInfo().setPoids(402);
		System.out.println(p);
		
	}
	
/*	static void test4(){
		Adress adr=new Adress(161,"verdun","94200");
		Info inf=new Info(78,1.8);
		PersonneV6 p=new PersonneV6("dupond","toto",adr,inf);
		System.out.println(p);

		
		
	}*/
	
	static void test2(){
		PersonneV6 t=new PersonneV6("dupond","toto");
		System.out.println(t);
	}
	static void test1(){
		Adress adr=new Adress(161,"verdun","94200");
		PersonneV6 p=new PersonneV6("dupond","toto",adr);
		System.out.println(p);
	}
}
