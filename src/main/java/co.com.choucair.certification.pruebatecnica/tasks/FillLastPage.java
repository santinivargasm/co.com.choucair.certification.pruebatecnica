package co.com.choucair.certification.pruebatecnica.tasks;

import co.com.choucair.certification.pruebatecnica.model.UtestData;
import co.com.choucair.certification.pruebatecnica.userinterface.LastPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.choucair.certification.pruebatecnica.userinterface.InformationPage.BUTTON_ADDRES;
import static co.com.choucair.certification.pruebatecnica.userinterface.LastPage.*;

public class FillLastPage implements Task {

    private List<UtestData> data;

    public FillLastPage(List<UtestData> data) {
        this.data = data;
    }

    public static FillLastPage thePage(List<UtestData> data) {
        return Tasks.instrumented(FillLastPage.class, data);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(data.get(0).getPwd()).into(PWD),
                Enter.theValue(data.get(0).getPwd()).into(CONFIRMATION_PWD),
                Click.on(CHECKBOX_01),
                Click.on(CHECKBOX_02),
                Click.on(CHECKBOX_03),
                Click.on(BUTTON_LAST)
        );
    }
}
