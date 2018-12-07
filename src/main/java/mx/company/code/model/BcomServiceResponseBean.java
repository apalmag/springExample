/**
 * ISBAN Mexico - (c) Banco Santander Central Hispano
 *
 * Creado el 21/06/2018 11:02:47 (dd/mm/aaaa hh:mm)
 *
 * Copyright (C) ISBAN All rights reserved. Todos los derechos reservados.
 *
 */
package mx.company.code.model;

import java.util.ArrayList;

/**
 * Clase para el Bean de respuesta del BCOMServiceWeb
 *
 * @Proyecto: bcom-operacion-service
 * @Paquete: mx.isban.bcom.operacion.model
 * @Clase: BcomServiceResponseBean.java. <br/>
 *
 * @version 1.0.0
 * @author <a href=”mailto:jnieves@visionconsulting.com.mx”>Uriel Nieves</a>
 */
public class BcomServiceResponseBean  {


	private String CodigoResp;
	private String MsjResp;
	private ArrayList<BcomOperacionRespBean> Operaciones;
	/**
	 * @return the codigoResp
	 */
	public String getCodigoResp() {
		return CodigoResp;
	}
	/**
	 * @param codigoResp the codigoResp to set
	 */
	public void setCodigoResp(String codigoResp) {
		CodigoResp = codigoResp;
	}
	/**
	 * @return the msjResp
	 */
	public String getMsjResp() {
		return MsjResp;
	}
	/**
	 * @param msjResp the msjResp to set
	 */
	public void setMsjResp(String msjResp) {
		MsjResp = msjResp;
	}
	/**
	 * @return the operaciones
	 */
	public ArrayList<BcomOperacionRespBean> getOperaciones() {
		return Operaciones;
	}
	/**
	 * @param operaciones the operaciones to set
	 */
	public void setOperaciones(ArrayList<BcomOperacionRespBean> operaciones) {
		Operaciones = operaciones;
	}
	
	
}
