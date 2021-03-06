package model;

public class ville {

	private String nom;
	private String capitale;
	private String pays;
	private String categorie = "NA";
	private boolean isCap;
	private double nbHab;

	public final String regle = "0-1-petit;1-3-moyen;3-10-grand";
	public final double nbMin = 0;
	public final double nbMax = 10;

	public ville(String nom, String capitale, String pays, double nbHab) {
		this.nom = nom;
		this.capitale = capitale;
		this.pays = pays;
		setNbHab(nbHab);
		this.isCap = nom.equalsIgnoreCase(capitale);

	}

	public void setNbHab(double nbHab) {
		if (nbHab > nbMin && nbHab < nbMax) {
			this.nbHab = nbHab;
			findCat();
		}
	}

	public String toString() {
		String res = nom + ", capitale " + capitale + ", pays " + pays + ", " + nbHab + " millions d\'habitants";
		res += ", " + (isCap==true ? "est" : "n\'est pas") + " la capitale";
		res += ", catégorie : " + categorie;
		return res;
	}

	private void findCat() {
		String[] regTab = regle.split(";");
		for (String localReg : regTab) {
			String[] localSplit = localReg.split("-");
			if (Double.parseDouble(localSplit[1]) >= nbHab) {
				categorie = localSplit[2];
				break;
			}
		}

	}
}

