package starter.actions;

import net.serenitybdd.core.steps.UIInteractionSteps;
import starter.navigation.FrequentTraveller;

import static starter.actions.RegisterPage.*;

public class RegisterActions extends UIInteractionSteps {
    public void withUserDetails(FrequentTraveller frequentTraveller) {
        $(USERNAME).sendKeys(frequentTraveller.getUniqueUserName());
        $(PASSWORD).sendKeys(frequentTraveller.getPassword());
        $(FIRST_NAME).sendKeys(frequentTraveller.getFirstName());
        $(LAST_NAME).sendKeys(frequentTraveller.getLastName());
        $(ADDRESS).sendKeys(frequentTraveller.getAddress());
        $(COUNTRY).sendKeys(frequentTraveller.getCountry());
        $(REGISTER_BUTTON).click();
    }
}
