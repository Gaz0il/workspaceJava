package model;

public class Velo extends Vehicule {

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public Velo(String marque, int prix) {
		super(marque, prix);
	}

	@Override
	public String avancer() {
		return "je roule à 2 roues";
	}

}
