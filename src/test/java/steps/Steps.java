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
        Cliente cliente;

        @Before()
        public void setup() {
            singInPage =new SingInPage(driver);
            driver=singInPage.chromeDriverConetion();
            driver.manage().window().maximize();
        }

        @Given("Usuario esta en el Login")
        @Given("Usuario esta en al pantalla de login de la aplicación automationpractice")
        public void estarPantallaLogin() {
            singInPage.visit("http://mxsrvwasmui1t.alico.corp/ClienteUnico/login.jsp");
        }

        @When("Usuario ingresa credenciales validas")
        public void IngresarCredencialesValidas() throws InterruptedException {
           singInPage.SingIn();
        }


        @When("Usuario Ingresa Seccion Clientes")
        public void seccionCliente() throws InterruptedException {
            Thread.sleep(3000);
            singInPage.clicBtnCliente();
         }

        @When("usuario Ingresa datos mínimos de captura")
        public void usuarioIngresaDatosMínimosDeCaptura() throws InterruptedException {
            singInPage.datosMinimos();

        }

        @When("usuario elige tipo persona")
        public void usuarioEligeTipoPersona() throws InterruptedException {
            singInPage.personaFisica();
        }
        @When("usuario captura datos generales")
        public void usuarioCapturaDatosGenerales() throws InterruptedException {
            singInPage.datosGenerales();
        }

        @When("usuario captura domicilios")
        public void usuarioCapturaDomicilios() throws InterruptedException {
            singInPage.domicilios();
        }

        @Then("muestra pagina de inicio")
        public void muestraPaginaInicio() throws InterruptedException {
            singInPage.isHomeDisplayed();
        }

        @After()
        public void quitBrowser() throws InterruptedException {
            Thread.sleep(1000);
            singInPage.cerrarSesion();
            // driver.quit();
        }



    }
