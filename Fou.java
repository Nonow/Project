
public class Fou extends Piece {
	
	public Fou(String Couleur) {
		super("Fou", Couleur);
	}
	


	/*
	 * Methode estValide, sert a verifier la validite du deplacement d'un fou
	 * @return true ou false si le deplacement du fou est valide
	 * @param Deplacement de la piece
	 */
	public boolean estValide(Deplacer deplacement) {
		/*Le mouvement du fou est une diagonale, ainsi si l'on fais la différence des valeurs absolu des dépalcements X et Y,
		 * le résultat devrait toujours être 0.
		 */
		return Math.abs(deplacement.getDeplacerX()) - Math.abs(deplacement.getDeplacerY()) == 0 && !deplacement.isNul();
		
	}

}
