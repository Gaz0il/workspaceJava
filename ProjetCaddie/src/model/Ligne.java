package model;

public class Ligne {
	private int Q;
	private Article Article;

	/**
	 * @param q
	 * @param article
	 */
	public Ligne(int q, model.Article article) {
		this.Q = q;
		this.Article = article;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Ligne [Q=" + Q + ", Article=" + Article + "]";
	}

	/**
	 * @return the q
	 */
	public int getQ() {
		return Q;
	}

	/**
	 * @return the article
	 */
	public Article getArticle() {
		return Article;
	}

}
