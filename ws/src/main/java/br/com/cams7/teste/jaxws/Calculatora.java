package br.com.cams7.teste.jaxws;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author cesar
 */
@WebService
public class Calculatora {

	/**
	 * @param valor1
	 * @param valor2
	 * @return
	 */
	@WebMethod
	public double soma(@WebParam double valor1, @WebParam double valor2) {
		return valor1 + valor2;
	}

	@WebMethod
	public double subtracao(@WebParam double valor1, @WebParam double valor2) {
		return valor1 - valor2;
	}

	@WebMethod
	public double multiplicacao(@WebParam double valor1, @WebParam double valor2) {
		return valor1 * valor2;
	}

	@WebMethod
	public double divisao(@WebParam double valor1, @WebParam double valor2) {
		return valor1 / valor2;
	}
}
