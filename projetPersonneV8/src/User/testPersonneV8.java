package User;

import model.*;

public class testPersonneV8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		//test2();
		test4();
		
	}
	static void test4(){
		Adress adr=new Adress(161,"verdun","94200");
		PersonneV8 p=new PersonneV8("dupond","toto");
		System.out.println(p);
		p.setAdresse(adr);
		
		adr.setPersonne(p);
		p.setAdresse(adr);
		
		p.getAdresse().setNumero(162);
		System.out.println(p.getAdresse().getCp());
		System.out.println(adr.getPersonne().getNom());
		
		
		
	}
	
	static void test2(){
		PersonneV8 t=new PersonneV8("dupond","toto");
		System.out.println(t);
	}
	static void test1(){
		Adress adr=new Adress(161,"verdun","94200");
		PersonneV8 p=new PersonneV8("dupond","toto");
		System.out.println(p);
	}
}
