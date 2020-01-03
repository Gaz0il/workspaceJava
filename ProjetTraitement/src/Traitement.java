
public class Traitement {

	public Traitement() {
		// TODO Auto-generated constructor stub
	}
	static double calcul (double nb1, double nb2,String operateur){
		
		//appel des methodes add/div/sous/mult en fonction de l'operateur
		double res=0;
		//switch case
		switch (operateur){
	case "+":
		res=add(nb1,nb2);
		break;
	case "-":
		res=sous(nb1,nb2);
		break;
	case "*":
		res=mult(nb1,nb2);
		break;
	case "/":
		res=div(nb1,nb2);
		break;
	default:
		System.out.println("error");
	
		}
		return res;
		
	}
	
	static double add(double nb1,double nb2){
		double res;
		res=nb1+nb2;
		return res;
	}
	static double sous(double nb1,double nb2){
		double res;
		res=nb1-nb2;
		return res;
	}
	static double mult(double nb1,double nb2){
		double res;
		res=nb1*nb2;
		return res;
	}
	static double div(double nb1,double nb2){
		double res;
		res=nb1/nb2;
		return res;
	}
}
