package hilario.giti7083s.interfacefigura;
/**
 * 
 * @author HILARY
 *
 */
import java.util.List;

import hilario.giti7083s.interfacefigura.Circulo;
import hilario.giti7083s.interfacefigura.Cuadrado;
import hilario.giti7083s.interfacefigura.Triangulo;

	public class TestInterface {

	private Cuadrado cuadrado;
	private Circulo circulo;
	private Triangulo triangulo;
	
	
	public TestInterface(Cuadrado cuadrado, Circulo circulo, Triangulo triangulo) {
		
		this.cuadrado = new Cuadrado();
		this.circulo = new Circulo();
		this.triangulo = new Triangulo();
	}
	public Cuadrado cuadrado(){
		return cuadrado;
	}
	public Circulo circulo(){
		return circulo;
	}
	public Triangulo triangulo(){
		return triangulo;
	}

}
