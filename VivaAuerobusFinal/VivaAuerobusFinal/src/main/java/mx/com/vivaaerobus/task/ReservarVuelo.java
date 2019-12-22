package mx.com.vivaaerobus.task;

import mx.com.vivaaerobus.models.ReservaVuelo;
import mx.com.vivaaerobus.ui.Destino;
import mx.com.vivaaerobus.ui.HomePage;
import mx.com.vivaaerobus.utils.CicloParaCantidadPersonas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ReservarVuelo implements Task{
	ReservaVuelo data;
	
	public ReservarVuelo(ReservaVuelo data) {
		this.data=data;
	}
	

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(HomePage.getSeleccionarDestino()),
		Enter.theValue(data.getOrigen()).into(HomePage.getSeleccionarDestino()));
		actor.attemptsTo(Click.on(HomePage.getSeleccionarDestinoU()));
		
		actor.attemptsTo(Click.on(Destino.getSeleccionarLlegada()),
	    Enter.theValue(data.getDestino()).into(Destino.getSeleccionarLlegada()));
		actor.attemptsTo(Click.on(Destino.getSeleccionarLlegada()));
		
		actor.attemptsTo(Click.on(HomePage.AgregarPersonas));
		CicloParaCantidadPersonas.ciclo(actor, data.getAdultos());
		
		
		actor.attemptsTo(Click.on(HomePage.CambioASencillo));
		actor.attemptsTo(Click.on(HomePage.CambioDePagina));
				
		
	}
	public static ReservarVuelo desdeHomePageCon (ReservaVuelo data){
		return instrumented(ReservarVuelo.class, data);
		
	}

}
