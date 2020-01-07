package user;
import model.*;
public class TestSalarie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		test();

	}
	static void test(){
		Salarie JM=new Salarie(22,"Hassin","Marc");
		RIB banque=new RIB("Ecureuil","noisette");
		int exp=12;
		System.out.println(JM);
		Salarie JM2=new Salarie(22,"Hassin","Marc",banque,exp);
		System.out.println(JM2);
		
	}

}
