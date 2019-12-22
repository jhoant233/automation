package mx.com.vivaaerobus.stepsdefinitions;

import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.UnableToCreateProfileException;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import mx.com.vivaaerobus.excepcion.UnableToConnect;
import mx.com.vivaaerobus.models.ReservaVuelo;
import mx.com.vivaaerobus.questions.DatoBuscado;
import mx.com.vivaaerobus.task.EntrarAVivaAerobus;
import mx.com.vivaaerobus.task.ReservarVuelo;
import mx.com.vivaaerobus.ui.IngresarAVivaAerobus;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class VivaAerobusStepsDefinitions {
	IngresarAVivaAerobus homepage ;
	
	@Managed(driver = "chrome")
	WebDriver SuNavegador;
	
	Actor Mila = Actor.named("Mila");
	
	@Before
	public void setUp() {
		Mila.can(BrowseTheWeb.with(SuNavegador));
		SuNavegador.manage().window().maximize();
	}
	
	@Given("^Mila entro en VivaAerobus$")
	public void milaEntroEnVivaAerobus() { 
		Mila.wasAbleTo(EntrarAVivaAerobus.En(homepage));
	}


	@When("^Mila busca reservar un vuelo$")
	public void milaBuscaReservarUnVuelo(List<ReservaVuelo> data){
		Mila.attemptsTo(ReservarVuelo.desdeHomePageCon(data.get(0)));
		
	}

	@Then("^Mila valida que la informacion de la ventana contenga los datos del vuelo$")
	public void milaValidaQueLaInformacionDeLaVentanaContengaLosDatosDelVuelo()  {
		Mila.should(seeThat(DatoBuscado.Despegue(), equalTo("Cancún")).orComplainWith(UnableToConnect.class, UnableToConnect.getConnectionMessage()));
	}

}
