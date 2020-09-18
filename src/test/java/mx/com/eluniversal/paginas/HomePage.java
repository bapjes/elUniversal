package mx.com.eluniversal.paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends BasePage {

    By inglesLocator = By.xpath("//ul[@id='main-menu']//a[@href= '/english']");
    By logoLocator = By.cssSelector("#top-nav .logo");
    By closeLocator = By.cssSelector("#close");
    By menuLocator = By.cssSelector(".menu li");


    public HomePage(WebDriver driver) {
        super(driver);
    }


    public void navegarPagina(String url) {
        driver.get(url);
        System.out.println("La página del universal fué cargada");
    }

    public void verificarHomePage() throws Exception {
        clickonElement(closeLocator);
        isElementpresent(logoLocator);
        System.out.println("Estas en la página del universal");

    }

    public void seleccionarSeccionIngles() throws Exception {
        clickonElement(inglesLocator);
        System.out.println("Elejiste la sección de inglés");

    }

    public void seleccionarDeMenu(String opcion) throws Exception {
        isElementpresent(menuLocator);
        List<WebElement> menu = driver.findElements(menuLocator);

       for (WebElement element: menu)
        {
            //System.out.println(element.getText());
            if (element.getText().equals(opcion.trim()))
            {
                element.click();
                System.out.println("La opción del menu " + opcion.trim() + " fué seleccionada" );
                break;
            }
        }
    }
}
