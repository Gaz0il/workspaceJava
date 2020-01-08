package model;

public class Group {
	
private String nom;
private PersonneV7[] tab;
/**
 * @param nom
 * @param tab
 */
public Group(String nom, int taille) {
	this.nom = nom;
	tab = new PersonneV7[taille];
}
public boolean ajouter(PersonneV7 p) {
	boolean res = false;
	for (int i = 0; i < tab.length; i++)

		if (tab[i] == null) {
			tab[i] = p;
			res = true;
			break;
		}

	return res;
}

public boolean sup(PersonneV7 p) {
	boolean res = false;
	for (int i = 0; i < tab.length; i++)

		if (tab[i] != null && tab[i].getId()==p.getId()) {
			tab[i] = null;
			res = true;
			break;
		}

	return res;
}


public String toString() {
	String reponse = "Groupe [nom=" + nom;
	for (PersonneV7 p : tab)
		if (p != null)
			reponse += "\n" + p;
	return reponse;
}


public int getCount(){
int count=0;
for (PersonneV7  p: tab) {
	if (p!=null){count++;
	};
}
return count;

}	
public int getCount(String nom){
int count=0;
for (PersonneV7  p: tab) {
	if (p!=null && nom.equalsIgnoreCase(p.getNom())){count++;
	};
}	
return count;
}
}

