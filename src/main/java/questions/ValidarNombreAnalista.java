package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static models.Constantes.ACTOR;
import static userinterfaces.HomePageCh.USER_NAME;

public class ValidarNombreAnalista implements Question <Boolean>{
  private String pensumChoucair;

  public ValidarNombreAnalista (String pensumChoucair){
    this.pensumChoucair = pensumChoucair;
  }

  public static ValidarNombreAnalista enLaWeb (String pensumChoucair) {
    return new ValidarNombreAnalista(pensumChoucair);
  }

  @Override
  // Validar texto en campo html
  public Boolean answeredBy(Actor edward){
    boolean result;
    String nameInWeb = String.valueOf(USER_NAME);
    System.out.println("Nombre de usuario " + nameInWeb);
    if (nameInWeb.equals(pensumChoucair)) {
      result = true;
    } else {
      result = false;
    }
    return result;
  }
}
