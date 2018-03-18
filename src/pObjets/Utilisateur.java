package pObjets;

import java.util.Date;

import p1.Panier;

public class Utilisateur {

	private Panier panier;
	private final String idUtilisateur;
	private final String numPermis;
	private final String numAssurences;
	private final String type;
	private final String nom;
	private final String prenom;
	private final Date dateNaissance;
	private String rue;
	private int codePostal;
	private String ville;
	
	public Utilisateur(String idUtilisateur, String numPermis, String numAssurences, String type, String nom,
			String prenom, Date dateNaissance, String rue, int codePostal, String ville) {
		this.idUtilisateur = idUtilisateur;
		this.numPermis = numPermis;
		this.numAssurences = numAssurences;
		this.type = type;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
	}

	public Panier getPanier() {
		return panier;
	}

	public void setPanier(Panier panier) {
		this.panier = panier;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getIdUtilisateur() {
		return idUtilisateur;
	}

	public String getNumPermis() {
		return numPermis;
	}

	public String getNumAssurences() {
		return numAssurences;
	}

	public String getType() {
		return type;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}
	
	

	


}
