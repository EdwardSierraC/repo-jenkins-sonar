package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPageCh {
  public static final Target BTN_LOGIN= Target.the("Botón ingresar").located(By.xpath("//a[contains(.,'Ingresar')]"));
  public static final Target TXT_USER= Target.the("Input user").located(By.id("username"));
  public static final Target TXT_PASSWORD= Target.the("Input password").located(By.id("password"));
  public static final Target BTN_ACCESS= Target.the("Botón para acceder").located(By.xpath("//button[@type='submit'][contains(.,'Acceder')]"));
}
