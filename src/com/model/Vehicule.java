package com.model;
// Generated 1 f�vr. 2015 11:00:11 by Hibernate Tools 3.4.0.CR1

/**
 * Vehicule generated by hbm2java
 */
public class Vehicule implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2279516197980090283L;
	private int numv;
	private String immatriculation;
	private String modele;

	public Vehicule() {
	}

	public Vehicule(int numv) {
		this.numv = numv;
	}

	public Vehicule(int numv, String immatriculation, String modele) {
		this.numv = numv;
		this.immatriculation = immatriculation;
		this.modele = modele;
	}

	public int getNumv() {
		return this.numv;
	}

	public void setNumv(int numv) {
		this.numv = numv;
	}

	public String getImmatriculation() {
		return this.immatriculation;
	}

	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}

	public String getModele() {
		return this.modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

}
