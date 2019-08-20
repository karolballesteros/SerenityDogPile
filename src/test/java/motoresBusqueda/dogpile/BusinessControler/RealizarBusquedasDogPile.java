package motoresBusqueda.dogpile.BusinessControler;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import motoresBusqueda.dogpile.Steps.UsuarioDogPile;
import net.thucydides.core.annotations.Steps;

public class RealizarBusquedasDogPile {

    @Steps(shared = true)
    UsuarioDogPile usuario;

    @Given("^Que (.+) entra en dogpile$")
    public void ingresa_a_dogpile(String nombreUsuario) {
        usuario.isCalled(nombreUsuario);
        usuario.que_el_usuario_entra_en_dogpile();
    }

    @When("^(.+) realiza una busqueda de: (.+)$")
    public void el_usuario_realiza_una_busqueda_de_rock_nacional(String nombreUsuario, String palabraClave) {
        usuario.isCalled(nombreUsuario);
        usuario.el_usuario_realiza_una_busqueda_de_rock_nacional(palabraClave);
    }


    @Then("^(.+) deberia poder ver resultados que contengan la palabra: (.+)$")
    public void el_usuario_deberia_poder_ver_resultados_que_contengan_la_palabra_rock(String nombreUsuario,String palabraEsperada) {
        usuario.isCalled(nombreUsuario);
        usuario.el_usuario_deberia_poder_ver_resultados_que_contengan_la_palabra_rock(palabraEsperada);
    }

    @Then("^(.+) deberia ver un texto: (.+) is relevante con el titulo: (.+)$")
    public void el_usuario_deberia_ver_un_texto_Rock_de_Argentina_Wikipedia_is_relevante_con_el_titulo_El_rock_and_roll_surgió(String textoResultado, String tituloResultado, String nombreUsuario) {
      usuario.isCalled(nombreUsuario);
      usuario.el_usuario_deberia_ver_un_texto_relevante_con_el_titulo(textoResultado, tituloResultado);
    }






}
