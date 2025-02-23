package Exercice;

public class CompteCourant<T> extends Compte<T> {
	private double limite;
	public CompteCourant(int n ,double s, T d,double limite) {
		super(n,s,d);
		this.limite=limite;
	}
	public void retirer(double mantant,double limite) {
		if(solde-mantant>=limite) {
			retier(mantant);
		}
		else {
			System.out.println("Solde invalide");
	}}
	public void afficherSolde() {
		System.out.println("Compte Courant -Solde:"+solde+" "+getDevise());
	}

}
