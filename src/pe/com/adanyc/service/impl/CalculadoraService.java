package pe.com.adanyc.service.impl;

import javax.jws.WebService;

import pe.com.adanyc.service.ICalculadoraService;

@WebService(endpointInterface = "pe.com.adanyc.service.ICalculadoraService")
public class CalculadoraService implements ICalculadoraService {

	@Override
	public double operacion(String operacion, int valor1, int valor2) {
		double resultado = 0;
		switch (operacion) {
		case "+":
			resultado = valor1 + valor2;
			break;

		case "-":
			resultado = valor1 - valor2;
			break;

		case "*":
			resultado = valor1 * valor2;
			break;

		case "/":
			resultado = valor1 / valor2;
			break;

		default:
			break;
		}
		return resultado;
	}

}
