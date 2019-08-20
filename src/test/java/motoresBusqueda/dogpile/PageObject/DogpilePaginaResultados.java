package motoresBusqueda.dogpile.PageObject;

import net.serenitybdd.core.pages.PageObject;

import java.util.List;
import java.util.stream.Collectors;

public class DogpilePaginaResultados extends PageObject {

public static final String TITULO_RESULTADO = ".web-bing__title";
    public static final String TITULO_RESULTADO_ESPECIFICO = "//a[contains(@class, 'web-bing__title') and contains(.,'{0}')]";
    public static final String TEXTO_RESULTADO_ENCONTRADO = "..//span[contains(@class,'web-bing__description')]";

//    @FindBy(className = "web-bing__title") private WebElementFacade titulo;


    public List<String> obtenerResultado(){
    return findAll(TITULO_RESULTADO)
            .stream()
            .map(element->element.getAttribute("textContent"))
            .collect(Collectors.toList());
}

    public String obtenerTituloResultado(String tituloResultado) {
    return findBy(TITULO_RESULTADO_ESPECIFICO,tituloResultado).
            then().findBy(TEXTO_RESULTADO_ENCONTRADO).
            then().getText();
    }
}


















