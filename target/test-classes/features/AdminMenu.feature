#Feature: Agregar usuario
#
#  @RegisterUser
#  Scenario Outline: Agregar usuario existosamente
#    Given que abro la pagina de OrangeHRM
#    When me logueo con mi usuario "<usuario>" y "<contrasena>"
#    Then valido que ingrese a la pantalla principal Dashboard
#    And selecciono la opcion "<itemMenu>" del menu
#    And selecciono el boton agregar
#    And ingreso los datos del usuario "<firstName>", "<middleName>", "<lastName>"
#    And presionamos en save para agregar el usuario
#
#
#    Examples:
#      | usuario   | contrasena| itemMenu  |
#      | admin     | admin123  | PIM       |
#
#
#  Scenario Outline: Create Login Details
#    Given que abro la pagina de OrangeHRM
#    When me logueo con mi usuario "<usuario>" y "<contrasena>"
#    Then valido que ingrese a la pantalla principal Dashboard
#    And selecciono la opcion "<itemMenu>" del menu
#    And selecciono el boton agregar
#    And ingreso los datos del usuario "<firstName>", "<middleName>", "<lastName>"
#    And habilitamos el detalle del login
#    And ingresamos el "<userName>", seleccionamos el status "<status>"
#    And ingresamos el password "<pwd>" y confirmamos el password
#    And presionamos en save para agregar el usuario
#
#    Examples:
#      | usuario   | contrasena| itemMenu  | firstName   | middleName |  lastName | userName   | status | pwd |
#      | admin     | admin123  | PIM       | pruebaFirst | pruebaMiddle| pruebaLast| pruebaUser| enabled | admin123|