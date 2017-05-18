
public class Deplacer {
	
	/**
	 * Deplacement sur l'axe des X
	 */
	private int deplacerX;
	
	/**
	 * Deplacement sur l'axe des Y
	 */
	private int deplacerY;
	
	/**
	 * Coordonnee de la case d'arrivee
	 */
	private Position arrivee;
	
	/**
	 * Coordonnee de la case de depart
	 */
	private Position depart;
	

	/**Constructeur d'un objet déplacement, calcul les déplacement sur les axes X et Y. Ces valeurs ne sont pas donné de
	 * manière absolue car le pion à besoin de connaître la direction dans laquelle il se déplace.
	 * @param Prend en paramètre les coordonnees de depart et d'arrive du deplacement
	 */
	public Deplacer(Position depart, Position arrivee)
	{
		this.arrivee = arrivee;
		this.depart = depart;
		this.deplacerX = arrivee.getColonne() - depart.getColonne();
		this.deplacerY = arrivee.getLigne() - depart.getLigne();
	}


	public double getDeplacerX() {
		return deplacerX;
	}

	public double getDeplacerY() {
		return deplacerY;
	}
	
	public Position getArrivee() {
		return arrivee;
	}

	public Position getDepart() {
		return depart;
	}
	
	//vérifie si le déplacement est nul.
	public boolean isNul(){
		return deplacerX == 0 && deplacerY == 0;
	}
	
}

