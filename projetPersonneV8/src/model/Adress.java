package model;

public class Adress {
	private int numero;
	private String rue;
	private String cp;
	private PersonneV8 personne;
	
	/**
	 * @param personne the personne to set
	 */
	public void setPersonne(PersonneV8 personne) {
		this.personne = personne;
	}
	/**
	 * @param numero
	 * @param rue
	 * @param cp
	 */
	public Adress(int numero, String rue, String cp) {
		this.numero = numero;
		this.rue = rue;
		this.cp = cp;
	}
	/**
	 * @return the personne
	 */
	public PersonneV8 getPersonne() {
		return personne;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Adress [numero=" + numero + ", rue=" + rue + ", cp=" + cp + "]";
	}
	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}
	/**
	 * @return the cp
	 */
	public String getCp() {
		return cp;
	}
	
	
}
