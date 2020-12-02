    package steps;

    import static org.junit.Assert.assertTrue;

    import org.openqa.selenium.By;
    import io.cucumber.java.After;
    import io.cucumber.java.Before;
    import io.cucumber.java.en.Given;
    import io.cucumber.java.en.Then;
    import io.cucumber.java.en.When;
    import org.openqa.selenium.WebDriver;

    import java.security.PrivateKey;

    public class Steps{
        private WebDriver driver;
        SingInPage singInPage;

        @Before()
        public void setup() {
            singInPage =new SingInPage(driver);
            driver=singInPage.chromeDriverConetion();
        }

        @Given("Usuario esta en el Login")
        @Given("Usuario esta en al pantalla de login de la aplicación automationpractice")
        public void estarPantallaLogin() {
            singInPage.visit("http://mxsrvwasmui1t.alico.corp/ClienteUnico/login.jsp");
        }

        @When("Usuario ingresa credenciales validas")
        public void IngresarCredencialesValidas() {
           singInPage.SingIn();
        }

        @Then("muestra pagina de inicio")
        public void muestraPaginaInicio() throws InterruptedException {
            Thread.sleep(10000);
            singInPage.isHomeDisplayed();
        }

        @After()
        public void quitBrowser() throws InterruptedException {
            Thread.sleep(10000);
            //driver.quit();
        }
    }
