/**
 * ISBAN Mexico - (c) Banco Santander Central Hispano
 *
 * Creado el 21/06/2018 17:26:34 (dd/mm/aaaa hh:mm)
 *
 * Copyright (C) ISBAN All rights reserved. Todos los derechos reservados.
 *
 */
package mx.company.code.model;

import java.io.Serializable;

/**
 * 
 *
 * @Proyecto: bcom-operacion-service
 * @Paquete: mx.isban.bcom.operacion.model
 * @Clase: BcomServiceRequestBean.java.
 * <br/>
 *
 *  @version 1.0.0
 *  @author <a href=”mailto:jnieves@visionconsulting.com.mx”>Uriel Nieves</a>
 */
public class BcomServiceRequestBean implements Serializable{

	/**
	 * id de serializacion
	 */
	private static final long serialVersionUID = -8120509176181671046L;
	
	private String sucursal;
	private String tipoOper;
	private String canal;
	private String app;
	
	/*
	 * Getters & setters
	 */
	
	/**
	 * Obtener valor.
	 * @return El valor de sucursal.  
	 */
	public String getSucursal() {
		return sucursal;
	}
	/**
	 * Fija el valor.
	 *
	 * @param sucursal el valor de sucursal a colocar
	 */
	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}
	/**
	 * Obtener valor.
	 * @return El valor de tipoOper.  
	 */
	public String getTipoOper() {
		return tipoOper;
	}
	/**
	 * Fija el valor.
	 *
	 * @param tipoOper el valor de tipoOper a colocar
	 */
	public void setTipoOper(String tipoOper) {
		this.tipoOper = tipoOper;
	}
	/**
	 * Obtener valor.
	 * @return El valor de canal.  
	 */
	public String getCanal() {
		return canal;
	}
	/**
	 * Fija el valor.
	 *
	 * @param canal el valor de canal a colocar
	 */
	public void setCanal(String canal) {
		this.canal = canal;
	}
	/**
	 * Obtener valor.
	 * @return El valor de app.  
	 */
	public String getApp() {
		return app;
	}
	/**
	 * Fija el valor.
	 *
	 * @param app el valor de app a colocar
	 */
	public void setApp(String app) {
		this.app = app;
	}
	
}
