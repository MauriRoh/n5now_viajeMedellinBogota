#Feature: Login in underc0de forum
#
#  @ExampleTag
#  Scenario Outline: User login in the Underc0de forum
#    Given the user is on the home screen of Underc0de.org
#    When the user click the "FORO" button
#    And the user click the "INGRESAR" button of the forum
#    And the user complete te user information. Usuario: "<user>" Contraseña: "<pass>"
#    And the user click the "INGRESAR" button of the forum modal
#    Then the user verifies that they are logged in.
#    Examples:
#      | user         | pass          |
#      | autoc0de     | Underc0de     |
#      | autoc0deFail | undercodefail |


  #"Continuar en LATAM Colombia" en la card    //button [@id='country-suggestion-reject-change']
  # clickear en la X                           //*[name()='path' and contains(@d,'M16.781 7.')]
  # dropdown Ida y Vuelta                     //button [@id='btnTripTypeCTA']
  # opción de vuelo Solo ida                  //button [@id='btnTripType0']
  # clickea el dropdown clase                 //button [@id='btnCabinTypeCTA']
  # opcion Premium Economy                    //button [@id='btnCabinType1']
  # dropdown pasajeros                        //div[@class='sc-pJvck jQCsMK chev-icon']//*[name()='svg']
  # la seccion ninios el botón plus +         //button [@id='btnPlusChildren']
  # input Origen                              //div [@id='txtInputOrigin']
  # opcion propuesta en origen                //li [@id='lstItem_0']
  # el usuario clickea en el input Destino    //div [@id='txtInputDestination']
  # opcion Bogota BOG Colombia                //li [@id='lstItem_0']
  # clickea el calendario para selecciona una fecha                 //input [@id='departureDate']
  # calendario para buscar otros meses        //div[@aria-label='Avanza al mes de']//*[name()='svg']
  # selecciona una fecha para el vuelo        //td[@aria-label='domingo, 31 de marzo de 2024']
  # boton BUSCAR                              //button [@id='btnSearchCTA']
  # selecciona un vuelo disponible            //div[@id='WrapperCardFlight0']//div[@role='button']
  # boton Elegir                            //button[@id='bundle-detail-0-flight-select']
  # boton "Ir a asientos" para seleccionar los asientos                  //button[@id='button9']
  # el usuario clickea primer asiento                       //button[@aria-label='Asiento 1A Ventana, Premium Economy. Precio 0 COP, Disponible para Adulto 1']
  # el usuario clickea segundo asiento                       //button[@aria-label='Asiento 1C Pasillo, Premium Economy. Precio 0 COP, Disponible para Niño 1']
  # boton Agregar y continuar             //button[@id='btn-confirm-and-continue']
  # agrega Equipaje                       //button[@id='btn-up-segment-MDE-BOG-bag-15-passenger-ADT_1']
  # Equipaje especial                     //div[@class='Collapsible__DownIcon-sc-10ml27w-2 inVCAJ']//i[@class='sc-dAlyuH bEPWmJ']//*[name()='svg']
  # CONTINUAR                             //button [@id='BAGS-continue-button']
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
        Then el usuario al clickea el boton "CONTINUAR" se completa exitosamente el registro del vuelo

        Examples:
          | origin         | destination          |
          | Medellín     | Bogotá     |

