package com.oefaspace.supervision_linea;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class TMvdDocumSupDO implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "TMVDDOCUMSUPDO_ID_GENERATOR")
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(name = "TMVDDOCUMSUPDO_ID_GENERATOR", sequenceName = "TMVDDOCUMSUPDO_ID_SEQ")
	private java.lang.Long nu_Id_Docum_Det;

	private java.lang.Integer nu_Documcab_Sup;

	private java.lang.String tx_Anio1;

	private java.lang.String tx_Anio2;

	private java.lang.String tx_Nroseccion;

	private java.lang.String tx_Seccion;

	private java.lang.Integer nu_Itemcampo;

	private java.lang.String tx_Campo;

	private char tx_Esparatabla;

	private java.lang.String tx_Tipodato;

	private java.lang.String cl_Campoval;

	private java.lang.String tx_File;

	private java.lang.String tx_Codregsiged;

	private java.lang.String tx_Expedsiged;

	private java.lang.String tx_Tokensiged;

	private java.lang.String tx_Uuidalfresco;

	public TMvdDocumSupDO() {
	}

	public java.lang.Long getNu_Id_Docum_Det() {
		return this.nu_Id_Docum_Det;
	}

	public void setNu_Id_Docum_Det(java.lang.Long nu_Id_Docum_Det) {
		this.nu_Id_Docum_Det = nu_Id_Docum_Det;
	}

	public java.lang.Integer getNu_Documcab_Sup() {
		return this.nu_Documcab_Sup;
	}

	public void setNu_Documcab_Sup(java.lang.Integer nu_Documcab_Sup) {
		this.nu_Documcab_Sup = nu_Documcab_Sup;
	}

	public java.lang.String getTx_Anio1() {
		return this.tx_Anio1;
	}

	public void setTx_Anio1(java.lang.String tx_Anio1) {
		this.tx_Anio1 = tx_Anio1;
	}

	public java.lang.String getTx_Anio2() {
		return this.tx_Anio2;
	}

	public void setTx_Anio2(java.lang.String tx_Anio2) {
		this.tx_Anio2 = tx_Anio2;
	}

	public java.lang.String getTx_Nroseccion() {
		return this.tx_Nroseccion;
	}

	public void setTx_Nroseccion(java.lang.String tx_Nroseccion) {
		this.tx_Nroseccion = tx_Nroseccion;
	}

	public java.lang.String getTx_Seccion() {
		return this.tx_Seccion;
	}

	public void setTx_Seccion(java.lang.String tx_Seccion) {
		this.tx_Seccion = tx_Seccion;
	}

	public java.lang.Integer getNu_Itemcampo() {
		return this.nu_Itemcampo;
	}

	public void setNu_Itemcampo(java.lang.Integer nu_Itemcampo) {
		this.nu_Itemcampo = nu_Itemcampo;
	}

	public java.lang.String getTx_Campo() {
		return this.tx_Campo;
	}

	public void setTx_Campo(java.lang.String tx_Campo) {
		this.tx_Campo = tx_Campo;
	}

	public char getTx_Esparatabla() {
		return this.tx_Esparatabla;
	}

	public void setTx_Esparatabla(char tx_Esparatabla) {
		this.tx_Esparatabla = tx_Esparatabla;
	}

	public java.lang.String getTx_Tipodato() {
		return this.tx_Tipodato;
	}

	public void setTx_Tipodato(java.lang.String tx_Tipodato) {
		this.tx_Tipodato = tx_Tipodato;
	}

	public java.lang.String getCl_Campoval() {
		return this.cl_Campoval;
	}

	public void setCl_Campoval(java.lang.String cl_Campoval) {
		this.cl_Campoval = cl_Campoval;
	}

	public java.lang.String getTx_File() {
		return this.tx_File;
	}

	public void setTx_File(java.lang.String tx_File) {
		this.tx_File = tx_File;
	}

	public java.lang.String getTx_Codregsiged() {
		return this.tx_Codregsiged;
	}

	public void setTx_Codregsiged(java.lang.String tx_Codregsiged) {
		this.tx_Codregsiged = tx_Codregsiged;
	}

	public java.lang.String getTx_Expedsiged() {
		return this.tx_Expedsiged;
	}

	public void setTx_Expedsiged(java.lang.String tx_Expedsiged) {
		this.tx_Expedsiged = tx_Expedsiged;
	}

	public java.lang.String getTx_Tokensiged() {
		return this.tx_Tokensiged;
	}

	public void setTx_Tokensiged(java.lang.String tx_Tokensiged) {
		this.tx_Tokensiged = tx_Tokensiged;
	}

	public java.lang.String getTx_Uuidalfresco() {
		return this.tx_Uuidalfresco;
	}

	public void setTx_Uuidalfresco(java.lang.String tx_Uuidalfresco) {
		this.tx_Uuidalfresco = tx_Uuidalfresco;
	}

	public TMvdDocumSupDO(java.lang.Long nu_Id_Docum_Det,
			java.lang.Integer nu_Documcab_Sup, java.lang.String tx_Anio1,
			java.lang.String tx_Anio2, java.lang.String tx_Nroseccion,
			java.lang.String tx_Seccion, java.lang.Integer nu_Itemcampo,
			java.lang.String tx_Campo, char tx_Esparatabla,
			java.lang.String tx_Tipodato, java.lang.String cl_Campoval,
			java.lang.String tx_File, java.lang.String tx_Codregsiged,
			java.lang.String tx_Expedsiged, java.lang.String tx_Tokensiged,
			java.lang.String tx_Uuidalfresco) {
		this.nu_Id_Docum_Det = nu_Id_Docum_Det;
		this.nu_Documcab_Sup = nu_Documcab_Sup;
		this.tx_Anio1 = tx_Anio1;
		this.tx_Anio2 = tx_Anio2;
		this.tx_Nroseccion = tx_Nroseccion;
		this.tx_Seccion = tx_Seccion;
		this.nu_Itemcampo = nu_Itemcampo;
		this.tx_Campo = tx_Campo;
		this.tx_Esparatabla = tx_Esparatabla;
		this.tx_Tipodato = tx_Tipodato;
		this.cl_Campoval = cl_Campoval;
		this.tx_File = tx_File;
		this.tx_Codregsiged = tx_Codregsiged;
		this.tx_Expedsiged = tx_Expedsiged;
		this.tx_Tokensiged = tx_Tokensiged;
		this.tx_Uuidalfresco = tx_Uuidalfresco;
	}

}