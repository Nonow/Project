
public abstract class Piece {
	/* Class abstraite car elle ne bouge pas dans le tableau,
	 * c'est les tour,fou,etc qui bougent.
	 */
	private String nom;
	private String couleur;

	//Constructeur de Piece
	public Piece(String nom, String couleur) {
		this.nom = nom;
		this.couleur = couleur;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCouleur() {
		return couleur;
	}
	
	//Modifie la couleur 
	public void setCouleur(String couleur) {
		if ((couleur == "blanc") || (couleur == "noir"))
			this.couleur = couleur;
	}

}
