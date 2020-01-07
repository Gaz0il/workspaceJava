package model;

public class Salarie {
private int id;
private String nom;
private String prenom;
private RIB rib;
private StatusExp status;
/**
 * @param id
 * @param nom
 * @param prenom
 * @param rib
 * @param status
 */
public Salarie(int id, String nom, String prenom, RIB rib, int exp) {
	this.id = id;
	this.nom = nom;
	this.prenom = prenom;
	this.rib = rib;
	this.status=new StatusExp(exp);
}
/**
 * @param id
 * @param nom
 * @param prenom
 */
public Salarie(int id, String nom, String prenom) {
	this.id = id;
	this.nom = nom;
	this.prenom = prenom;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Salarie [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", rib=" + rib + ", Status=" + status + "]";
}


}
