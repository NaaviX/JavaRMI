package pserveur;

public class Voiture {
	private final  String idVoiture;
	private int etat; // from 1 to 10
	private String commentaire;
	private final  String marque;
	private final  String modèle;
	private final int puissance;
	private int annee;
	private int prixLocation;
	private int prixAchat;
	private int nbkm;
	private boolean disponibilite;
	
	public Voiture(String idVoiture, int etat, String commentaire, String marque, String modèle, int puissance,
			int annee, int prixLocation, int prixAchat, int nbkm, boolean disponibilite) {
		this.idVoiture = idVoiture;
		this.etat = etat;
		this.commentaire = commentaire;
		this.marque = marque;
		this.modèle = modèle;
		this.puissance = puissance;
		this.annee = annee;
		this.prixLocation = prixLocation;
		this.prixAchat = prixAchat;
		this.nbkm = nbkm;
		this.disponibilite = disponibilite;
	}

	public int getEtat() {
		return etat;
	}

	public void setEtat(int etat) {
		this.etat = etat;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public int getPrixLocation() {
		return prixLocation;
	}

	public void setPrixLocation(int prixLocation) {
		this.prixLocation = prixLocation;
	}

	public int getPrixAchat() {
		return prixAchat;
	}

	public void setPrixAchat(int prixAchat) {
		this.prixAchat = prixAchat;
	}

	public int getNbkm() {
		return nbkm;
	}

	public void setNbkm(int nbkm) {
		this.nbkm = nbkm;
	}

	public boolean isDisponibilite() {
		return disponibilite;
	}

	public void setDisponibilite(boolean disponibilite) {
		this.disponibilite = disponibilite;
	}

	public String getIdVoiture() {
		return idVoiture;
	}

	public String getMarque() {
		return marque;
	}

	public String getModèle() {
		return modèle;
	}

	public int getPuissance() {
		return puissance;
	}
	
	
	
}
