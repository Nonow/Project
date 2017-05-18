
public class Case {
	
	private Piece piece;
	
	//Constructeur par Copie
	
	public Case(Piece piece)
	{
		this.piece = piece;
	}
	
	public Case()
	{
		
	}
	
	//return Piece
	public Piece getPiece() {
		return piece;
	}
	
	//Modifie La piece
	public void setPiece(Piece piece) {
		this.piece = piece;
	}
	
	//Methode qui renvoie un boolean si la case est occupée
	public boolean estOccupe()
	{
		return (piece != null);	
	}
	
	public boolean estOccupe(String couleur)
	{
		if (piece == null)
			return false;
		else
			return (piece.getCouleur().equals(couleur));
	}
}
