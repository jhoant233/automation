package mx.com.vivaaerobus.task;

import mx.com.vivaaerobus.ui.IngresarAVivaAerobus;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class EntrarAVivaAerobus implements Task{
	
	PageObject pagina;
	
	public EntrarAVivaAerobus (PageObject pagina) {
		this.pagina=pagina;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.wasAbleTo(Open.browserOn(pagina));		
	}

	public static Performable En(PageObject homepage) {
		return Tasks.instrumented(EntrarAVivaAerobus.class, homepage);
	}
}