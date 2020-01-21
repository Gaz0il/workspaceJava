package model;

public abstract class Article {
	public String nom;
	public int prix;

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Article [nom=" + nom + ", prix=" + prix + "]";
	}

	/**
	 * @param nom
	 * @param prix
	 */
	public Article(String nom, int prix) {
		this.nom = nom;
		this.prix = prix;
	}

	/**
	 * @param nom
	 */
	public Article(String nom) {
		this.nom = nom;
	}

}
