package mx.com.eluniversal.paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class EnglishPage extends BasePage {

    By labelLocator = By.cssSelector(".ceh-PortadaDeSeccion_Titulo");
    By tipoCambioLocator = By.cssSelector("#wg_2128452");
    By tipoCambioCompraNumero = By.cssSelector(".w-v2-TipoCambio_Contenedor-Compra .w-v2-TipoCambio_Numero");
    By tipoCambioCompraPorcentaje = By.cssSelector(".w-v2-TipoCambio_Contenedor-Compra .w-v2-TipoCambio_Numero+p");
    By tipoCambioVentaNumero = By.cssSelector(".w-v2-TipoCambio_Contenedor-Venta .w-v2-TipoCambio_Numero");
    By tipoCambioVentaporcentaje = By.cssSelector(".w-v2-TipoCambio_Contenedor-Venta .w-v2-TipoCambio_Numero+p");


    public EnglishPage(WebDriver driver) {
        super(driver);
    }

    public void verificarPaginaIngles() throws Exception {
        isElementpresent(labelLocator);
        String label = "English";
        assertEquals("No estas en la página de inglés", label, driver.findElement(labelLocator).getText().trim());
        System.out.println("Estas en la página de inglés:" + driver.findElement(labelLocator).getText());
    }

    public void verificarTipoCambioNumero() throws Exception {
        isElementpresent(tipoCambioLocator);
        isElementpresent(tipoCambioCompraNumero);
        isElementpresent(tipoCambioVentaNumero);

        System.out.println("Tipo de Cambio :");
        System.out.println(driver.findElement(tipoCambioCompraNumero).getText());
        System.out.println(driver.findElement(tipoCambioVentaNumero).getText());
    }

    public void verificarTipoCambioPorcentajes() throws Exception {
        isElementpresent(tipoCambioCompraNumero);
        isElementpresent(tipoCambioCompraPorcentaje);
        isElementpresent(tipoCambioVentaNumero);
        isElementpresent(tipoCambioVentaporcentaje);

        System.out.println("Porcentajes:");
        System.out.println(driver.findElement(tipoCambioCompraNumero).getText());
        System.out.println(driver.findElement(tipoCambioCompraPorcentaje).getText());
        System.out.println(driver.findElement(tipoCambioCompraPorcentaje).getAttribute("class"));
        System.out.println(driver.findElement(tipoCambioCompraPorcentaje).getCssValue("color"));

        System.out.println(driver.findElement(tipoCambioVentaNumero).getText());
        System.out.println(driver.findElement(tipoCambioVentaporcentaje).getText());

        System.out.println(driver.findElement(tipoCambioVentaporcentaje).getAttribute("class"));
        System.out.println(driver.findElement(tipoCambioVentaporcentaje).getCssValue("color"));
    }
}
