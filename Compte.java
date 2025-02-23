package Exercice;

public abstract class Compte<T> {
	private int numeroCompte;
	protected double solde;
	public T devise;
	public Compte(int n, double s, T d) {
		this.numeroCompte=n;
		this.solde=s;
		this.devise=d;
	}
	public void deposer(double montant) {
		solde+=montant;
	}
	public void retier(double montant) {
		if(solde>=montant) {
			solde-=montant;
		}
		else {
			System.out.println("Solde insuffisant!!");
		}
	}
	public abstract void afficherSolde();
	public T getDevise() {
		return devise;
	}
	public static <T> void  transfere(Compte<T> c1, Compte<T> c2, double mantant) {
		if(c1.solde>=mantant) {
			c1.retier(mantant);
			c2.deposer(mantant);
		}
		else {
			System.out.println("Solde insuffisant!!Transfert impossible!!");
		}
	}
}
