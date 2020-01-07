package model;

public class RIB {
 private String banque;
 private String compte;
/**
 * @param banque
 * @param compte
 */
public RIB(String banque, String compte) {
	this.banque = banque;
	this.compte = compte;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "RIB [banque=" + banque + ", compte N° " + compte + "]";
}

}
