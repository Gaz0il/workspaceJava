package user;
import model.ville;

public class test {

	public static void main(String[] args) {
		test();
	}

	public static void test(){
		ville v1 = new ville("Paris","Paris","France",8);
		ville v2 = new ville("Lyon", "Paris", "France", 2.8);
		ville v3 = new ville("Le Pontet", "Paris", "France", 0.03);
		ville v4 = new ville("New York", "Washington", "USA", 13);
		ville[] vTab = {v1,v2,v3,v4};
		//for (Ville v:{v1,v2,v3,v4})
		for (ville v:vTab)
			System.out.println(v);
	}
}