package model;

public class Etudiant extends Personne {
	private String niveau;

	public Etudiant(int num, String nom, String prenom, Adresse[] adresses, String niveau) {
		super(num, nom, prenom, adresses); // permet d'appeler une methode definie dans la classe mère
		this.niveau = niveau;
	}

	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}

	@Override
	public String toString() {
		return "Etudiant [niveau=" + niveau + ", toString()=" + super.toString() + "]" ;
	}


}
