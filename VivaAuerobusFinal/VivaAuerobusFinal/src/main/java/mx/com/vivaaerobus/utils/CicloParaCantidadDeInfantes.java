package mx.com.vivaaerobus.utils;

import mx.com.vivaaerobus.ui.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;

public class CicloParaCantidadDeInfantes {
	public static void ciclo(Actor actor, int cantidadInfantes) {
		for (int i = 1; i <= cantidadInfantes; i++) {
			actor.attemptsTo(
					Click.on(HomePage.AumentarInfantes)
					);
		}
		
	}
}
