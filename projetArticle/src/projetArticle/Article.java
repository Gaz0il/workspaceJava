package projetArticle;

public class Article {
	
	private String marque;
	private int prix;
	private final int pivot=200;
	private final int prixMin=0;
	private String status;


	public Article(String marque){
		//setmarque
		
	}
	public Article (String article,int prix){
		//setmarque et prix
		
		
	}
	public String toString() {
		String reponse="Marque: "+getMarque();
		reponse+=" Prix: "+ getPrix();
		reponse+=" \n Status "+ getStatus();
		return reponse;
	}
	public void setPrix(int prix){
		if (prix>prixMin)
		this.prix=prix;
		getStatus();
		
	}
	
	private String getMarque(){
		return marque;
	}
	private int getPrix(){
		return prix;
	}
	private String getStatus(){
		if (prix<pivot)
			return status="lowCost";
		else return status= "expensive";
	}
}
