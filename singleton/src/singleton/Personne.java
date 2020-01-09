package singleton;

public final class Personne {

	private static Personne instance;

	/**
	 * @param personne
	 */
	private Personne() {
	}

	public static Personne getInstance() {
		if (instance == null) {
			instance = new Personne();
		}
		;

		return instance;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Personne [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
