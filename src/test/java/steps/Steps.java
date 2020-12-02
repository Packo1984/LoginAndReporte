package steps;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

    private WebDriver driver;
    @Before()
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Given("Usuario esta en el Login")
    @Given("Usuario esta en al pantalla de login de la aplicación automationpractice")
    public void estarPantallaLogin() {
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }

    @When("Usuario ingresa credenciales validas")
    public void IngresarCredencialesValidas() {

        driver.findElement(By.id("email")).sendKeys("test.0@test.com");
        driver.findElement(By.name("passwd")).sendKeys("test1234");
        driver.findElement(By.id("SubmitLogin")).click();
    }

    @Then("muestra pagina de inicio")
    public void muestraPaginaInicio() {
        String tituloEsperado = "My account - My Store";
        String tituloActual = driver.getTitle();
        assertEquals(tituloEsperado, tituloActual);
    }

    @After()
    public void quitBrowser() {
        driver.quit();
    }


}
