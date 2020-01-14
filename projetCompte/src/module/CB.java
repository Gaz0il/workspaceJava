package module;

public enum CB {
	Amex(5), MC(10), Visa(15);

	int cout;

	/**
	 * @param cout
	 */
	private CB(int cout) {
		this.cout = cout;
	}

	/**
	 * @return the cout
	 */
	public int getCout() {
		return cout;
	}

}
