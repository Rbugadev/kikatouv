package Entities;

import java.util.Date;

public class EventQuantite {
	private Date dateDebut;
	private Date dateFin;
	private int quantite;
	
	public EventQuantite(Date dateDebut, Date dateFin, int quantite) {
		super();
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.quantite = quantite;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
}
