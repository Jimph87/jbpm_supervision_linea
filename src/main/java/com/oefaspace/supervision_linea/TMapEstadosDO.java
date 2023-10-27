package com.oefaspace.supervision_linea;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class TMapEstadosDO implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "TMAPESTADOSDO_ID_GENERATOR")
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(name = "TMAPESTADOSDO_ID_GENERATOR", sequenceName = "TMAPESTADOSDO_ID_SEQ")
	private java.lang.Long nu_Id_Estados;

	private java.lang.String tx_Codestados;

	private java.lang.String tx_Estados;

	private char tx_Esdocum;

	private char tx_Essuperv;

	public TMapEstadosDO() {
	}

	public java.lang.Long getNu_Id_Estados() {
		return this.nu_Id_Estados;
	}

	public void setNu_Id_Estados(java.lang.Long nu_Id_Estados) {
		this.nu_Id_Estados = nu_Id_Estados;
	}

	public java.lang.String getTx_Codestados() {
		return this.tx_Codestados;
	}

	public void setTx_Codestados(java.lang.String tx_Codestados) {
		this.tx_Codestados = tx_Codestados;
	}

	public java.lang.String getTx_Estados() {
		return this.tx_Estados;
	}

	public void setTx_Estados(java.lang.String tx_Estados) {
		this.tx_Estados = tx_Estados;
	}

	public char getTx_Esdocum() {
		return this.tx_Esdocum;
	}

	public void setTx_Esdocum(char tx_Esdocum) {
		this.tx_Esdocum = tx_Esdocum;
	}

	public char getTx_Essuperv() {
		return this.tx_Essuperv;
	}

	public void setTx_Essuperv(char tx_Essuperv) {
		this.tx_Essuperv = tx_Essuperv;
	}

	public TMapEstadosDO(java.lang.Long nu_Id_Estados,
			java.lang.String tx_Codestados, java.lang.String tx_Estados,
			char tx_Esdocum, char tx_Essuperv) {
		this.nu_Id_Estados = nu_Id_Estados;
		this.tx_Codestados = tx_Codestados;
		this.tx_Estados = tx_Estados;
		this.tx_Esdocum = tx_Esdocum;
		this.tx_Essuperv = tx_Essuperv;
	}

}