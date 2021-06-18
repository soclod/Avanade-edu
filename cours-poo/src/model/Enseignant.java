package model;

public class Enseignant extends Personne {
	private float salaire;

	public Enseignant(int num, String nom, String prenom, Adresse[] adresses, float salaire) {
		super(num, nom, prenom, adresses);
		this.salaire = salaire;
	}

	public float getSalaire() {
		return salaire;
	}

	public void setSalaire(float salaire) {
		this.salaire = salaire;
	}

	@Override
	public String toString() {
		return "Enseignant [salaire=" + salaire + ", toString()=" + super.toString() + "]";
	}
	
	
}
