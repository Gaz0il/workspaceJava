package module;

public class CompteCB extends CompteSimple {
	private CB cB;

	/**
	 * @param nom
	 * @param solde
	 * @param cB
	 */
	public CompteCB(String nom, int solde, module.CB cB) {
		super(nom, solde);
		this.cB = cB;
		solde = getSolde();
		solde -= cB.getCout();
	}

	/**
	 * @param nom
	 * @param solde
	 * @param cB
	 */
	public CompteCB(String nom, CB cB) {
		super(nom);
		this.cB = cB;
		solde = getSolde();
		solde -= cB.getCout();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CompteCB: " + nom + " carte: " + cB + "/n solde: " + super.getSolde() + " £";
	}

}
