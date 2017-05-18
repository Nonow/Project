
public interface FctEchiquier {
		
		public abstract void debuter();
		public abstract Case getCase(int ligne, int colonne);
		public abstract boolean cheminPossible (Deplacer deplacement);
		public abstract boolean captureParUnPionPossible(Deplacer deplacement);

}
