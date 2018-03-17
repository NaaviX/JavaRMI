package p1;

import java.util.Base64;

public class ResponseUser {
	private final boolean utilisateur; //la on met 0 si il vient de l'upem et 1 si il vient de l'exterieur
	private final String identifiant;
	private final Base64 mdp;
	
	public boolean isUtilisateur() {
		return utilisateur;
	}
	public String getIdentifiant() {
		return identifiant;
	}
	public Base64 getMdp() {
		return mdp;
	}
	
	public ResponseUser(boolean utilisateur, String identifiant, Base64 mdp) {
		super();
		this.utilisateur = utilisateur;
		this.identifiant = identifiant;
		this.mdp = mdp;
	}

}
