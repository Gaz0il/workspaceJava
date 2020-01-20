package porjetTriable;

import java.util.Comparator;

public class ComparePrix implements Comparator<Article> {
	public int compare(Article o1, Article o2) {

		return ((Integer) o1.getPrix()).compareTo(o2.getPrix());
	}

}
