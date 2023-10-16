package co.com.choucair.certification.pruebatecnica.tasks;

import co.com.choucair.certification.pruebatecnica.model.UtestData;
import co.com.choucair.certification.pruebatecnica.userinterface.InformationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;
import static co.com.choucair.certification.pruebatecnica.userinterface.InformationPage.*;


public class FillInformationPage implements Task {

    private List<UtestData> data;

    public FillInformationPage(List<UtestData> data) {
        this.data = data;
    }

    public static FillInformationPage thePage(List<UtestData> data) {
        return Tasks.instrumented(FillInformationPage.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
     actor.attemptsTo(
             Enter.theValue(data.get(0).getName()).into(NAME),
             Enter.theValue(data.get(0).getLastName()).into(LASTNAME),
             Enter.theValue(data.get(0).getEmail()).into(EMAIL),
             SelectFromOptions.byVisibleText(data.get(0).getBirthMonth()).from(MONTH),
             SelectFromOptions.byVisibleText(data.get(0).getBirthDay()).from(DAY),
             SelectFromOptions.byVisibleText(data.get(0).getBirthYear()).from(YEAR),
             Click.on(BUTTON_ADDRES)

     );

    }
}
