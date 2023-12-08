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

    @And("el usuario clickea en el input Origen")
    public void theUserClickOnTheInputOrigen() {
        examplePage.clickOnTheInputOrigen();
    }

    @And("^el usuario completa con \"(.*)\" en el input$")
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

    @And("^el usuario completa con \"(.*)\" en el input$")
    public void theUserFillsInOrigin(String origin) {
        examplePage.fillsInOrigin(origin);
    }









    @Given("the user is on the home screen of Underc0de.org")
    public void theUserIsOnTheHomeScreenOfUndercDeOrg() {
        examplePage.navigateToMainURL();
        examplePage.verifyHomeTitle();
    }

    @And("^the user click the \"(.*)\" button$")
    public void theUserClickTheButton(String button) {
        examplePage.clickButtonSwitch(button);
    }
    @And("^the user click the \"INGRESAR\" button of the forum$")
    public void theUserClickTheINGRESARButtonOfTheForum() {
        examplePage.clickIngresarButtonForum();
    }

    @And("^the user click the \"INGRESAR\" button of the forum modal$")
    public void theUserClickTheINGRESARButtonOfTheForumModal() {
        examplePage.clickIngresarButtonForumModal();
    }

    @And("^the user complete te user information. Usuario: \"(.*)\" Contraseña: \"(.*)\"$")
    public void theUserCompleteTeUserInformationUsuarioUserContraseñaPass(String user, String pass) {
        examplePage.completeLoginData(user, pass);
    }

    @Then("the user verifies that they are logged in.")
    public void theUserVerifiesThatTheyAreLoggedIn() {
        examplePage.verifyLogin();
    }

}
