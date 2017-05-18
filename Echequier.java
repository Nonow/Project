
public class Echequier {
	
	private Case c[][];
	
	public Echequier()
	{
		c = new Case[8][8];
		for (int i = 0; i < 8; i++)
			for (int j = 0; j < 8; j++)
				c[i][j] = new Case();
		
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public boolean captureParUnPionPossible(Deplacer deplacement) {
		//Je vrifie si la pice est un pion
		if(location[deplacement.getDepart().getColonne()][deplacement.getDepart().getLigne()].getPiece() instanceof Pion)
		{
			//initialisation des variables dont j'aurai besoin dans mes conditions,  savoir la couleur de la pice de dpart et la case d'arriv.
			Case Arrive = location[(int)deplacement.getArrivee().getColonne()][(int)deplacement.getArrivee().getLigne()];
			String couleurDepart = location[(int)deplacement.getDepart().getColonne()][(int)deplacement.getDepart().getLigne()].getPiece().getCouleur();
			
			//je vrifie d'abord si la pice d'arriv existe et si elle est de la couleur contraire de celle de dpart.
			if(Arrive.estOccupe(couleurDepart.equals("blanc") ? "noir" : "blanc"))
				/*Je vrifie si le dplacement est valide, 
				 *Le dplacement est valide si le produits du dplacement x et y donne 1 si la couleur de dpart est noir
				 *ou -1 si la pice de dpart est blanche. 
				 
				return (deplacement.getDeplacerY() * Math.abs(deplacement.getDeplacerX()) == (couleurDepart.equals("noir") ? 1 : -1));
		}
		return false;
		
	}
	/*
	 * Methode chemin possible, verifie si la piece peut faire le deplacement. Pour ce faire il verifie si le chemin
	 * est libre entre le depart et l'arrive.
	 * @param Deplacement d'une piece
	 * @return vrai ou faux si la piece peut faire le deplacement ou non
	 
	public boolean cheminPossible(Deplacer deplacement) {
		Piece pieceDepart = location[(int)deplacement.getDepart().getColonne()][(int)deplacement.getDepart().getLigne()].getPiece();
		
		/*deux premire condition fondamentale, que la case d'arriv sois libre ou qu'elle possde une pice de couleur
		contraire  celle de la pice de dpart
		if (!location[(int)deplacement.getArrivee().getColonne()][(int)deplacement.getArrivee().getLigne()].estOccupe(pieceDepart.getCouleur().equals("blanc") ? "blanc" : "noir")
				| deplacement.isNul()){
			if (!(pieceDepart instanceof Cavalier)){
				if(!(pieceDepart instanceof Pion)){
					//Je vrifie que le dplacement est suprieur  un.
					if(!(Math.abs(deplacement.getDeplacerX()) - Math.abs(deplacement.getDeplacerY()) <= 1
							&& Math.abs(deplacement.getDeplacerX()) + Math.abs(deplacement.getDeplacerY()) <= 1)){

						JumpX et jumpY seront sois 0,  1 ou -1, ils indiquent l'incrmentation que je devrai utiliser pour les valeurs X et Y pour 
						  vrifier toute les cases entre le dpart et l'arriv
						int jumpX = deplacement.getDeplacerX() == 0 ? 0 : (int)(deplacement.getArrivee().getColonne() - deplacement.getDepart().getColonne())
								/Math.abs((int)(deplacement.getArrivee().getColonne() - deplacement.getDepart().getColonne()));
				
						int jumpY = deplacement.getDeplacerY() == 0 ? 0 : (int)(deplacement.getArrivee().getLigne() - deplacement.getDepart().getLigne())
								/Math.abs((int)(deplacement.getArrivee().getLigne() - deplacement.getDepart().getLigne()));

						//Je vrifie succcessivement toutes les cases entre l'arrive et le dpart
						for (int ctrX = (int)deplacement.getDepart().getColonne() + jumpX, ctrY = (int)deplacement.getDepart().getLigne() + jumpY;
							ctrX != (int)deplacement.getArrivee().getColonne() | ctrY != (int)deplacement.getArrivee().getLigne();
							ctrX += jumpX, ctrY += jumpY){
							if (location[ctrX][ctrY].estOccupe()){
								return false;
							}
						}
						return true;
					}
					else
						/*Si le dplacement est gal il est automatiquement valide car il a pass les prcedents test. Puisque
						le dplacement est de 1, je n'ai pas besoin de vrifier les cases entre le dpart et l'arriv
						return true;
				}
				else
					//Si c'est un pion, je vrifie si la case est libre de toute pice.
					return !location[(int)deplacement.getArrivee().getColonne()][(int)deplacement.getArrivee().getLigne()].estOccupe();
					
			}
			else
				//je renvoie true car un cavalier peut sauter par dessus les autres pices.
				return true;
		}
		else
			//Le dplacement est automatiquement invalide si la case d'arriv contient une pice de mme couleur que la pice de dpart.
			return false;

		
	}



	
	public Case getCase(int colonne, int ligne) {
		return location[colonne][ligne];
	}

	/**
	 * Methode servant a placer toute les piece sur l'echiquier. Met donc toute lesp iece sur les objets cases du tableau location
	 
	public void debuter() {
		int ligne = 7;
		/*Je fais les instructions deux fois, au premier passage, ligne est gal  7 et la couleur  noir,
		 * et au deuxime passage, la couleur est blanche et la ligne est gal  0.
		 
		for (String couleur = "noir" ; !couleur.equals("blanc"); couleur = "blanc", ligne = 0){
			//J'initialise tout mes pices de la premires range (tour, cavalier etc...)
			location[0][ligne].setPiece(new Tour(couleur));
			location[1][ligne].setPiece(new Cavalier(couleur));
			location[2][ligne].setPiece(new Fou(couleur));
			location[3][ligne].setPiece(new Reine(couleur));
			location[4][ligne].setPiece(new Roi(couleur));
			location[5][ligne].setPiece(new Fou(couleur));
			location[6][ligne].setPiece(new Cavalier(couleur));
			location[7][ligne].setPiece(new Tour(couleur));
			//Je change de ligne, dpendament de la couleur que je suis en train de trater.
			ligne += couleur.equals("noir") ? -1 : 1;
			//J'initialise tout mes pions.
			for (int ctr = 0; ctr <= 7; ctr++)
				location[ctr][ligne].setPiece(new Pion(couleur));
		}
	}
	*/
