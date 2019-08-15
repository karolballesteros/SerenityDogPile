package motoresBusqueda.dogpile.BusinessControler;

import motoresBusqueda.dogpile.Steps.UsuarioDogPile;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class WhenBuscoResultadosConTexto {

    String actor;

    @Steps
    UsuarioDogPile karol;

    @Managed
    WebDriver driver;


    @Test
    public void resultadoEspecifico(){
        karol.ingresaDogPile();
        karol.buscaPalabraClave("Rock nacional");
        karol.verResultadoEspecifico("Rock de Argentina - Wikipedia, la enciclopedia libre", "El rock and roll surgió como género musical en los Estados Unidos");
    }
}
