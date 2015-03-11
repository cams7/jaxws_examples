/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cams7.teste.jaxws;

/**
 *
 * @author cesar
 */
public class Main {

	public static void main(String... args) {
		System.out.println("Soma = " + soma(3, 5));
		System.out.println("Subtracao = " + subtracao(3, 5));
		System.out.println("Multiplicacao = " + multiplicacao(3, 5));
		System.out.println("Divisao = " + divisao(3, 5));
	}

	private static double soma(int valor1, int valor2) {
		CalculatoraService service = new CalculatoraService();
		Calculatora port = service.getCalculatoraPort();
		return port.soma(valor1, valor2);
	}

	private static double subtracao(int valor1, int valor2) {
		CalculatoraService service = new CalculatoraService();
		Calculatora port = service.getCalculatoraPort();
		return port.subtracao(valor1, valor2);
	}

	private static double multiplicacao(int valor1, int valor2) {
		CalculatoraService service = new CalculatoraService();
		Calculatora port = service.getCalculatoraPort();
		return port.multiplicacao(valor1, valor2);
	}

	private static double divisao(int valor1, int valor2) {
		CalculatoraService service = new CalculatoraService();
		Calculatora port = service.getCalculatoraPort();
		return port.divisao(valor1, valor2);
	}

}
