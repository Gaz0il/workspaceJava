package module;

public class Client {
	private int numsal;
	private String nom;
	private Epole Epole;

	/**
	 * @param numsal
	 * @param nom
	 * @param epole
	 */
	public Client(int numsal, String nom, module.Epole epole) {
		this.numsal = numsal;
		this.nom = nom;
		Epole = epole;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Client [numsal=" + numsal + ", nom=" + nom + ", Epole=" + Epole + "]";
	}

}
