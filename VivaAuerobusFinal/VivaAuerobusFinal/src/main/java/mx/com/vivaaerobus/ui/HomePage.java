package mx.com.vivaaerobus.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage extends PageObject{
	public static final Target SeleccionarDestino = Target.the("Buscar campo despegue").located(By.xpath("//input[@placeholder='Select origin airport']"));
	public static final Target SeleccionarDestinoU = Target.the("Seleccionar despegue click").located(By.xpath("//div[contains(@id, 'rand')]"));
	public static final Target SeleccionarLlegada = Target.the("Buscar campo de destino").located(By.xpath("//input[@placeholder='Select destination airport']"));
	public static final Target SeleccionarLlegadaU = Target.the("Selecciona campo Detino").located(By.xpath("//div[contains(@id, 'rand')]"));
	public static final Target AgregarPersonas = Target.the("agregar personas").located(By.xpath("//div[@id='box-flight']//span[@class='vi-add-user']"));
	public static final Target AumentarAdultos = Target.the("Aumenta la cantidad de adultos").located(By.xpath("//div[@id='counter-adults']//a[@class='viva-counter_add'][contains(text(),'+')]"));
	public static final Target Aumentarnenes = Target.the("Aumenta la cantidad de niños").located(By.xpath("//div[@id='counter-children']/a[.='+']"));
    public static final Target AumentarInfantes = Target.the("Aumenta la cantidad de infantes").located(By.xpath("//div[@id='counter-infants']//a[@class='viva-counter_add'][contains(text(),'+')]"));
    public static final Target ListoCantidad = Target.the("Agregar personas").located(By.xpath("//div[contains(@id, 'rand')]"));
    public static final Target CambioASencillo = Target.the("Cambia a modo sencillo").located(By.xpath("//div[@id='box-flight']//div[@class='oneway viva-checkbox']//label"));
    public static final Target CambioDePagina = Target.the("Boton de busqueda").located(By.xpath("//div[@class='criteriaSearchButton hidden-xs']//a[@id='continueLinkFlight']"));
    public static final Target Coso = Target.the("Campo a validar").located(By.xpath("//span[contains(text(),'Cancún')]"));
    
	public static Target getSeleccionarDestino () {
		return SeleccionarDestino;
	}
	
	public static Target getSeleccionarDestinoU() {
		return SeleccionarDestinoU;
		
	}
	public static Target getAumentarnenes() {
		return Aumentarnenes;
		
	}
	public static Target getCoso() {
		return Coso;
		
	}
}

