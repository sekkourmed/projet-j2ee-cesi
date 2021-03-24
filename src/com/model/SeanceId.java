package com.model;
// Generated 1 f�vr. 2015 11:00:11 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * SeanceId generated by hbm2java
 */
public class SeanceId implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Date dates;
	private int heures;

	public SeanceId() {
	}

	public SeanceId(Date dates, int heures) {
		this.dates = dates;
		this.heures = heures;
	}

	public Date getDates() {
		return this.dates;
	}

	public void setDates(Date dates) {
		this.dates = dates;
	}

	public int getHeures() {
		return this.heures;
	}

	public void setHeures(int heures) {
		this.heures = heures;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SeanceId))
			return false;
		SeanceId castOther = (SeanceId) other;

		return ((this.getDates() == castOther.getDates()) || (this.getDates() != null
				&& castOther.getDates() != null && this.getDates().equals(
				castOther.getDates())))
				&& (this.getHeures() == castOther.getHeures());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getDates() == null ? 0 : this.getDates().hashCode());
		result = 37 * result + this.getHeures();
		return result;
	}

}
