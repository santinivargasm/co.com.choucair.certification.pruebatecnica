package co.com.choucair.certification.pruebatecnica.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InformationPage {

    public static final Target NAME = Target.the("USER NAME").located(By.id("firstName"));
    public static final Target LASTNAME = Target.the("USER LAST NAME").located(By.id("lastName"));
    public static final Target EMAIL = Target.the("USER EMAIL").located(By.id("email"));
    public static final Target MONTH = Target.the("USER BIRTH MONTH").located(By.id("birthMonth"));
    public static final Target DAY = Target.the("USER BIRTH DAY").located(By.id("birthDay"));
    public static final Target YEAR = Target.the("USER BIRTH YEAR").located(By.id("birthYear"));
    public static final Target BUTTON_ADDRES = Target.the("BUTTON TO GO TO ADDRESS").located(By.xpath("//a[contains(@class, 'btn btn-blue')]"));
}
