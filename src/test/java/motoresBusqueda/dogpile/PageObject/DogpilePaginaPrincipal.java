package motoresBusqueda.dogpile.PageObject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.dogpile.com/")
public class DogpilePaginaPrincipal extends PageObject{

@FindBy(id = "q") private WebElementFacade  txtBuscador;
@FindBy(xpath = "//*[@id=\"search\"]/button") private WebElementFacade btnBuscar;


    public void ingresarPalabraClave(String palabraClave) {
        txtBuscador.type(palabraClave);
    }

    public void realizarBusqueda() {
        btnBuscar.click();
    }
}
