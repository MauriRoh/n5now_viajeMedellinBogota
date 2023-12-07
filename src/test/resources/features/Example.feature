Feature: Login in underc0de forum

  @ExampleTag
  Scenario Outline: User login in the Underc0de forum
    Given the user is on the home screen of Underc0de.org
    When the user click the "FORO" button
    And the user click the "INGRESAR" button of the forum
    And the user complete te user information. Usuario: "<user>" Contraseña: "<pass>"
    And the user click the "INGRESAR" button of the forum modal
    Then the user verifies that they are logged in.
    Examples:
      | user         | pass          |
      | autoc0de     | Underc0de     |
      | autoc0deFail | undercodefail |


  #"Continuar en LATAM Colombia" click    //button [@id="country-suggestion-reject-change"]
  # X popup                               //*[name()='path' and contains(@d,'M16.781 7.')]
  # flecha v Ida y Vuelta                 //button [@id="btnTripTypeCTA"]
  # opcion Solo ida                       //button [@id="btnTripType0"]
  # icono v de la clase                   //button [@id="btnCabinTypeCTA"]
  # opcion Premium Economy                //button [@id="btnCabinType1"]
  # icono v en pasajeros                  //div[@class='sc-pJvck jQCsMK chev-icon']//*[name()='svg']
  # boton + en la opcion Niños            //button [@id="btnPlusChildren"]
  # clickea Origen e ingresa Medellín     //div [@id="txtInputOrigin"]
  # opcion Medellin MDE Colombia          //button [@id="btnItemAutoComplete_0"]
  # cliockea Destino e ingresa Bogotá     //div [@id="txtInputDestination"]
  # opcion Bogota BOG Colombia            //button [@id="btnItemAutoComplete_0"]
  # clickea en Ida Fecha                  //input [@id="departureDate"]
  # fecha del calendario                  //td[@aria-label='martes, 2 de enero de 2024']
  # boton BUSCAR                          //button [@id="btnSearchCTA"]

    Feature: Usuario selecciona el país de destino a Colombia

      @ExampleTag
      Scenario: Destino Colombia
        Given usuario clickea el button "Continuar en LATAM Colombia"
        When usuario clickea la "X" y cierra el popup
        And usuario clickea el icono v Ida y Vuelta
        And usuario clickea la opcion Solo ida
        And usuario clickea el icono v de la clase
        And usuario clickea la opcion Premium Economy
        And usuario clickea el icono v en pasajeros
        And usuario clickea el boton + en la opcion Ninios
        And usuario clickea en Origen e ingresa Medellín
        And usuario clickea opcion propuesta Medellin MDE Colombia
        And usuario clickea en Destino e ingresa Bogotá
        And usuario clickea opcion propuesta Bogota BOG Colombia
        And usuario clickea en Ida Fecha
        And usuario clickea una fecha del calendario
        And usuario clickea en boton BUSCAR


