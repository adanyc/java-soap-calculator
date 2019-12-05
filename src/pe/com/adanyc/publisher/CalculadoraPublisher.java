package pe.com.adanyc.publisher;

import javax.xml.ws.Endpoint;

import pe.com.adanyc.service.impl.CalculadoraService;

public class CalculadoraPublisher {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:98/ws/calculadora", new CalculadoraService());
		System.out.println("Publicado!");
	}
}
