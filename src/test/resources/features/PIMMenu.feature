
Feature: Agregar usuario

  @AddUser
  Scenario Outline: Create Login Details
  Given que abro la pagina de OrangeHRM
  When me logueo con mi usuario "<usuario>" y "<contrasena>"
  Then valido que ingrese a la pantalla principal Dashboard
  And selecciono la opcion "<itemMenu>" del menu
  And presiono el boton agregar
  And ingreso los datos del usuario "<firstName>", "<middleName>", "<lastName>"
  And habilitamos la creacion de su Login "<habilitarLogin>"
  And ingresamos el "<userName>", seleccionamos el status "<status>"
  And ingresamos el password "<pwd>" y confirmamos el password
  Then presionamos en save para crear el empleado

    Examples:
      | usuario   | contrasena| itemMenu  | habilitarLogin| firstName   | middleName |  lastName | userName   | status | pwd |
      | admin     | admin123  | PIM       | true         | pruebaFirst | pruebaMiddle| pruebaLast| pruebaUser| enabled | admin123|