package module;

public class Commercial {
	private String nom;
	private String prenom;
	private int secu;

	public String toString() {
		return "Commercial :" + this.prenom + "," + this.nom + "," + this.secu;
	}

	public Commercial(String nom, String prenom, int secu) {
		this.nom = nom;
		this.prenom = prenom;
		this.secu = secu;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + secu;
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Commercial other = (Commercial) obj;
		if (secu != other.secu)
			return false;
		return true;
	}

}
