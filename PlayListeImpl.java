package musiqueStreaming;

public class PlayListeImpl implements PlayListe{

	
	
	
	public static final int MAX_MUSIQUES = 100;
	public String nom;
	public String genre;
	public int nombreTitres;
	public MusiqueImpl[] PlayList= new MusiqueImpl[MAX_MUSIQUES];

	
	

	public PlayListeImpl() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public PlayListeImpl(String nom, String genre, int nombreTitres, MusiqueImpl[] playList) {
		this.nom = nom;
		this.genre = genre;
		this.nombreTitres = nombreTitres;
		PlayList = playList;
	}

		public MusiqueImpl[] getPlayList() {
			
		return PlayList;
	}


	public void setPlayList(MusiqueImpl[] playList) {
		PlayList = playList;
	}


	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getGenre() {
		return genre;
	}



	public void setGenre(String genre) {
		this.genre = genre;
	}



	public int getNombreTitres() {
		return nombreTitres;
	}



	public void setNombreTitres(int nombreTitres) {
		this.nombreTitres = nombreTitres;
	}



	@Override
	public void AffMusicPlaylist(String titre, String genre2) {
		for (Integer i=0 ; i < MAX_MUSIQUES; i++)  
		{
			AffMusicPlaylist(getPlayList()[i].titre , getPlayList()[i].genre);
		    System.out.println("Le nom : "+titre+" Le genre : "+genre2);
		}		
	}

	@Override
	public void AjouterMusic(Musique M) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ElimineDouble() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void AffDeuxPlaylist() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void triPlaylistParAuteur() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void triPlaylistParInterprete() {
		// TODO Auto-generated method stub
		
	}

	
	
}
