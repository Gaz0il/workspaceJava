package model;

public class Voiture extends Vehicule {
	private boolean gps;

	/**
	 * @param marque
	 * @param prix
	 */
	public Voiture(String marque, int prix) {
		super(marque, prix);
	}

	/**
	 * @param gps
	 *            the gps to set
	 */
	public void setGps(boolean gps) {
		this.gps = gps;
	}

	public boolean isGps() {
		return gps;
	}

	public String demarrer() {
		return "voitures des marées";

	}

}
