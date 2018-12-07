/**
 * ISBAN Mexico - (c) Banco Santander Central Hispano
 *
 * Creado el 21/06/2018 11:07:20 (dd/mm/aaaa hh:mm)
 *
 * Copyright (C) ISBAN All rights reserved. Todos los derechos reservados.
 *
 */
package mx.company.code.model;

import java.util.ArrayList;

/**
 * 
 *
 * @Proyecto: bcom-operacion-service
 * @Paquete: mx.isban.bcom.operacion.model
 * @Clase: BcomOperacionRespBean.java. <br/>
 *
 * @version 1.0.0
 * @author <a href=”mailto:jnieves@visionconsulting.com.mx”>Uriel Nieves</a>
 */
public class BcomOperacionRespBean  {

	private String ID_PK_IDOPERACION;
	private String ESTATUS_GRAL;
	private String TXT_SUCURSAL;
	private String TXT_TIPO_OPERACION;
	private String FCH_FECHA_OPERACION;
	private String TXT_EXPEDIENTE;
	private String TXT_NOMBRE_USUARIO;
	private String TXT_PERFIL_USUARIO;
	private String TXT_COD_PUESTO_USUARIO;
	private String TXT_TERMINAL_USUARIO;
	private String TXT_IP_USUARIO;
	private ArrayList<PantallaOperacionBean> TXT_CAMPO_PANTALLA;
	private String TXT_CANAL;
	private String TXT_APLICACION;
	private String EVALUAR_CAMPOS;
	private String ID_FK_IDREGLA;
	private String ESTATUS_AUTORIZACION;
	private String EXPEDIENTE_ACTUALIZADOR;
	private String NOMBRE_ACTUALIZADOR;
	private String PERFIL_ACTUALIZADOR;
	private String COD_PUESTO_ACTUALIZADOR;
	private String FECHA_ACTUALIZACION;
	private String COMENTARIOS_ACTUALIZACION;
	private String TERMINAL_ACTUALIZADOR;
	private String IP_ACTUALIZADOR;
	private String CANAL_ACTUALIZADOR;
	private String APLICACION_ACTUALIZACION;
	/**
	 * @return the iD_PK_IDOPERACION
	 */
	public String getID_PK_IDOPERACION() {
		return ID_PK_IDOPERACION;
	}
	/**
	 * @param iD_PK_IDOPERACION the iD_PK_IDOPERACION to set
	 */
	public void setID_PK_IDOPERACION(String iD_PK_IDOPERACION) {
		ID_PK_IDOPERACION = iD_PK_IDOPERACION;
	}
	/**
	 * @return the eSTATUS_GRAL
	 */
	public String getESTATUS_GRAL() {
		return ESTATUS_GRAL;
	}
	/**
	 * @param eSTATUS_GRAL the eSTATUS_GRAL to set
	 */
	public void setESTATUS_GRAL(String eSTATUS_GRAL) {
		ESTATUS_GRAL = eSTATUS_GRAL;
	}
	/**
	 * @return the tXT_SUCURSAL
	 */
	public String getTXT_SUCURSAL() {
		return TXT_SUCURSAL;
	}
	/**
	 * @param tXT_SUCURSAL the tXT_SUCURSAL to set
	 */
	public void setTXT_SUCURSAL(String tXT_SUCURSAL) {
		TXT_SUCURSAL = tXT_SUCURSAL;
	}
	/**
	 * @return the tXT_TIPO_OPERACION
	 */
	public String getTXT_TIPO_OPERACION() {
		return TXT_TIPO_OPERACION;
	}
	/**
	 * @param tXT_TIPO_OPERACION the tXT_TIPO_OPERACION to set
	 */
	public void setTXT_TIPO_OPERACION(String tXT_TIPO_OPERACION) {
		TXT_TIPO_OPERACION = tXT_TIPO_OPERACION;
	}
	/**
	 * @return the fCH_FECHA_OPERACION
	 */
	public String getFCH_FECHA_OPERACION() {
		return FCH_FECHA_OPERACION;
	}
	/**
	 * @param fCH_FECHA_OPERACION the fCH_FECHA_OPERACION to set
	 */
	public void setFCH_FECHA_OPERACION(String fCH_FECHA_OPERACION) {
		FCH_FECHA_OPERACION = fCH_FECHA_OPERACION;
	}
	/**
	 * @return the tXT_EXPEDIENTE
	 */
	public String getTXT_EXPEDIENTE() {
		return TXT_EXPEDIENTE;
	}
	/**
	 * @param tXT_EXPEDIENTE the tXT_EXPEDIENTE to set
	 */
	public void setTXT_EXPEDIENTE(String tXT_EXPEDIENTE) {
		TXT_EXPEDIENTE = tXT_EXPEDIENTE;
	}
	/**
	 * @return the tXT_NOMBRE_USUARIO
	 */
	public String getTXT_NOMBRE_USUARIO() {
		return TXT_NOMBRE_USUARIO;
	}
	/**
	 * @param tXT_NOMBRE_USUARIO the tXT_NOMBRE_USUARIO to set
	 */
	public void setTXT_NOMBRE_USUARIO(String tXT_NOMBRE_USUARIO) {
		TXT_NOMBRE_USUARIO = tXT_NOMBRE_USUARIO;
	}
	/**
	 * @return the tXT_PERFIL_USUARIO
	 */
	public String getTXT_PERFIL_USUARIO() {
		return TXT_PERFIL_USUARIO;
	}
	/**
	 * @param tXT_PERFIL_USUARIO the tXT_PERFIL_USUARIO to set
	 */
	public void setTXT_PERFIL_USUARIO(String tXT_PERFIL_USUARIO) {
		TXT_PERFIL_USUARIO = tXT_PERFIL_USUARIO;
	}
	/**
	 * @return the tXT_COD_PUESTO_USUARIO
	 */
	public String getTXT_COD_PUESTO_USUARIO() {
		return TXT_COD_PUESTO_USUARIO;
	}
	/**
	 * @param tXT_COD_PUESTO_USUARIO the tXT_COD_PUESTO_USUARIO to set
	 */
	public void setTXT_COD_PUESTO_USUARIO(String tXT_COD_PUESTO_USUARIO) {
		TXT_COD_PUESTO_USUARIO = tXT_COD_PUESTO_USUARIO;
	}
	/**
	 * @return the tXT_TERMINAL_USUARIO
	 */
	public String getTXT_TERMINAL_USUARIO() {
		return TXT_TERMINAL_USUARIO;
	}
	/**
	 * @param tXT_TERMINAL_USUARIO the tXT_TERMINAL_USUARIO to set
	 */
	public void setTXT_TERMINAL_USUARIO(String tXT_TERMINAL_USUARIO) {
		TXT_TERMINAL_USUARIO = tXT_TERMINAL_USUARIO;
	}
	/**
	 * @return the tXT_IP_USUARIO
	 */
	public String getTXT_IP_USUARIO() {
		return TXT_IP_USUARIO;
	}
	/**
	 * @param tXT_IP_USUARIO the tXT_IP_USUARIO to set
	 */
	public void setTXT_IP_USUARIO(String tXT_IP_USUARIO) {
		TXT_IP_USUARIO = tXT_IP_USUARIO;
	}
	/**
	 * @return the tXT_CAMPO_PANTALLA
	 */
	public ArrayList<PantallaOperacionBean> getTXT_CAMPO_PANTALLA() {
		return TXT_CAMPO_PANTALLA;
	}
	/**
	 * @param tXT_CAMPO_PANTALLA the tXT_CAMPO_PANTALLA to set
	 */
	public void setTXT_CAMPO_PANTALLA(ArrayList<PantallaOperacionBean> tXT_CAMPO_PANTALLA) {
		TXT_CAMPO_PANTALLA = tXT_CAMPO_PANTALLA;
	}
	/**
	 * @return the tXT_CANAL
	 */
	public String getTXT_CANAL() {
		return TXT_CANAL;
	}
	/**
	 * @param tXT_CANAL the tXT_CANAL to set
	 */
	public void setTXT_CANAL(String tXT_CANAL) {
		TXT_CANAL = tXT_CANAL;
	}
	/**
	 * @return the tXT_APLICACION
	 */
	public String getTXT_APLICACION() {
		return TXT_APLICACION;
	}
	/**
	 * @param tXT_APLICACION the tXT_APLICACION to set
	 */
	public void setTXT_APLICACION(String tXT_APLICACION) {
		TXT_APLICACION = tXT_APLICACION;
	}
	/**
	 * @return the eVALUAR_CAMPOS
	 */
	public String getEVALUAR_CAMPOS() {
		return EVALUAR_CAMPOS;
	}
	/**
	 * @param eVALUAR_CAMPOS the eVALUAR_CAMPOS to set
	 */
	public void setEVALUAR_CAMPOS(String eVALUAR_CAMPOS) {
		EVALUAR_CAMPOS = eVALUAR_CAMPOS;
	}
	/**
	 * @return the iD_FK_IDREGLA
	 */
	public String getID_FK_IDREGLA() {
		return ID_FK_IDREGLA;
	}
	/**
	 * @param iD_FK_IDREGLA the iD_FK_IDREGLA to set
	 */
	public void setID_FK_IDREGLA(String iD_FK_IDREGLA) {
		ID_FK_IDREGLA = iD_FK_IDREGLA;
	}
	/**
	 * @return the eSTATUS_AUTORIZACION
	 */
	public String getESTATUS_AUTORIZACION() {
		return ESTATUS_AUTORIZACION;
	}
	/**
	 * @param eSTATUS_AUTORIZACION the eSTATUS_AUTORIZACION to set
	 */
	public void setESTATUS_AUTORIZACION(String eSTATUS_AUTORIZACION) {
		ESTATUS_AUTORIZACION = eSTATUS_AUTORIZACION;
	}
	/**
	 * @return the eXPEDIENTE_ACTUALIZADOR
	 */
	public String getEXPEDIENTE_ACTUALIZADOR() {
		return EXPEDIENTE_ACTUALIZADOR;
	}
	/**
	 * @param eXPEDIENTE_ACTUALIZADOR the eXPEDIENTE_ACTUALIZADOR to set
	 */
	public void setEXPEDIENTE_ACTUALIZADOR(String eXPEDIENTE_ACTUALIZADOR) {
		EXPEDIENTE_ACTUALIZADOR = eXPEDIENTE_ACTUALIZADOR;
	}
	/**
	 * @return the nOMBRE_ACTUALIZADOR
	 */
	public String getNOMBRE_ACTUALIZADOR() {
		return NOMBRE_ACTUALIZADOR;
	}
	/**
	 * @param nOMBRE_ACTUALIZADOR the nOMBRE_ACTUALIZADOR to set
	 */
	public void setNOMBRE_ACTUALIZADOR(String nOMBRE_ACTUALIZADOR) {
		NOMBRE_ACTUALIZADOR = nOMBRE_ACTUALIZADOR;
	}
	/**
	 * @return the pERFIL_ACTUALIZADOR
	 */
	public String getPERFIL_ACTUALIZADOR() {
		return PERFIL_ACTUALIZADOR;
	}
	/**
	 * @param pERFIL_ACTUALIZADOR the pERFIL_ACTUALIZADOR to set
	 */
	public void setPERFIL_ACTUALIZADOR(String pERFIL_ACTUALIZADOR) {
		PERFIL_ACTUALIZADOR = pERFIL_ACTUALIZADOR;
	}
	/**
	 * @return the cOD_PUESTO_ACTUALIZADOR
	 */
	public String getCOD_PUESTO_ACTUALIZADOR() {
		return COD_PUESTO_ACTUALIZADOR;
	}
	/**
	 * @param cOD_PUESTO_ACTUALIZADOR the cOD_PUESTO_ACTUALIZADOR to set
	 */
	public void setCOD_PUESTO_ACTUALIZADOR(String cOD_PUESTO_ACTUALIZADOR) {
		COD_PUESTO_ACTUALIZADOR = cOD_PUESTO_ACTUALIZADOR;
	}
	/**
	 * @return the fECHA_ACTUALIZACION
	 */
	public String getFECHA_ACTUALIZACION() {
		return FECHA_ACTUALIZACION;
	}
	/**
	 * @param fECHA_ACTUALIZACION the fECHA_ACTUALIZACION to set
	 */
	public void setFECHA_ACTUALIZACION(String fECHA_ACTUALIZACION) {
		FECHA_ACTUALIZACION = fECHA_ACTUALIZACION;
	}
	/**
	 * @return the cOMENTARIOS_ACTUALIZACION
	 */
	public String getCOMENTARIOS_ACTUALIZACION() {
		return COMENTARIOS_ACTUALIZACION;
	}
	/**
	 * @param cOMENTARIOS_ACTUALIZACION the cOMENTARIOS_ACTUALIZACION to set
	 */
	public void setCOMENTARIOS_ACTUALIZACION(String cOMENTARIOS_ACTUALIZACION) {
		COMENTARIOS_ACTUALIZACION = cOMENTARIOS_ACTUALIZACION;
	}
	/**
	 * @return the tERMINAL_ACTUALIZADOR
	 */
	public String getTERMINAL_ACTUALIZADOR() {
		return TERMINAL_ACTUALIZADOR;
	}
	/**
	 * @param tERMINAL_ACTUALIZADOR the tERMINAL_ACTUALIZADOR to set
	 */
	public void setTERMINAL_ACTUALIZADOR(String tERMINAL_ACTUALIZADOR) {
		TERMINAL_ACTUALIZADOR = tERMINAL_ACTUALIZADOR;
	}
	/**
	 * @return the iP_ACTUALIZADOR
	 */
	public String getIP_ACTUALIZADOR() {
		return IP_ACTUALIZADOR;
	}
	/**
	 * @param iP_ACTUALIZADOR the iP_ACTUALIZADOR to set
	 */
	public void setIP_ACTUALIZADOR(String iP_ACTUALIZADOR) {
		IP_ACTUALIZADOR = iP_ACTUALIZADOR;
	}
	/**
	 * @return the cANAL_ACTUALIZADOR
	 */
	public String getCANAL_ACTUALIZADOR() {
		return CANAL_ACTUALIZADOR;
	}
	/**
	 * @param cANAL_ACTUALIZADOR the cANAL_ACTUALIZADOR to set
	 */
	public void setCANAL_ACTUALIZADOR(String cANAL_ACTUALIZADOR) {
		CANAL_ACTUALIZADOR = cANAL_ACTUALIZADOR;
	}
	/**
	 * @return the aPLICACION_ACTUALIZACION
	 */
	public String getAPLICACION_ACTUALIZACION() {
		return APLICACION_ACTUALIZACION;
	}
	/**
	 * @param aPLICACION_ACTUALIZACION the aPLICACION_ACTUALIZACION to set
	 */
	public void setAPLICACION_ACTUALIZACION(String aPLICACION_ACTUALIZACION) {
		APLICACION_ACTUALIZACION = aPLICACION_ACTUALIZACION;
	}
	
}
