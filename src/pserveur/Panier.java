package pserveur;

import java.util.Date;

public class Panier {
	
	private final Voiture voiture;
	private final Date dateDebut;
	private final Date dateFin;
	
	public Voiture getVoiture() {
		return voiture;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public Panier(Voiture voiture, Date dateDebut, Date dateFin) {
		this.voiture = voiture;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}
}
