package motoresBusqueda.dogpile.Steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import motoresBusqueda.dogpile.PageObject.DogpilePaginaPrincipal;
import motoresBusqueda.dogpile.PageObject.DogpilePaginaResultados;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

import java.util.List;

import static org.hamcrest.Matchers.containsString;


public class UsuarioDogPile {

    String actor;

    @Steps
    DogpilePaginaPrincipal paginaPrincipal;
    @Steps
    DogpilePaginaResultados paginaResultados;

    @Given("^Que el usuario entra en dogpile$")
    public void que_el_usuario_entra_en_dogpile() {
        paginaPrincipal.open();
    }

    @When("^El usuario realiza una busqueda de: (.*)$")
    public void el_usuario_realiza_una_busqueda_de_rock_nacional(String palabraClave) {
        paginaPrincipal.ingresarPalabraClave(palabraClave);
        paginaPrincipal.realizarBusqueda();
    }

    @Then("^El usuario deberia poder ver resultados que contengan la palabra: (.*)$")
    public void el_usuario_deberia_poder_ver_resultados_que_contengan_la_palabra_rock(String palabraEsperada) {

        List<String> resultado = paginaResultados.obtenerResultado();
        resultado.replaceAll(String::toLowerCase);
        for (int i = 0; i < resultado.size(); i++) {
            System.out.println(resultado.get(i));
        }
        MatcherAssert.assertThat(resultado, Matchers.everyItem(Matchers.containsString(palabraEsperada)));
    }


    @Step("#actor selecciona el resultado especifico de Wikipedia {0} que contiene {1}")
    public void verResultadoEspecifico(String tituloResultado, String descripcion) {
        String tituloObt = paginaResultados.obtenerTituloResultado(tituloResultado);
        MatcherAssert.assertThat(tituloObt, containsString(tituloObt));



    }
}
