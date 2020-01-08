package user;

import model.*;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();

	}
	static void test(){
		Group g=new Group("CGI",10);
		PersonneV7 p1=new PersonneV7(1, "dupond", "aaa", 10);
		PersonneV7 p2=new PersonneV7(2, "dupond", "bbb", 15);
		PersonneV7 p3=new PersonneV7(5, "dupond", "ccc", 16);
		g.ajouter(p1);
		g.ajouter(p2);
		boolean b=g.ajouter(p3);
		System.out.println(g);
		System.out.println(g.getCount("dupond"));
		g.sup(p1);
		System.out.println(g.getCount());
		System.out.println(g.getCount("dupond"));
		System.out.println(g);
		
		//tp ID différent
		//retirer une personne du groupe à partir de l'ID
	}
}
