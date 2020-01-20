package porjetTriable;

public class Article {
	private String marque;
	private int prix;

	/**
	 * @param marque
	 * @param prix
	 */
	public Article(String marque, int prix) {
		this.marque = marque;
		this.prix = prix;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Article [marque=" + marque + ", prix=" + prix + "]";
	}

	/**
	 * @return the marque
	 */
	public String getMarque() {
		return marque;
	}

	/**
	 * @return the prix
	 */
	public int getPrix() {
		return prix;
	}

}
