package mx.com.vivaaerobus.questions;


import mx.com.vivaaerobus.ui.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class DatoBuscado implements Question<String>{
	public String answeredBy(Actor actor) {
		return Text.of(HomePage.getCoso()).viewedBy(actor).asString();
	}

	public static DatoBuscado Despegue() {
		return new DatoBuscado();
	}

}
