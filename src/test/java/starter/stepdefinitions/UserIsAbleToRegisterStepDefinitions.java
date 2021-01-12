package starter.stepdefinitions;

import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.actions.NavigateActions;
import starter.actions.RegisterActions;
import starter.navigation.FrequentTraveller;
import starter.navigation.NavigateTo;

import java.util.List;
import java.util.Map;

public class UserIsAbleToRegisterStepDefinitions {
    @Steps
    NavigateActions navigate;
    @Given("^A new user has opened the flying high webPage$")
    public void aNewUserHasOpenedTheFlyingHighWebPage() {
        navigate.toTheFlyingHighRegisterPage();
    }

    @DataTableType
    public FrequentTraveller convert(Map<String,String> tableRow){
        return new FrequentTraveller(
                tableRow.get("uniqueusername"),
                tableRow.get("password"),
                tableRow.get("firstName"),
                tableRow.get("lastName"),
                tableRow.get("address"),
                tableRow.get("country")
        );
    }
    @Steps
    RegisterActions register;

    @When("a new user registers:")
    public void aNewUserRegisters(List<FrequentTraveller> details) {
        details.forEach(
                detail->register.withUserDetails(detail)
        );
    }
}
