package musiqueStreaming;

public interface PlayListe {
	

	public void AffMusicPlaylist(String titre, String genre2);
	public void AjouterMusic(Musique M);
	public void ElimineDouble();
	public void AffDeuxPlaylist();
	public void triPlaylistParAuteur();
	public void triPlaylistParInterprete();

}
