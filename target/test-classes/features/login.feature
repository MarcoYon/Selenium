
  Feature: Login de usuario en OrangeHRM

  @LoginCliente
  Scenario Outline: Validar logueo de usuario exitoso
    Given que abro la pagina de OrangeHRM
    When me logueo con mi usuario "<usuario>" y "<contrasena>"
    Then valido que ingrese a la pantalla principal Dashboard
    And selecciono la opcion "<itemMenu>" del menu

    Examples:
    | usuario   | contrasena| itemMenu |
    | admin     | admin123  | Admin     |




