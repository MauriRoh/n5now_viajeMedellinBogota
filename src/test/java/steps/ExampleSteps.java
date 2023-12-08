package steps;

import io.cucumber.java.en.*;
import pages.ExamplePage;

public class ExampleSteps {
    /*
     ** PAGE INSTANCE **
     */

    ExamplePage examplePage = new ExamplePage();

    @Given("el usuario esta en la pagina de la aerolínea LATAM AIRLINES")
    public void theUserIsOnTheLATAMAIRLINESwebpage() {
        examplePage.navigateToMainURL();
    }

    @And("^el usuario clickea en el boton \"Continuar en LATAM Colombia\" en la card$")
    public void theUserClickTheContinuarEnLATAMColombiaButtonOnTheCard() {
        examplePage.clickContinuarEnLATAMColombiaButton();
    }

    @And("el usuario cierra una ventana emergente al clickear en la X")
    public void theUserClosesAPopupWindowByClickOnTheX() {
        examplePage.clickXButtonOfThePopup();
    }

    @And("el usuario clickea el dropdown Ida y Vuelta")
    public void theUserClickDropdownIdayVuelta() {
        examplePage.clickDropdownIdayVuelta();
    }

    @And("el usuario selecciona la opcion de vuelo Solo ida")
    public void theUserSelectTheFlightOptionSoloIda() {
        examplePage.clickSelectTheFlightOptionSoloIda();
    }

    @And("el usuario clickea el dropdown clase")
    public void theUserClickDropdownClass() {
        examplePage.clickDropdownClass();
    }

    @And("el usuario selecciona la clase Premium Economy")
    public void theUserSelectClassPremiumEconomy() {
        examplePage.clickSelectClassPremiumEconomy();
    }

    @And("el usuario clickea el dropdown pasajeros")
    public void theUserClickDropdownPasajeros() {
        examplePage.clickDropdownPasajeros();
    }

    @And("el usuario clickea en la seccion ninios el boton plus")
    public void theUserClickOnTheChildrenSectionPlusButton() {
        examplePage.clickOnTheChildrenSectionPlusButton();
    }

    @And("el usuario clickea la card del buscador")
    public void theUserClickSearchCard() {
        examplePage.clickSearchCard();
    }

    @And("el usuario clickea en el input Origen")
    public void theUserClickOnTheInputOrigen() {
        examplePage.clickOnTheInputOrigen();
    }

    @And("^el usuario completa el orige: \"(.*)\"$")
    public void theUserFillsInOrigin(String origin) {
        examplePage.fillsInOrigin(origin);
    }

    @And("el usuario clickea en la opcion propuesta en origen")
    public void theUserClickOnTheSuggestedOptionInOrigin() {
        examplePage.clickOnTheSuggestedOptionInOrigin();
    }

    @And("el usuario clickea en el input Destino")
    public void theUserClickOnTheInputDestination() {
        examplePage.clickOnTheInputDestination();
    }

    @And("^el usuario completa el destino: \"(.*)\"$")
    public void theUserFillsInDestination(String destination) {
        examplePage.fillsInDestination(destination);
    }

    @And("el usuario clickea en la opcion propuesta en destino")
    public void theUserClickOnTheSuggestedOptionInDestination() {
        examplePage.clickOnTheSuggestedOptionInDestination();
    }

    @And("el usuario clickea el calendario para selecciona una fecha")
    public void theUserClickOnTheCalendarToSelectADate() {
        examplePage.clickOnTheCalendarToSelectADate();
    }

    @And("el usuario clickea la flecha del calendario para buscar otros meses")
    public void theUserClickOnTheCalendarArrowToLookForOtherMonths() {
        examplePage.clickOnTheCalendarArrowToLookForOtherMonths();
    }

    @And("el usuario clickea una fecha del calendario")
    public void theUserClickOnADateInTheCalendar() {
        examplePage.clickOnADateInTheCalendar();
    }

    @And("^el usuario clickea el boton \"Buscar\" para consultar vuelo$")
    public void theUserClickTheBuscarButtonToCheckFlights() {
        examplePage.clickTheBuscarButtonToCheckFlights();
    }

    @And("el usuario selecciona un vuelo disponible")
    public void theUserSelectAnAvailableFlight() {
        examplePage.clickSelectAnAvailableFlight();
    }

    @And("^el usuario clickea el boton \"Elegi\" para seleccioanr el vuelo$")
    public void theUserClickTheElegirButtonToSelectTheFlight() {
        examplePage.clickTheElegirButtonToSelectTheFlight();
    }
    @And("^el usuario clickea el boton \"Ir a asientos\" para seleccionar los asientos$")
    public void theUserClickTheIrAsientosButtonToSelectTheSeats() {
        examplePage.clickTheIrAsientosButtonToSelectTheSeats();
    }

    @And("el usuario clickea primer asiento")
    public void theUserClickTheFirstSeat() {
        examplePage.clickTheFirstSeat();
    }

    @And("el usuario clickea segundo asiento")
    public void theUserClickTheSecondSeat() {
        examplePage.clickTheSecondSeat();
    }

    @And("^el usuario clickea el boton \"Agregar y continuar\" para seleccionar los asientos$")
    public void theUserClickTheAgregarContinuarButtonToSelectTheSeats() {
        examplePage.clickTheAgregarContinuarButtonToSelectTheSeats();
    }

    @And("el usuario agrega Equipaje")
    public void theUserAddsBaggage() {
        examplePage.clickAddsBaggage();
    }

    @And("el usuario clickea opciones de equipaje especial")
    public void theUserClickOnSpecialBaggageOptions() {
        examplePage.clickOnSpecialBaggageOptions();
    }

    @Then("^el usuario al clickea el boton \"Continuar\" se completa exitosamente el registro del vuelo$")
    public void theUserSuccessfullyCompletesTheFlightRegistrationByClickingTheContinuarButton() {
        examplePage.clickTheContinuarButton();
    }

}
