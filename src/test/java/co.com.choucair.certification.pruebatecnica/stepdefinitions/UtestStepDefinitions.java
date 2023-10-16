package co.com.choucair.certification.pruebatecnica.stepdefinitions;

import co.com.choucair.certification.pruebatecnica.model.UtestData;

import co.com.choucair.certification.pruebatecnica.questions.Responder;

import co.com.choucair.certification.pruebatecnica.tasks.OpenUp;
import co.com.choucair.certification.pruebatecnica.tasks.FillInformationPage;
import co.com.choucair.certification.pruebatecnica.tasks.FillAddres;
import co.com.choucair.certification.pruebatecnica.tasks.FillDispositivePage;
import co.com.choucair.certification.pruebatecnica.tasks.FillLastPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class UtestStepDefinitions {

        //crea el escenario para el actor
    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast()); }

    @Given("^than user wants to register in utest$")
    public void thanUserWantsToRegisterInUtest() throws Exception {

        theActorCalled("User").wasAbleTo(OpenUp.thePage());

    }

    @When("^user enters the utest page$")
    public void userEntersTheUtestPage(List<UtestData> data) throws Exception {

        theActorCalled("User").attemptsTo(FillInformationPage.thePage(data), FillAddres.thePage(data), FillDispositivePage.thePage(data), FillLastPage.thePage(data)

        );
    }

    @Then("^user makes a registration$")
    public void userMakesARegistration(List<UtestData> data) throws Exception {

        theActorInTheSpotlight().should(GivenWhenThen.seeThat(Responder.aLos(data)));
    }
}
