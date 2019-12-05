package pe.com.adanyc.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface ICalculadoraService {
	@WebMethod
	public abstract double operacion(String operacion, int valor1, int valor2);
}
