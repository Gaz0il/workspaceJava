package model;

public class Adress {
	private int numero;
	private String rue;
	private String cp;
	
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
	
	
}
