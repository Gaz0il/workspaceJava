package projetStatic;

public class Traitement {

	static double calcul(double op1, double op2, String operateur) {
		double resultat = 0;
		switch (operateur) {
		
		case "+":
		case "add":
			resultat = op1 + op2;
			break;
		case "-":
		case "sous":
			resultat = sous(op1, op2);
			break;
		case "*":
		case "mult":
			resultat = mult(op1, op2);
			break;
		case "/":
		case "div":
			resultat = div(op1, op2);
			break;

		}

		return resultat;

	}

	static double sous(double a, double b) {
		return a - b;
	}

	static double mult(double a, double b) {
		return a * b;
	}

	static double div(double a, double b) {
		return a / b;
	}

	static double add(double a, double b) {
		double res = a + b;
		return res;
	}

}
