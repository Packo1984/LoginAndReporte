    package steps;

    import static org.junit.Assert.assertTrue;

    import io.cucumber.java.en.And;
    import io.cucumber.java.After;
    import io.cucumber.java.Before;
    import io.cucumber.java.en.Given;
    import io.cucumber.java.en.Then;
    import io.cucumber.java.en.When;
    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;

    public class Steps{
        private WebDriver driver;
        AltaCliente altaCliente;


        @Before()
        public void setup() {
            altaCliente =new AltaCliente(driver);
            driver=altaCliente.chromeDriverConetion();
            altaCliente.visit("http://mxsrvwasmui1t.alico.corp/ClienteUnico/login.jsp");
            driver.manage().window().maximize();
        }

        @Given("^Ingresa al sistema satisfactoriamente (.*) And (.*)$")
        public void ingresaSatisfactoriamente(String usuario, String password) throws InterruptedException {
            altaCliente.SingIn(usuario,password);

        }


        @When("Usuario Ingresa Seccion Clientes")
        public void seccionCliente() throws InterruptedException {
            Thread.sleep(3000);
            altaCliente.clicBtnCliente();
         }

        @And("usuario Ingresa datos mínimos de captura")
        public void usuarioIngresaDatosMínimosDeCaptura() throws InterruptedException {
            altaCliente.datosMinimos();

        }

        @And("usuario captura datos generales")
        public void usuarioCapturaDatosGenerales() throws InterruptedException {
            altaCliente.datosGenerales();
        }

        @And("usuario captura domicilios")
        public void usuarioCapturaDomicilios() throws InterruptedException {
            altaCliente.domicilios();
        }

        @And("usuario captura Lugar de nacimiento")
        public void usuarioCapturaLugarDeNacimiento() throws InterruptedException {
            altaCliente.lugarNacimiento();
        }



        @And("usuario ingresa Telefonos")
        public void usuarioIngresaTelefonos() throws InterruptedException {
            altaCliente.telefonos();
        }

        @And("usuario ingresa Redes Sociales")
        public void usuarioIngresaRedesSociales() {

        }

        @Then("Captura Folio")
        public void CapturaFolio() throws InterruptedException {
            altaCliente.obtieneFolio();
        }

        @After()
        public void quitBrowser() throws InterruptedException {
            Thread.sleep(1000);
            //altaCliente.cerrarSesion();
            // driver.quit();
        }



    }
