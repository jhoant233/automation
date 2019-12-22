package mx.com.vivaaerobus.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class Destino{

	public static final Target SeleccionarLlegada = Target.the("Listo destino").located(By.xpath("//input[@placeholder='Select destination airport']"));
	public static final Target SeleccionarLlegadaU = Target.the("Listo destino").located(By.xpath("//div[contains(@id, 'rand')]"));
	
	public static Target getSeleccionarLlegada() {
		return SeleccionarLlegada;
		
	}
	
	public static Target getSeleccionarLlegadaU() {
		return SeleccionarLlegadaU;
		
	}
}
