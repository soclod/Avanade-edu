package model;

import java.util.Arrays;

public class Personne {

	//public int num;
	private int num;  // interdire l'acces à l'utilisateur avec private et pas public
	private String nom;
	private String prenom;
	public Personne(int num, String nom, String prenom, Adresse[] adresses) {
		this.num = num;
		this.nom = nom;
		this.prenom = prenom;
		this.adresses = adresses;
	}
	private  Adresse[] adresses;
	
	
	public Adresse[] getAdresses() {
		return adresses;
	}

	public void setAdresses(Adresse[] adresses) {
		this.adresses = adresses;
	}

	public Personne(int num, String nom, String prenom) {
		//super();
		this.num = num;
		this.nom = nom;
		this.prenom = prenom;
		
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		if (num >= 0) {
		this.num = num;
	} else {
		this.num = 0;
	}
	}
	public Personne() {
	
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "Personne [num=" + num + ", nom=" + nom + ", prenom=" + prenom + ", adresses="
				+ Arrays.toString(adresses) + "]";
	}
	
	
	}
	

	


