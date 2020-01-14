package module;

public class CompteSimple {
	String nom;
	protected int solde;
	final int cadeau = 20;
	final int comm = 1;

	/**
	 * @param nom
	 * @param solde
	 */
	public CompteSimple(String nom, int solde) {
		this.nom = nom;
		this.solde = solde + cadeau;
	}

	/**
	 * @param nom
	 */
	public CompteSimple(String nom) {
		this.nom = nom;
		solde += cadeau;
	}

	public boolean debiter(int x) {
		boolean i = false;
		if (x < solde && (x + comm) > 0) {
			solde -= (x - comm);
			i = true;
		}
		;
		return i;
	}

	public boolean crediter(int x) {
		boolean i = false;
		if (x > 0) {
			solde += (x + comm);
			i = true;

		}
		;
		return i;
	}

	/**
	 * @return the solde
	 */
	public int getSolde() {
		return solde;
	}

	public boolean virement(int x, CompteSimple y) {
		boolean i = false;
		i = debiter(x);
		if (i = true) {
			y.crediter(x);
		}
		;
		return i;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CompteSimple [nom=" + nom + ", Solde=" + getSolde() + "]";
	}

}
