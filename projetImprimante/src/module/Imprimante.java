package module;

public class Imprimante {
	private String message;
	private int numImprimante;

	/**
	 * @param message
	 */
	public Imprimante(int numImprimante) {
		this.numImprimante = numImprimante;
	}

	public void print(String message) {
		System.out.println(message);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String response = "";
		response = "Imprimante [message=" + message;
		response += ", numImprimante=" + numImprimante + "]";
		return response;
	}

}
