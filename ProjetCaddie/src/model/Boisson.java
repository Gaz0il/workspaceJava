package model;

public class Boisson extends Article {
	public Eboisson Eboisson;

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Boisson [Eboisson=" + Eboisson + ", nom=" + nom + ", prix=" + prix + "]";
	}

	/**
	 * @param nom
	 * @param prix
	 * @param eboisson
	 */
	public Boisson(String nom, int prix, model.Eboisson eboisson) {
		super(nom, prix);
		Eboisson = eboisson;
	}

}
