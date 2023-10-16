package co.com.choucair.certification.pruebatecnica.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://utest.com/")
public class UtestPage extends PageObject {

    public static final Target JOIN = Target.the("Button to start registration process").located(By.xpath("//a[contains(@class, 'unauthenticated-nav-bar__sign-up')]"));

}
