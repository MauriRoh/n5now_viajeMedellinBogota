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


  #"Continuar en LATAM Colombia" en la card    //button [@id='country-suggestion-reject-change']
  # clickear en la X                           //*[name()='path' and contains(@d,'M16.781 7.')]
  # dropdown Ida y Vuelta                     //button [@id='btnTripTypeCTA']
  # opción de vuelo Solo ida                  //button [@id='btnTripType0']
  # clickea el dropdown clase                 //button [@id='btnCabinTypeCTA']
  # opcion Premium Economy                    //button [@id='btnCabinType1']
  # dropdown pasajeros                        //div[@class='sc-pJvck jQCsMK chev-icon']//*[name()='svg']
  # la seccion ninios el botón plus +         //button [@id='btnPlusChildren']
  # input Origen                              //div [@id='txtInputOrigin']
  # opcion propuesta en origen                //button [@id='btnItemAutoComplete_0']

  # ''

# el usuario clickea en el input Destino     //div [@id='txtInputDestination']




  # opcion Bogota BOG Colombia            //button [@id="btnItemAutoComplete_0"]
  # clickea en Ida Fecha                  //input [@id="departureDate"]
  # fecha del calendario                  //td[@aria-label='Seleccionado como fecha de ida. jueves, 29 de febrero de 2024']
  # boton BUSCAR                          //button [@id="btnSearchCTA"]
  # clichea vuelo                         //div[@id='WrapperCardFlight0']//div[@role='button']
  # boton Elegir                          //button[@id="bundle-detail-0-flight-select"]
  # boton Ir a asientos                   //button[@id="button9"]
  # primer asiento                        //button[@aria-label='Asiento 1A Ventana, Premium Economy. Precio 0 COP, Disponible para Adulto 1']
  # segundo asiento                       //button[@aria-label='Asiento 1C Pasillo, Premium Economy. Precio 0 COP, Disponible para Niño 1']
  # boton Agregar y continuar             //button[@id="btn-confirm-and-continue"]
  # agrega Equipaje                       //button[@id="btn-up-segment-MDE-BOG-bag-15-passenger-ADT_1"]
  # Equipaje especial                     //div[@class='Collapsible__DownIcon-sc-10ml27w-2 inVCAJ']//i[@class='sc-dAlyuH bEPWmJ']//*[name()='svg']
  # CONTINUAR                             //button [@id="BAGS-continue-button"]
  #

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
        And el usuario completa con "<origin>" en el input
        And el usuario clickea en la opcion propuesta en origen
        And el usuario clickea en el input Destino
        And el usuario completa con "<Destination>" en el input



        And el usuario clickea en la opcion propuesta en origen


        And usuario clickea en Destino e ingresa Bogotá
        And usuario clickea opcion propuesta Bogota BOG Colombia
        And usuario clickea en Ida Fecha
        And usuario clickea una fecha del calendario
        And usuario clickea en boton BUSCAR
        And usuario clickea el vuelo
        And usuario clickea el boton Elegir
        And usuario clickea el boton Ir a asientos
        And usuario selecciona primer asiento
        And usuario selecciona segundo asiento
        And usuario clickea en boton Agregar y continuar
        And usuario agrega Equipaje
        And usuario clickea en la seccion Equipaje especial
        Then usuario concreta los pasajes al clickea el boton CONTINUAR

        Examples:
          | origin         | Destination          |
          | Medellín     | Bogotá     |

