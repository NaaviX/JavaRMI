package p1;

import java.util.Base64;

public class ResponseUser {
	private final boolean utilisateur; //la on met 0 si il vient de l'upem et 1 si il vient de l'exterieur
	private final String identifiant;
	private final String mdpB64;
	
	public boolean isUtilisateur() {
		return utilisateur;
	}
	public String getIdentifiant() {
		return identifiant;
	}
	public String getMdp() {
		return mdpB64;
	}
	public ResponseUser(boolean utilisateur, String identifiant, String mdpB64) {
		super();
		this.utilisateur = utilisateur;
		this.identifiant = identifiant;
		this.mdpB64 = mdpB64;
	}

}
