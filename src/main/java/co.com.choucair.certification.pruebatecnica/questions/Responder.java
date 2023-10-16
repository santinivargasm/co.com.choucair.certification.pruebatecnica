package co.com.choucair.certification.pruebatecnica.questions;

import co.com.choucair.certification.pruebatecnica.model.UtestData;
import co.com.choucair.certification.pruebatecnica.userinterface.LastPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class Responder implements Question<Boolean> {

    private List<UtestData> data;

    public Responder(List<UtestData> data) {
        this.data = data;
    }

    public static Responder aLos(List<UtestData> data) {
        return new Responder(data);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String final_button = Text.of(LastPage.BUTTON_LAST).viewedBy(actor).asString();
        return data.get(0).getFinalText().equals(final_button);
    }
}
