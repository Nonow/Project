
public class Tour extends Piece {

	public Tour(String Couleur) {
		super("Tour", Couleur);
	}


	/**
	 * Methode estValide, sert a verifier la validite du deplacement du roi
	 * @return true ou false si le deplacement du roi est valide
	 * @param Deplacement de la piece
	 */
	public boolean estValide(Deplacer deplacement) {
		/*
		 * Si le produit du dplacement x et du dplacement y est gal  0, c'est que
		 * un des deux dplacements est de 0. Se qui veux dire que le mouvement est uniquement vertical ou
		 * horizontale
		 */
		return deplacement.getDeplacerX() * deplacement.getDeplacerY() == 0 && !deplacement.isNul();
	}
}
