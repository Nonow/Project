
public class Reine extends Piece {
	
	public Reine(String Couleur) {
		super("Reine", Couleur);
	}
		
	/**
	 * Methode estValide, sert a verifier la validite du deplacement de la reine
	 * @return true ou false si le deplacement du fou est valide
	 * @param Deplacement de la piece
	 */
	public boolean estValide(Deplacer deplacement) {
		/*Le dplacement d'une reine est un mouvement qui peut tre diagonale OU rectiligne.
		 * Je j'utilise donc les mthodes du fou et de la tour pour vrifier celle de la reine.
		 */
		
		return (Math.abs(deplacement.getDeplacerX()) - Math.abs(deplacement.getDeplacerY()) == 0 
				| deplacement.getDeplacerX() * deplacement.getDeplacerY() == 0) && !deplacement.isNul();
	}
}
