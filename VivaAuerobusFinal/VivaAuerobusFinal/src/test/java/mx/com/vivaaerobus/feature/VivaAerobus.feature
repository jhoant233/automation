#jhoant233@gmail.com
@tag
Feature: Reservacion de vuelo
  Yo como un usuario deseo reserva un vuelo por medio de la pagina VivaAerobus

  @tag1
  Scenario: Reserva de vuelo exitosa
    Given Mila entro en VivaAerobus
    When Mila busca reservar un vuelo
      | Origen | Destino | Adultos | Ninos | Infantes |Mes   | Dia |
      |Cancun  |Camaguey |    2    |   1   |    1     |Agosto|  10 |
    Then Mila valida que la informacion de la ventana contenga los datos del vuelo

