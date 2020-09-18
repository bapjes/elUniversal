package mx.com.eluniversal.paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class AvisoOportunoPage extends BasePage{
    public AvisoOportunoPage(WebDriver driver)
    {
        super(driver);
    }


    By logoLocator =By.cssSelector(".navbar-brand");
    By textoLocator = By.cssSelector("#keyword");
    By variosLocator = By.cssSelector("#menpri li");
    By listTopicsLocator = By.cssSelector(".list-item");


    public void verificarPaginaAvisoOportuno() throws Exception {
        String mainWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        Iterator<String> iterator = allWindows.iterator();
        while (iterator.hasNext())
        {
            String childWindow = iterator.next();
            if(!mainWindow.equalsIgnoreCase(childWindow)) {

                // Switching to Child window
                driver.switchTo().window(childWindow);
                if (isElementpresent(logoLocator))
                {
                    System.out.println("Estás en la página de Aviso Oportuno");
                }
            }
        }
    }

    public void seleccionarDeVarios(String opcion) throws Exception {
        isElementpresent(variosLocator);
        List<WebElement> varios = driver.findElements(variosLocator);
        for (WebElement element: varios)
        {
            if (element.getText().equalsIgnoreCase(opcion))
            {
                element.click();
                System.out.println("Encontré la opción");
                break;
            }
        }
    }

    public void ingresaBusqueda(String texto) throws Exception {
        enterText(textoLocator,texto);
        System.out.println("Ingresé la búsqueda");
    }

    public void validarBusqueda(String cadena)
    {
        WebElement element;
        String descripcion;
        List<WebElement> list = driver.findElements(listTopicsLocator);
        int total = list.size();
        for (int i = 0; i < total; i++) {
            element = list.get(i);
            descripcion = element.findElement(By.cssSelector(".description")).getText();
            if (descripcion.toUpperCase().contains(cadena.toUpperCase()))
            {
                System.out.println("La contiene : "+ descripcion);

            }
            else
            {
                System.out.println("No la contiene :" + descripcion);
            }

        }

    }
}
