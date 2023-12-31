package pages;

import com.core.utility.MasterPage;
import org.junit.Assert;

import static locators.Locators.*;

public class ExamplePage extends MasterPage {
    public void navigateToMainURL() { auto_openURLInBrowser(); }
    public void clickContinuarEnLATAMColombiaButton() { auto_setClickElement(CONTINUAR_EN_LATAM_COLOMBIA_BUTTON_XPATH);}
    public void clickXButtonOfThePopup() { auto_setClickElement(X_BUTTON_XPATH);}
    public void clickDropdownIdayVuelta() { auto_setClickElement(DROPDOWN_IDA_Y_VUELTA_BUTTON_XPATH);}
    public void clickSelectTheFlightOptionSoloIda() { auto_setClickElement(OPTION_SOLO_IDA_BUTTON_XPATH);}
    public void clickDropdownClass() { auto_setClickElement(DROPDOWN_CLASS_BUTTON_XPATH);}
    public void clickSelectClassPremiumEconomy() { auto_setClickElement(CLASS_PREMIUM_ECONOMY_BUTTON_XPATH);}
    public void clickDropdownPasajeros() { auto_setClickElement(DROPDOWN_PASAJEROS_BUTTON_XPATH);}
    public void clickOnTheChildrenSectionPlusButton() { auto_setClickElement(SECTION_PLUS_BUTTON_XPATH);}
    public void clickSearchCard() { auto_setClickElement(SEARCH_CARD_XPATH);}
    public void clickOnTheInputOrigen() { auto_setClickElement(ORIGEN_INPUT_XPATH);}
    public void fillsInOrigin(String origin) {
        auto_setTextToInput(FILLS_ORIGIN_INPUT_XPATH, origin);
    }
    public void clickOnTheSuggestedOptionInOrigin() { auto_setClickElement(OPTION_IN_ORIGIN_INPUT_XPATH);}
    public void clickOnTheInputDestination() { auto_setClickElement(DESTINATION_INPUT_XPATH);}
    public void fillsInDestination(String destination) {
        auto_setTextToInput(FILLS_DESTINATION_INPUT_XPATH, destination);
    }
    public void clickOnTheSuggestedOptionInDestination() { auto_setClickElement(OPTION_IN_DESTINATION_INPUT_XPATH);}
    public void clickOnTheCalendarToSelectADate() { auto_setClickElement(CALENDAR_INPUT_XPATH);}
    public void clickOnTheCalendarArrowToLookForOtherMonths() { auto_setClickElement(CALENDAR_LOOK_FOR_OTHER_MONTHS_BUTTON_XPATH);}
    public void clickOnADateInTheCalendar() { auto_setClickElement(DATE_CALENDAR_TD_XPATH);}
    public void clickTheBuscarButtonToCheckFlights() { auto_setClickElement(BUSCAR_BUTTON_XPATH);}
    public void clickSelectAnAvailableFlight() { auto_setClickElement(AVAILABLE_FLIGHT_CARD_XPATH);}
    public void clickTheElegirButtonToSelectTheFlight() { auto_setClickElement(ELEGIR_BUTTON_XPATH);}
    public void clickTheIrAsientosButtonToSelectTheSeats() { auto_setClickElement(IR_ASIENTOS_BUTTON_XPATH);}
    public void clickTheFirstSeat() { auto_setClickElement(FIRST_SEAT_BUTTON_XPATH);}
    public void clickTheSecondSeat() { auto_setClickElement(SECOND_SEAT_BUTTON_XPATH);}
    public void clickTheAgregarContinuarButtonToSelectTheSeats() { auto_setClickElement(AGREGAR_Y_CONTINUAR_BUTTON_XPATH);}
    public void clickAddsBaggage() { auto_setClickElement(ADDS_BAGGAGE_BUTTON_XPATH);}
    public void clickOnSpecialBaggageOptions() { auto_setClickElement(SPECIAL_BAGGAGE_BUTTON_XPATH);}
    public void clickTheContinuarButton() { auto_setClickElement(CONTINUAR_FINISH_PROCES_BUTTON_XPATH);}

}
