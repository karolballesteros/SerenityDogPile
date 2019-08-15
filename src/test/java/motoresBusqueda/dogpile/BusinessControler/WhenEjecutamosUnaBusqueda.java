package motoresBusqueda.dogpile.BusinessControler;

import motoresBusqueda.dogpile.Steps.UsuarioDogPile;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class WhenEjecutamosUnaBusqueda {

    String actor;

    @Steps
    UsuarioDogPile karol;

    @Managed
    WebDriver driver;

    @Test
    public void deberiamosVerResultadosRelevantes() {

        karol.ingresaDogPile();
        karol.buscaPalabraClave("Rock nacional");
        karol.deberiaEncontrarResultados("rock");

    }

}
