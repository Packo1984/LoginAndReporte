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

        @And("^usuario Ingresa datos mínimos de captura (.*) And (.*) And (.*) And (.*)$")
        public void usuarioIngresaDatosMínimosDeCaptura(String lineaNegocio, String ramo, String producto,
                                                        String rol) throws InterruptedException {
            altaCliente.datosMinimos(lineaNegocio, ramo, producto, rol);

        }

        @And("^usuario captura datos generales (.*) And (.*) And (.*) And (.*) And (.*) And (.*) And (.*) And (.*) And (.*) And (.*) And (.*) And (.*)$")
        public void usuarioCapturaDatosGenerales(String titulo, String nombre, String aPaterno, String aMaterno,
                                                  String fecNaci, String rfc, String curp, String genero, String edoCivil,
                                                 String tipoIdent, String numIdent, String nss) throws InterruptedException {
            altaCliente.datosGenerales(titulo, nombre, aPaterno, aMaterno, fecNaci,
                    rfc, curp, genero, edoCivil,
                    tipoIdent, numIdent, nss);
        }

        @And("^usuario captura Lugar de nacimiento (.*) And (.*) And (.*) And (.*)$")
        public void usuarioCapturaLugarDeNacimiento(String paisNaci,String edoPro,String ciuPoblacion, String nacionalidad) throws InterruptedException {
            altaCliente.lugarNacimiento(paisNaci, edoPro, ciuPoblacion, nacionalidad);
        }

        @And("^usuario captura domicilios (.*) And (.*) And (.*) And (.*) And (.*) And (.*) And (.*) And (.*)$")
        public void usuarioCapturaDomicilios( String tipoDomic, String calleAvenida, String numExt, String cp, String colonia,
                                              String municDeleg, String ciudad, String estado) throws InterruptedException {
            altaCliente.domicilios(tipoDomic, calleAvenida, numExt, cp, colonia, municDeleg, ciudad, estado);
        }

        @And("^usuario ingresa Telefonos (.*) And (.*)$")
        public void usuarioIngresaTelefonos(String Tipo, String numTel) throws InterruptedException {
            altaCliente.telefonos(Tipo, numTel);
        }

        @And("^usuario ingresa ocupacion (.*) And (.*) And (.*)$")
        public void usuarioIngresaocupacion(String ocupacion, String claveOcupa, String detalleOcupa
        ) throws InterruptedException {
            altaCliente.pestañaOcupacion(ocupacion, claveOcupa, detalleOcupa);
        }

        @And("^usuario ingresa percepcion mensual (.*)$")
        public void usuarioIngresaPercepcionMensualNgreosMensual(String ingresoMensual) throws InterruptedException {
            altaCliente.percepcionMensual(ingresoMensual);
        }


        @And("^usuario ingresa perfil transaccional (.*) And (.*) And (.*) And (.*)$")
        public void usuarioIngresaPerfilTransaccional(String apoNumTranAnual, String retNumTranAnual, String apoMonTrnAnual, String retMonTrnAnual) throws InterruptedException {
            altaCliente.perfilTransaccional(apoNumTranAnual, retNumTranAnual, apoMonTrnAnual, retMonTrnAnual);
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


        @And("^Usuario ingresa Declaracion de impuestos (.*)$")
        public void usuarioIngresaDeclaracionDeImpuestos(String funcionesPublicas) {
            altaCliente.declaracionImpuestos(funcionesPublicas);
        }

        @And("Usuario ingresa Aviso de Privacidad")
        public void usuarioIngresaAvisoDePrivasidad() {
            altaCliente.avisoPrivacidad();
        }
    }
