package model;

public class Adresse {
	private String rue;
	private String codepostal;
	private String ville;
	
	public Adresse() {
	}
	public Adresse(String rue, String codepostal, String ville) {
		this.rue = rue;
		this.codepostal = codepostal;
		this.ville = ville;
	}
	public String getRue() {
		
		
		
		
		return rue;
	}
	
		

	public void setRue(String rue) {
		this.rue = rue;
	}
	public String getCodepostal() {
		return codepostal;
	}
	public void setCodepostal(String codepostal) {
		this.codepostal = codepostal;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public static void main(String[] args) {
		Adresse adresse = new Adresse();
		adresse.rue = "2 rue de bercy";
		adresse.codepostal = "75012";
		adresse.ville = "paris";
		
	
	
		System.out.println(adresse);
		

	}
	@Override
	public String toString() {
		return "Adresse [rue=" + rue + ", codepostal=" + codepostal + ", ville=" + ville + "]";
	}

}
