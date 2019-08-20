package motoresBusqueda.dogpile.Steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import motoresBusqueda.dogpile.PageObject.DogpilePaginaPrincipal;
import motoresBusqueda.dogpile.PageObject.DogpilePaginaResultados;
import net.serenitybdd.core.steps.ScenarioActor;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import java.util.List;
import static org.hamcrest.Matchers.containsString;

public class UsuarioDogPile extends ScenarioActor {
    String actor;

    @Steps (shared = true)
    DogpilePaginaPrincipal paginaPrincipal;

    @Steps(shared = true)
    DogpilePaginaResultados paginaResultados;

    @Step("^#actor ingresa a la pagina principal de dogpile$")
    public void que_el_usuario_entra_en_dogpile() {
        paginaPrincipal.setDefaultBaseUrl("https://www.dogpile.com/");
        paginaPrincipal.open();
    }

    @Step("^#actor realiza una busqueda de: {0}$")
    public void el_usuario_realiza_una_busqueda_de_rock_nacional(String palabraClave) {
        paginaPrincipal.ingresarPalabraClave(palabraClave);
        paginaPrincipal.realizarBusqueda();
    }


    @Step("^#actor deberia poder ver resultados que contengan la palabra: {0}$")
    public void el_usuario_deberia_poder_ver_resultados_que_contengan_la_palabra_rock(String palabraEsperada) {

        List<String> resultado = paginaResultados.obtenerResultado();
        resultado.replaceAll(String::toLowerCase);
        for (int i = 0; i < resultado.size(); i++) {
            System.out.println(resultado.get(i));
        }
        MatcherAssert.assertThat(resultado, Matchers.everyItem(Matchers.containsString(palabraEsperada)));
    }

    @Step("^#actor deberia ver un texto: {0} is relevante con el titulo: {1}$")
    public void el_usuario_deberia_ver_un_texto_relevante_con_el_titulo(String textoResultado, String tituloResultado) {
        String tituloObt = paginaResultados.obtenerTituloResultado(tituloResultado);
        MatcherAssert.assertThat(tituloObt, containsString(tituloObt));
    }


}
