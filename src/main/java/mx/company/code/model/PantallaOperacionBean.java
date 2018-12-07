/**
 * ISBAN Mexico - (c) Banco Santander Central Hispano
 *
 * Creado el 21/06/2018 11:12:51 (dd/mm/aaaa hh:mm)
 *
 * Copyright (C) ISBAN All rights reserved. Todos los derechos reservados.
 *
 */
package mx.company.code.model;

/**
 * 
 *
 * @Proyecto: bcom-operacion-service
 * @Paquete: mx.isban.bcom.operacion.model
 * @Clase: PantallaOperacionBean.java. <br/>
 *
 * @version 1.0.0
 * @author <a href=”mailto:jnieves@visionconsulting.com.mx”>Uriel Nieves</a>
 */
public class PantallaOperacionBean  {


	/**
	 * nombre del parametro
	 */
	private String nombreParametro;

	/**
	 * valor
	 */
	private String valor;

	/**
	 * @return the nombreParametro
	 */
	public String getNombreParametro() {
		return nombreParametro;
	}

	/**
	 * @param nombreParametro the nombreParametro to set
	 */
	public void setNombreParametro(String nombreParametro) {
		this.nombreParametro = nombreParametro;
	}

	/**
	 * @return the valor
	 */
	public String getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(String valor) {
		this.valor = valor;
	}

	

}
