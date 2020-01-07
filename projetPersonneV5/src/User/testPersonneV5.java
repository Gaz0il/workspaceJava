package User;

import model.*;

public class testPersonneV5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		//test2();
		test4();
		
	}
	static void test4(){
		Adress adr=new Adress(161,"verdun","94200");
		PersonneV5 p=new PersonneV5("dupond","toto",adr);
		System.out.println(p);
		p.getAdresse().setNumero(162);
		System.out.println(p);
		
	}
	
	static void test2(){
		PersonneV5 t=new PersonneV5("dupond","toto");
		System.out.println(t);
	}
	static void test1(){
		Adress adr=new Adress(161,"verdun","94200");
		PersonneV5 p=new PersonneV5("dupond","toto",adr);
		System.out.println(p);
	}
}
