package musiqueStreaming;

public class MusiqueImpl implements Musique {
	
	public String titre;
	public String auteur;
	public String interprete;
	public String genre;
	public boolean verif;

	

	public MusiqueImpl() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public MusiqueImpl(String titre, String auteur, String interprete, String genre) {
		this.titre = titre;
		this.auteur = auteur;
		this.interprete = interprete;
		this.genre = genre;
	}


	public String getTitre() {
		return titre;
	}


	public void setTitre(String titre) {
		this.titre = titre;
	}


	public String getAuteur() {
		return auteur;
	}


	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}


	public String getInterprete() {
		return interprete;
	}


	public void setInterprete(String interprete) {
		this.interprete = interprete;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public boolean isVerif() {
		return verif;
	}


	public void setVerif(boolean verif) {
		this.verif = verif;
	}



	@Override
	public void AfficheMusique(String titre, String autheur, String interprete, String genre) {
		
		System.out.println("Le titre : "+titre+" L'autheur : "+autheur+"L'interprete :"+interprete+" Le genre : "+genre);
	}


	@Override
	public boolean  VerifMusique(Musique M1, Musique M2) {
		
		if   (M1 == M2)
		     verif=true;
		else verif = false;	
		
		return verif;
	}


	


		


	
	
	
	
	

}
