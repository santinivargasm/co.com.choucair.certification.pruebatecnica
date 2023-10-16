package co.com.choucair.certification.pruebatecnica.tasks;

import co.com.choucair.certification.pruebatecnica.model.UtestData;
import co.com.choucair.certification.pruebatecnica.userinterface.AddressPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.util.List;
import static co.com.choucair.certification.pruebatecnica.userinterface.AddressPage.*;

public class FillAddres implements Task {

    private List<UtestData> data;

    public FillAddres(List<UtestData> data) {
        this.data = data;
    }

    public static FillInformationPage thePage(List<UtestData> data) {
        return Tasks.instrumented(FillInformationPage.class, data);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
            Enter.theValue(data.get(0).getCity()).into(CITY),
            Hit.the(Keys.ARROW_DOWN).into(CITY),
            Hit.the(Keys.ENTER).into(CITY),
            Enter.theValue(data.get(0).getZip()).into(ZIP),
            Click.on(CONTENEDOR_COUNTRY),
            Enter.theValue(data.get(0).getCountry()).into(COUNTRY).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
            Click.on(BUTTON_DISPOSITIVES)
            );
    }
}
