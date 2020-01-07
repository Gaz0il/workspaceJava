package model;

public class StatusExp {
	private int exp;
	private boolean isCadre;
	private int indexCadre=3;
	/**
	 * @param exp
	 * @param isCadre
	 */
	public StatusExp( int exp) {
		this.isCadre = exp>indexCadre;
		this.exp=exp;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String response="StatusExp [exp=" + exp + ", Status=";
		response+=(isCadre? "Cadre":"non cadre") + "]";
		return response;
	}
	

}
