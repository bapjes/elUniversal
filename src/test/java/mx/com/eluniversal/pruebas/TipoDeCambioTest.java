package mx.com.eluniversal.pruebas;

import org.junit.Test;

public class TipoDeCambioTest extends BaseTest{

    @Test
    public void tipoDeCambio() throws Exception {
        String url = "https://www.eluniversal.com.mx/";
        home.navegarPagina(url);
        home.verificarHomePage();
        home.seleccionarSeccionIngles();

        englishNews.verificarPaginaIngles();
        englishNews.verificarTipoCambioNumero();
        englishNews.verificarTipoCambioPorcentajes();

    }


}
