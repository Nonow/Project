
public class Cavalier extends Piece {
	
	public Cavalier(String Couleur) {
		super("Cavalier", Couleur);
	}

	/**
	 * Methode estValide, sert a verifier la validite du deplacement d'un cavalier
	 * @return true ou false si le deplacement du cavalier est valide
	 * @param Deplacement de la piece
	 */
	public boolean estValide(Deplacer deplacement) {
		/*Verifie si le quotient des deux deplacement est gal a 2 ou  .5, se qui garantie que la
		 * piece  fait un mouvement en "L".
		 */
		return (Math.abs(deplacement.getDeplacerX() / deplacement.getDeplacerY())) == 2 |
				(Math.abs(deplacement.getDeplacerX() / deplacement.getDeplacerY())) == .5;
	}
}
