#Author: jhoant233@gmail.com

@tag
Feature: Busqueda en Linio por tablas
  Como usuario de Linio quiero ingresar a la p�gina web y buscar un producto

  @BusquedaEnLinio 
  Scenario Outline: Busqueda de producto en Linio
    Given Robot entro a Linio
    When El busca el producto en la pagina
    			| producto   |  estado  |
     			| <producto> | <estado> |
    Then El verifica el resultado esperado

    Examples: 
      | producto  | estado    |
      | televisor | Televisor |
      | celular   | celular   | 
