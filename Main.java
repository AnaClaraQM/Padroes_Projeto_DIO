package one.digitalinnovation.gof;

import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.strategy.Robo;

public class Test {

	public static void main(String[] args) {
		
		Robo robo = new Robo();
		robo.mover();
		
		// Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("", "");
	}

}