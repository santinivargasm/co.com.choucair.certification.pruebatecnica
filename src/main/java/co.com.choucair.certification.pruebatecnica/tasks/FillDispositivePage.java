package co.com.choucair.certification.pruebatecnica.tasks;

import co.com.choucair.certification.pruebatecnica.model.UtestData;
import co.com.choucair.certification.pruebatecnica.userinterface.DispositivesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;
import static co.com.choucair.certification.pruebatecnica.userinterface.DispositivesPage.*;

public class FillDispositivePage implements Task {

    private List<UtestData> data;

    public FillDispositivePage(List<UtestData> data) {
        this.data = data;
    }

    public static FillDispositivePage thePage(List<UtestData> data) {

        return Tasks.instrumented(FillDispositivePage.class, data);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(COMPUTER_CONTENEDOR),
                Enter.theValue(data.get(0).getComputer()).into(COMPUTER).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(VERSION_CONTENEDOR),
                Enter.theValue(data.get(0).getVersion()).into(VERSION).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(LENGUAGE_CONTENEDOR),
                Enter.theValue(data.get(0).getLenguage()).into(LENGUAGE).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(MOVIL_CONTENEDOR),
                Enter.theValue(data.get(0).getMovil()).into(MOVIL).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(MODEL_CONTENEDOR),
                Enter.theValue(data.get(0).getModel()).into(MODEL).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(SYSTEM_CONTENEDOR),
                Enter.theValue(data.get(0).getSystem()).into(SYSTEM).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(BUTTON_LAS_STEP)
        );
    }
}
