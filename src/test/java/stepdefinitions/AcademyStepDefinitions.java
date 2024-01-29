package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.Constantes;
import static models.Constantes.URL;

import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import questions.ValidarNombreAnalista;
import tasks.Login;
import java.util.List;
import java.util.Map;


public class AcademyStepDefinitions {
  @Before
  public void setStage()
  {
    OnStage.setTheStage(new OnlineCast());
  }

  @Given("I have to login in the website")
  public void iHaveToLoginInTheWebsite() {
    OnStage.theActorCalled(Constantes.ACTOR).wasAbleTo(Open.url(URL));
  }
  @When("I type my username and password")
  public void iTypeMyUsernameAndPassword(DataTable table) {
    List<Map<String, String>> userData = table.asMaps();
    OnStage.theActorInTheSpotlight().attemptsTo(
            Login.withCredentials(userData)
    );

  }
  @Then("^I should see the courses (.*)")
  public void iShouldSeeTheCoursesPensumChoucair(String msgSuccess) {
    OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(
            ValidarNombreAnalista.enLaWeb(msgSuccess)
    ));
  }
}
