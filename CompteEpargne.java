package Exercice;

public class CompteEpargne<T> extends Compte<T>{
	private double taux;
	public CompteEpargne(int n, double s , T d,double t) {
		super(n,s,d);
		this.taux=t;
	}
	public double calulerInteret(double taux) {
		solde+=(solde*taux)/100;
		return solde;
	}
	public void afficherSolde() {
		System.out.println("Compte Epargne -Solde: "+solde+" "+devise);
	}

}
