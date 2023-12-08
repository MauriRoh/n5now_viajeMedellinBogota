Feature: Registro exitoso de un vuelo de ida desde Medellin a Bogota para dos personas en LATAM AIRLINES

      @ExampleTag
      Scenario Outline: Registro exitoso de un vuelo de ida desde Medellin a Bogota para dos personas
        Given el usuario esta en la pagina de la aerolínea LATAM AIRLINES
        When el usuario clickea en el boton "Continuar en LATAM Colombia" en la card
        And el usuario cierra una ventana emergente al clickear en la X
        And el usuario clickea el dropdown Ida y Vuelta
        And el usuario selecciona la opcion de vuelo Solo ida
        And el usuario clickea el dropdown clase
        And el usuario selecciona la clase Premium Economy
        And el usuario clickea el dropdown pasajeros
        And el usuario clickea en la seccion ninios el boton plus
        And el usuario clickea en el input Origen
        And el usuario completa con "<origin>" en el input origen
        And el usuario clickea en la opcion propuesta en origen
        And el usuario clickea en el input Destino
        And el usuario completa con "<destination>" en el input destino
        And el usuario clickea en la opcion propuesta en destino
        And el usuario clickea el calendario para selecciona una fecha
        And el usuario clickea la flecha del calendario para buscar otros meses
        And el usuario clickea una fecha del calendario
        And el usuario clickea el boton "Buscar" para consultar vuelo
        And el usuario selecciona un vuelo disponible
        And el usuario clickea el boton "Elegi" para seleccioanr el vuelo
        And el usuario clickea el boton "Ir a asientos" para seleccionar los asientos
        And el usuario clickea primer asiento
        And el usuario clickea segundo asiento
        And el usuario clickea el boton "Agregar y continuar" para seleccionar los asientos
        And el usuario agrega Equipaje
        And el usuario clickea opciones de equipaje especial
        Then el usuario al clickea el boton "Continuar" se completa exitosamente el registro del vuelo

        Examples:
          | origin         | destination          |
          | Medellín     | Bogotá     |
