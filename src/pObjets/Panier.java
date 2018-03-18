package pObjets;

import java.util.Date;

public class Panier {
	private final Voiture voiture;
	private final Date dateDebut;
	private final Date datefin;
	public Panier(Voiture voiture, Date date, Date date2) {
		super();
		this.voiture = voiture;
		this.dateDebut = date;
		this.datefin = date2;
	}
	public Voiture getVoiture() {
		return voiture;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public Date getDatefin() {
		return datefin;
	}
	
	
}
