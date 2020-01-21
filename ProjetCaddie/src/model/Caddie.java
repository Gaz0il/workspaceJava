package model;

import java.util.ArrayList;

public class Caddie {
	private String client;
	private ArrayList<Ligne> EnsLigne;

	/**
	 * @param client
	 */
	public Caddie(String client) {
		this.client = client;
		this.EnsLigne = new ArrayList<Ligne>();

	}

	public void Ajouter(Ligne Ligne) {
		this.EnsLigne.add(Ligne);

	}

}
