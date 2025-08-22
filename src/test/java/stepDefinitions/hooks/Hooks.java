package stepDefinitions.hooks;


import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class Hooks {
    @Managed(driver = "chrome")   // Serenity gestiona el WebDriver
    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().clearDriverCache().setup(); // prepara el binario del driver
        setTheStage(new OnlineCast());                               // Screenplay: inicializa el elenco
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();  // cierra el navegador al finalizar
        }
    }
}
