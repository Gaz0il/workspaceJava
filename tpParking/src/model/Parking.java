package model;


public class Parking {
	private String nom;
	private Voiture[] tab;
	/**
	 * @param nom
	 * @param tab
	 */
	public Parking(String nom, Voiture[] tab) {
		this.nom = nom;
		this.tab = tab;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Parking [Parking=" + nom + ", Voiture=" + tab.toString()+"]";
	}
	public boolean addCar(Voiture car){
	boolean res = false;
	for (int i = 0; i < tab.length; i++){
		if(tab[i]==null ){tab[i]=car;};
	}
	return true;
	}
	public boolean supCar(String mat){
		
		for (int i=0;i<tab.length;i++){
			if(tab[i]!=null && tab[i].getInfoVoiture().getMatricule().equalsIgnoreCase(mat)){
				tab[i]=null;};
		}
		
		return true;
	}
}
