package model;

public class TroisD extends Dede2D {
	private int z;

	/**
	 * @param x
	 * @param y
	 * @param z
	 */
	public TroisD(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TroisD [z=" + z + "   2D: " + super.toString() + "]";
	}

}
