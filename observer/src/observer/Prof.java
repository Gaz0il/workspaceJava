package observer;

public class Prof {
	private int note;
	private String nom;
	private Eleve[] tab;

	/**
	 * @param nom
	 */
	/**
	 * @param nom
	 */
	public Prof(String nom) {
		this.nom = nom;
	}

	public boolean abonne(Eleve nom) {
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] == null) {
				tab[i] = nom;
			}
			;
		}
		return true;
	}

	public void notifall() {
		if (note != 0) {
			for (Eleve i : tab) {
				tab[i].getNote();

			}
		}
	}

	/**
	 * @return the note
	 */
	public int getNote() {
		return note;
	}
	// cf projet observer correction
}
