package stepsDefinitions;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSteps extends ParentSteps {

    @Given("I'm on the google home page")
    public void ImOnGoogleHomePage() throws ClassNotFoundException {
        actions.ImInTheHomePage();
    }

    @When("I search for wwe")
    public void iSearchForWwe() throws ClassNotFoundException {
        actions.SearchFor("WWE");
    }

    @Then("I see results relating to wwe")
    public void iSeeResultsRelatingToWwe() throws ClassNotFoundException {
        actions.ValidateResults();
    }
}

