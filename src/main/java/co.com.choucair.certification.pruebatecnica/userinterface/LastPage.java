package co.com.choucair.certification.pruebatecnica.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LastPage {

    public static final Target PWD = Target.the("Password").located(By.id("password"));
    public static final Target CONFIRMATION_PWD = Target.the("Confirmation Password").located(By.id("confirmPassword"));
    public static final Target CHECKBOX_01 = Target.the("Checkbox 1").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target CHECKBOX_02 = Target.the("Checkbox 2").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target CHECKBOX_03 = Target.the("Checkbox 3").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target BUTTON_LAST = Target.the("Last Button").located(By.xpath("//a[contains(@class, 'btn btn-blue')]"));
}
