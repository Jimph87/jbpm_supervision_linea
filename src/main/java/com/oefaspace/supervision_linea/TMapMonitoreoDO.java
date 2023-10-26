package com.oefaspace.supervision_linea;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class TMapMonitoreoDO implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "TMAPMONITOREODO_ID_GENERATOR")
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(name = "TMAPMONITOREODO_ID_GENERATOR", sequenceName = "TMAPMONITOREODO_ID_SEQ")
	private java.lang.Long nuIdMonitoreo;

	private java.lang.Integer nuNroCaso;

	private java.lang.String txTipoSuperv;

	private java.lang.String txCodAccion;

	private java.lang.String txExpediente;

	private java.lang.String txAccion;

	private java.lang.String txFuenteSup;

	private java.lang.String txCodEmergSup;

	private java.lang.String txLugarEmergSup;

	private java.lang.String txCodSinadaSup;

	@javax.persistence.ManyToOne(fetch = javax.persistence.FetchType.EAGER, cascade = {javax.persistence.CascadeType.ALL})
	private com.oefaspace.supervision_linea.TMapActividadDO nuIdActividad;

	public TMapMonitoreoDO() {
	}

	public java.lang.Long getNuIdMonitoreo() {
		return this.nuIdMonitoreo;
	}

	public void setNuIdMonitoreo(java.lang.Long nuIdMonitoreo) {
		this.nuIdMonitoreo = nuIdMonitoreo;
	}

	public java.lang.Integer getNuNroCaso() {
		return this.nuNroCaso;
	}

	public void setNuNroCaso(java.lang.Integer nuNroCaso) {
		this.nuNroCaso = nuNroCaso;
	}

	public java.lang.String getTxTipoSuperv() {
		return this.txTipoSuperv;
	}

	public void setTxTipoSuperv(java.lang.String txTipoSuperv) {
		this.txTipoSuperv = txTipoSuperv;
	}

	public java.lang.String getTxCodAccion() {
		return this.txCodAccion;
	}

	public void setTxCodAccion(java.lang.String txCodAccion) {
		this.txCodAccion = txCodAccion;
	}

	public java.lang.String getTxExpediente() {
		return this.txExpediente;
	}

	public void setTxExpediente(java.lang.String txExpediente) {
		this.txExpediente = txExpediente;
	}

	public java.lang.String getTxAccion() {
		return this.txAccion;
	}

	public void setTxAccion(java.lang.String txAccion) {
		this.txAccion = txAccion;
	}

	public java.lang.String getTxFuenteSup() {
		return this.txFuenteSup;
	}

	public void setTxFuenteSup(java.lang.String txFuenteSup) {
		this.txFuenteSup = txFuenteSup;
	}

	public java.lang.String getTxCodEmergSup() {
		return this.txCodEmergSup;
	}

	public void setTxCodEmergSup(java.lang.String txCodEmergSup) {
		this.txCodEmergSup = txCodEmergSup;
	}

	public java.lang.String getTxLugarEmergSup() {
		return this.txLugarEmergSup;
	}

	public void setTxLugarEmergSup(java.lang.String txLugarEmergSup) {
		this.txLugarEmergSup = txLugarEmergSup;
	}

	public java.lang.String getTxCodSinadaSup() {
		return this.txCodSinadaSup;
	}

	public void setTxCodSinadaSup(java.lang.String txCodSinadaSup) {
		this.txCodSinadaSup = txCodSinadaSup;
	}

	public com.oefaspace.supervision_linea.TMapActividadDO getNuIdActividad() {
		return this.nuIdActividad;
	}

	public void setNuIdActividad(
			com.oefaspace.supervision_linea.TMapActividadDO nuIdActividad) {
		this.nuIdActividad = nuIdActividad;
	}

	public TMapMonitoreoDO(java.lang.Long nuIdMonitoreo,
			java.lang.Integer nuNroCaso, java.lang.String txTipoSuperv,
			java.lang.String txCodAccion, java.lang.String txExpediente,
			java.lang.String txAccion, java.lang.String txFuenteSup,
			java.lang.String txCodEmergSup, java.lang.String txLugarEmergSup,
			java.lang.String txCodSinadaSup,
			com.oefaspace.supervision_linea.TMapActividadDO nuIdActividad) {
		this.nuIdMonitoreo = nuIdMonitoreo;
		this.nuNroCaso = nuNroCaso;
		this.txTipoSuperv = txTipoSuperv;
		this.txCodAccion = txCodAccion;
		this.txExpediente = txExpediente;
		this.txAccion = txAccion;
		this.txFuenteSup = txFuenteSup;
		this.txCodEmergSup = txCodEmergSup;
		this.txLugarEmergSup = txLugarEmergSup;
		this.txCodSinadaSup = txCodSinadaSup;
		this.nuIdActividad = nuIdActividad;
	}

}