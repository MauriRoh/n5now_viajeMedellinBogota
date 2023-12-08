package pages;

import com.core.utility.MasterPage;
import org.junit.Assert;


import static locators.Locators.*;

public class ExamplePage extends MasterPage {
    public void navigateToMainURL() {
        auto_openURLInBrowser();
    }

    public void clickContinuarEnLATAMColombiaButton() { auto_setClickElement(CONTINUAR_EN_LATAM_COLOMBIA_BUTTON_XPATH);}
    public void clickXButtonOfThePopup() { auto_setClickElement(X_BUTTON_XPATH);}
    public void clickDropdownIdayVuelta() { auto_setClickElement(DROPDOWN_IDA_Y_VUELTA_BUTTON_XPATH);}
    public void clickSelectTheFlightOptionSoloIda() { auto_setClickElement(OPTION_SOLO_IDA_BUTTON_XPATH);}
    public void clickDropdownClass() { auto_setClickElement(DROPDOWN_CLASS_BUTTON_XPATH);}
    public void clickSelectClassPremiumEconomy() { auto_setClickElement(CLASS_PREMIUM_ECONOMY_BUTTON_XPATH);}
    public void clickDropdownPasajeros() { auto_setClickElement(DROPDOWN_PASAJEROS_BUTTON_XPATH);}
    public void clickOnTheChildrenSectionPlusButton() { auto_setClickElement(SECTION_PLUS_BUTTON_XPATH);}
    public void clickOnTheInputOrigen() { auto_setClickElement(ORIGEN_INPUT_XPATH);}
    public void fillsInOrigin(String origin) {
        auto_setTextToInput(FILLS_ORIGIN_INPUT_XPATH, origin);
    }
    public void clickOnTheSuggestedOptionInOrigin() { auto_setClickElement(OPTION_IN_ORIGIN_INPUT_XPATH);}
    public void clickOnTheInputDestination() { auto_setClickElement(DESTINATION_INPUT_XPATH);}





    public void verifyHomeTitle() {
        Assert.assertTrue(page.isVisible(HOME_TITLE_XPATH));
    }

    public void clickButtonSwitch(String button) {
        switch (button.toLowerCase()) {
            case "foro":
                clickOnForoButton();
                break;
            case "ingresar":
                clickOnIngresarButtons();
                break;
            default:
                Assert.assertEquals(button,"No button matched", "Invalid button options");
        }
    }

    private void clickOnIngresarButtons() {
        auto_setClickElement(FORO_BUTTON_XPATH);
    }

    private void clickOnForoButton() {
        auto_setClickElement(FORO_BUTTON_XPATH);
    }

    public void clickIngresarButtonForum() {
        auto_setClickElement(INGRESAR_LOGIN_BUTTONS_XPATH);
    }

    public void clickIngresarButtonForumModal() {
        auto_setClickElement(INGRESAR_LOGIN_MODAL_BUTTONS_XPATH);
    }

    public void completeLoginData(String user, String pass) {
        auto_setTextToInput(USUARIO_INPUT_XPATH, user);
        auto_setTextToInput(PASS_INPUT_XPATH, pass);
    }

    public void verifyLogin() {
        auto_setClickElement(USER_LOGIN_IMG_XPATH);
        Assert.assertTrue("Error at login - Invalid username or passwor", auto_getElementText(USER_LOGIN_LBL_XPATH).toLowerCase().contains("autoc0de"));
    }
}
