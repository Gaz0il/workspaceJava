package porjetTriable;

import java.util.Comparator;

public class CompareMarc implements Comparator<Article> {
	public int compare(Article o1, Article o2) {
		return o1.getMarque().compareTo(o2.getMarque());
	}

}
