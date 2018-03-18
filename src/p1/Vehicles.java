package p1;

import java.sql.Date;

public class Vehicles {
	
	private final String IDVoiture;
	private final String NomVoiture;
	private final String Etat;
	private final String Commentaire;
	private final String Disponibilite;
	private final String Marque;
	private final String Modele;
	private final Date Annee;
	private final String PrixLouer;
	private final String PrixAcheter;
	private final String NombreKM;
	public Vehicles(String iDVoiture, String nomVoiture, String etat, String commentaire, String disponibilite,
			String marque, String modele, Date annee, String prixLouer, String prixAcheter, String nombreKM) {
		super();
		this.IDVoiture = iDVoiture;
		this.NomVoiture = nomVoiture;
		this.Etat = etat;
		this.Commentaire = commentaire;
		this.Disponibilite = disponibilite;
		this.Marque = marque;
		this.Modele = modele;
		this.Annee = annee;
		this.PrixLouer = prixLouer;
		this.PrixAcheter = prixAcheter;
		this.NombreKM = nombreKM;
	}
	public final String getIDVoiture() {
		return IDVoiture;
	}
	public final String getNomVoiture() {
		return NomVoiture;
	}
	public final String getEtat() {
		return Etat;
	}
	public final String getCommentaire() {
		return Commentaire;
	}
	public final String getDisponibilite() {
		return Disponibilite;
	}
	public final String getMarque() {
		return Marque;
	}
	public final String getModele() {
		return Modele;
	}
	public final Date getAnnee() {
		return Annee;
	}
	public final String getPrixLouer() {
		return PrixLouer;
	}
	public final String getPrixAcheter() {
		return PrixAcheter;
	}
	public final String getNombreKM() {
		return NombreKM;
	}
	
	

}
