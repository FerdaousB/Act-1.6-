package musiqueStreaming;

public interface Musique {

	public void AfficheMusique(String titre,String autheur, String interprete, String genre);
	public boolean  VerifMusique(Musique M1, Musique M2);
}
