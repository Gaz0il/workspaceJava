package model;

public class Voiture {
	private int vitesse;
	private final int vitesseMin=0;
	private final int vitesseMax=300;
	private final int vitesseFlash=120;
	private int flash;
	private InfoVoiture infoVoiture;
	private InfoProprio infoProprio;
	/**
	 * @param vitesse
	 * @param flash
	 * @param infoVoiture
	 * @param infoProprio
	 */
	public Voiture(int vitesse, String nom,String prenom,InfoVoiture infoVoiture) {
		this.vitesse = vitesse;
		this.flash = 0;
		this.infoVoiture = infoVoiture;
		this.infoProprio =new InfoProprio( nom, prenom);
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Voiture [vitesse=" + vitesse +"Jul/sec "+ ", nombre de flash=" + flash + ", infoVoiture=" + infoVoiture
				+ ", infoProprio=" + infoProprio + "]";
	}

	public void setVitesse(int vitesse){
		if (vitesse<vitesseMax && vitesse >=vitesseMin){
			if (vitesse>vitesseFlash && this.vitesse<=vitesseFlash){flash++;};
			this.vitesse=vitesse;
		};
	
	}
	/**
	 * @return the flash
	 */
	public int getFlash() {
		return flash;
	}
	/**
	 * @return the infoVoiture
	 */
	public InfoVoiture getInfoVoiture() {
		return infoVoiture;
	}
	


}
