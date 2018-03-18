package p1;

import java.sql.Date;

public class User {
	
	private final String IDUtilisateur;
	private final String MotDePasse;
	private final String NumPermis;
	private final String NumAssurance;
	private final String TypeUtilisateur;
	private final String Nom;
	private final String Prenom;
	private final Date DateNaiss;
	private final String Rue;
	private final String CodePostal;
	private final String Ville;
	
	
	public User(String iDUtilisateur, String motDePasse, String numPermis, String numAssurance, String typeUtilisateur,
			String nom, String prenom, Date dateNaiss, String rue, String codePostal, String ville) {
		super();
		this.IDUtilisateur = iDUtilisateur;
		this.MotDePasse = motDePasse;
		this.NumPermis = numPermis;
		this.NumAssurance = numAssurance;
		this.TypeUtilisateur = typeUtilisateur;
		this.Nom = nom;
		this.Prenom = prenom;
		this.DateNaiss = dateNaiss;
		this.Rue = rue;
		this.CodePostal = codePostal;
		this.Ville = ville;
	}
	public final String getIDUtilisateur() {
		return IDUtilisateur;
	}
	public final String getMotDePasse() {
		return MotDePasse;
	}
	public final String getNumPermis() {
		return NumPermis;
	}
	public final String getNumAssurance() {
		return NumAssurance;
	}
	public final String getTypeUtilisateur() {
		return TypeUtilisateur;
	}
	public final String getNom() {
		return Nom;
	}
	public final String getPrenom() {
		return Prenom;
	}
	public final Date getDateNaiss() {
		return DateNaiss;
	}
	public final String getRue() {
		return Rue;
	}
	public final String getCodePostal() {
		return CodePostal;
	}
	public final String getVille() {
		return Ville;
	}
	

}
