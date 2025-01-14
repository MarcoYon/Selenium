
  Feature: Login de usuario en Organizate

  @LoginCliente
  Scenario Outline: Validar loguin de usuario exitoso
    Given que abro la pagina de organizate
    When presiono el boton inicio de sesion
    And relleno el formulario con los datos del cliente
    And ingreso el password "<password>"

    Examples:
    | password |
    | 111111   |



