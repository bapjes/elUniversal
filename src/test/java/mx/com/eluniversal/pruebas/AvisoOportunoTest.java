package mx.com.eluniversal.pruebas;

import org.junit.Test;

public class AvisoOportunoTest extends BaseTest {
    @Test
    public void avisoOportunoBuscarInmuebles() throws Exception {
        String url = "https://www.eluniversal.com.mx/";
        home.navegarPagina(url);
        home.verificarHomePage();
        home.seleccionarDeMenu("AVISO OPORTUNO");

        avisoOportuno.verificarPaginaAvisoOportuno();
        avisoOportuno.seleccionarDeVarios("Inmuebles");
        avisoOportuno.ingresaBusqueda("casas");
        avisoOportuno.validarBusqueda("casas");


    }
}
