package observer;

public class Eleve {
	private String nom;
	private int note;

	/**
	 * @param nom
	 */
	public Eleve(String nom) {
		this.nom = nom;
	}

	// method notif repond au notifall
	public void getNote() {
		Prof.getNote(note);
	}
}
// cf projet observer correction