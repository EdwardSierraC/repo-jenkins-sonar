package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;
import static userinterfaces.LoginPageCh.*;

public class Login implements Task {
  private final List<Map<String, String>> userData;

  public Login(List<Map<String, String>> userData) {
    this.userData = userData;
  }

  public static Login withCredentials (List<Map<String, String>> userData) {
    return Tasks.instrumented(Login.class, userData);
  }


  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
            Click.on(BTN_LOGIN),
            WaitUntil.the(TXT_USER, isCurrentlyVisible()).forNoMoreThan(20).seconds(),
            Click.on(TXT_USER),
            Enter.theValue(userData.get(0).get("user")).into(TXT_USER),
            Click.on(TXT_PASSWORD),
            Enter.theValue(userData.get(0).get("password")).into(TXT_PASSWORD),
            Click.on(BTN_ACCESS)
    );
  }
}
