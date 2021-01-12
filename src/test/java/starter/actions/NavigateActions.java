package starter.actions;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class NavigateActions extends UIInteractionSteps {
    @Step("Open the flying high register page")
    public void toTheFlyingHighRegisterPage() {
        openUrl("https://floating-fortress-88130.herokuapp.com/register");
    }
}
