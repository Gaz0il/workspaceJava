package model;

public class Info {
private int poids;
private double taille;
/**
 * @param poids
 * @param taille
 */
public Info(int poids, double taille) {
	this.poids = poids;
	this.taille = taille;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Info [poids=" + poids + ", taille=" + taille + "]";
}
/**
 * @return the taille
 */
public double getTaille() {
	return taille;
}
/**
 * @param poids the poids to set
 */
public void setPoids(int poids) {
	this.poids = poids;
}


}
