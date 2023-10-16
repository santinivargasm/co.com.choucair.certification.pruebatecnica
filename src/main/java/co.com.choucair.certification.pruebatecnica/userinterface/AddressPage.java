package co.com.choucair.certification.pruebatecnica.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddressPage {

    public static final Target CITY = Target.the("USER CITY").located(By.id("city"));
    public static final Target ZIP = Target.the("USER ZIP").located(By.id("zip"));
    public static final Target CONTENEDOR_COUNTRY = Target.the("USER CONTENEDOR COUNTRY").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]"));
    public static final Target COUNTRY = Target.the("USER COUNTRY").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span"));
    public static final Target BUTTON_DISPOSITIVES = Target.the("Button to dispositives").located(By.xpath("//a[contains(@class, 'btn btn-blue pull-right')]"));
}
