package mx.com.vivaaerobus.utils;

import mx.com.vivaaerobus.ui.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;

public class CicloParaCantidadDeNenes {
	
	public static void ciclo(Actor actor, int cantidadNenes) {
		for (int i = 1; i <= cantidadNenes; i++) {
			actor.attemptsTo(
					Click.on(HomePage.getAumentarnenes())
					);
		}
		
	}

}
