package mx.com.vivaaerobus.utils;

import mx.com.vivaaerobus.ui.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;

public class CicloParaCantidadPersonas {

	public static void ciclo(Actor actor, int cantidadAdultos) {
		for (int i = 2; i <= cantidadAdultos; i++) {
			actor.attemptsTo(
					Click.on(HomePage.AumentarAdultos)
					);
		}
		
	}
	
}
