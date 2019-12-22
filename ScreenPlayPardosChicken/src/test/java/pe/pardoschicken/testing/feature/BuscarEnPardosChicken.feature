#Author: jhoant233@gmail.com

@tag
Feature: Busqueda en PardosChicken
  Como usuario de pardoschicken quiero ingresar a la p�gina web y ordenar un comida

  @BusquedaEnPardosChicken
  Scenario: Busqueda de comida en PardosChicken
    Given Bot entra a pardoschicken
    When El busca una "pardos brasa" en la pagina 
    Then El verifica el resultado esperado

