#Author: jhoant233@gmail.com
Feature: Login
  Como usuario quiero ingresar a la pagina web coppel para iniciar sesion

  Scenario Outline: Entro al login de la pgina web coppel
    Given Mateo abre la pagina web coppel e ingresa al inicio de sesion
    When El ingresa los datos para iniciar sesion
      | user   | password   | expected   |
      | <user> | <password> | <expected> |
    Then El verifica el resultado esperado

    Examples: 
      | user                           | password | expected                     |
      | example@hotmail.com          | marcos65 | La contrase�a es incorrecta. |
      | example2@gmail.com | pedro22  | La contrase�a es incorrecta. |
