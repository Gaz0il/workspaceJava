package model;

public enum Eboisson {
	petit(0.11), moyen(0.22), grand(0.53);

	private double L;

	/**
	 * @param l
	 */
	private Eboisson(double l) {
		L = l;
	}

}
