package Exercice;

public class CompteCourantSecurise <T>extends CompteCourant<T> implements Securisable{
	private String identifiant;
	public CompteCourantSecurise(int n ,double s, T d,double l,String identifiant) {
		super(n,s,d,l);
		this.identifiant=identifiant;
	}
	public boolean verifierIdentite(String id) {
		return id.equals(this.identifiant);
	}
	public boolean authetification(String id) {
		if(verifierIdentite(id)) {
			System.out.println("Identification verifiee");
			return true;
		}
		else {
			System.out.println("Identification invalide");
			return false;

		}
	}
	
}
