package module;

public class CompteVIP extends CompteSimple {

	public CompteVIP(String nom) {
		super(nom);

	}

	public CompteVIP(String nom, int x) {
		super(nom, x);

	}

	@Override
	public boolean debiter(int x) {
		boolean i = false;
		if (x > 0) {
			solde -= (x);
			i = true;
		}
		;
		return i;
	}

	@Override
	public boolean crediter(int x) {
		boolean i = false;
		if (x > 0) {
			solde += (x);
			i = true;

		}
		;
		return i;
	}

}
