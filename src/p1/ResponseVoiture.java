package p1;

import java.util.Date;

import pserveur.Taille;

public class ResponseVoiture {
	private final Date dateDebut;
	private final Date dateFin;
	private final Taille taille;
	
	public Date getDateDebut() {
		return dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public Taille getTaille() {
		return taille;
	}

	
	public ResponseVoiture(Date dateDebut, Date dateFin, Taille taille) {
		super();
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.taille = taille;
	}
	
}
