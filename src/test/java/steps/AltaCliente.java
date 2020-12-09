package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AltaCliente extends Base {
    private Base base;

    public AltaCliente(WebDriver driver) {
        base=new Base(this.driver);
    }

    By user=By.id("login_usuario");
    By pwd=By.id("login_contrasenya");
    By ingresar=By.id("btn");
    By tituloObtenido=By.partialLinkText("Cerrar");

    By btnCliente= By.id("btn_crearCte");
    //Datos minímos
    By listLineaNegocio=By.xpath("//input[@id='lineaNegocioSlct']/ancestor::div/preceding-sibling::div/preceding-sibling::div/input");
    By txtLineaNegocio=By.id("lineaNegocioSlct");
    By listRamo=By.xpath("//input[@id='ramoSlct']/ancestor::div/preceding-sibling::div/preceding-sibling::div/input");
    By txtRamo=By.id("ramoSlct");
    By listProducto=By.xpath("//input[@id='productoSlct']/ancestor::div/preceding-sibling::div/preceding-sibling::div/input");
    By txtProducto=By.id("productoSlct");
    By listRol=By.xpath("//input[@id='rolesSlct']/ancestor::div/preceding-sibling::div/preceding-sibling::div/input");
    By txtRol=By.id("rolesSlct");
    By btnPF=By.cssSelector("span[id='btnDatoPF']");




    //Domicilios
    By seccionDomicilios=By.id("direccionId");
    By btnAgregarDom=By.id("btnAgregarDomicilio");
    By listTipoDom=By.xpath("//div[@id='direccionId']/div[2]/div/div/div/div[2]/div/div/div/div/div/table/tbody/tr/td[1]/div[1]/div[1]");
    By txtTipoDom=By.xpath("//div[@id='direccionId']/div[2]/div/div/div/div[2]/div/div/div/div/div/table/tbody/tr/td[1]/div/div/div[3]/input");
    By opcionCalleAve=By.xpath("//div[@id='direccionId']/div[2]/div/div/div/div[2]/div/div/div/div/div/table/tbody/tr/td[2]");
    By txtCalleAve=By.cssSelector("input[id*='dijit_form_ValidationTextBox']");
    By opcionNumExt=By.xpath("//div[@id='direccionId']/div[2]/div/div/div/div[2]/div/div/div/div/div/table/tbody/tr/td[3]");
    By txtNumExt=By.xpath("//div[@id='direccionId']/div[2]/div/div/div/div[2]/div/div/div/div/div/table/tbody/tr/td[3]/div/div[2]/input");
    By opcionCP=By.xpath("//div[@id='direccionId']/div[2]/div/div/div/div[2]/div/div/div/div/div/table/tbody/tr/td[5]");
    By txtCP=By.xpath("//div[@id='direccionId']/div[2]/div/div/div/div[2]/div/div/div/div/div/table/tbody/tr/td[5]/div/div[3]/input");
    By opcionColonia=By.xpath("//div[@id='direccionId']/div[2]/div/div/div/div[2]/div/div/div/div/div/table/tbody/tr/td[6]");
    By txtColonia=By.xpath("//div[@id='direccionId']/div[2]/div/div/div/div[2]/div/div/div/div/div/table/tbody/tr/td[6]/div/div[3]/input");
    By opcionMunDel=By.xpath("//div[@id='direccionId']/div[2]/div/div/div/div[2]/div/div/div/div/div/table/tbody/tr/td[7]");
    By txtMunDel=By.cssSelector("input[id*='dijit_form_ComboBox']");
    By opcionCiudad=By.xpath("//div[@id='direccionId']/div[2]/div/div/div/div[2]/div/div/div/div/div/table/tbody/tr/td[8]");
    By txtCiudad=By.xpath("//div[@id='direccionId']/div[2]/div/div/div/div[2]/div/div/div/div/div/table/tbody/tr/td[8]/div/div[3]/input");
    By opcionEstado=By.xpath("//div[@id='direccionId']/div[2]/div/div/div/div[2]/div/div/div/div/div/table/tbody/tr/td[9]");
    By txtEstado=By.xpath("//div[@id='direccionId']/div[2]/div/div/div/div[2]/div/div/div/div/div/table/tbody/tr/td[9]/div/div[3]/input");

    By btnAgDom=By.xpath("//div[@id='direccionId']/div[2]/div/div/div/div[2]/div/div/div/div/div/table/tbody/tr/td[15]/div/span/span/span[@title='ok']");
    By btnGuardar=By.xpath("//div[@id='datosTab']/div[2]/span[3]/span/span");
    By btnConfirGuardar=By.xpath("//div[contains(@id,'dijit_Dialog')]/div[2]/div[2]/span[1]/span/span");
    By btnAceptConfirm=By.xpath("(//div[contains(@id,'dijit_Dialog')]/div[2]/div[2]/span[1]/span/span)[2]");
    By txtIdCliente=By.xpath("//div[contains(@id,'dijit_layout_ContentPane')]/table/tbody/tr/td[2]/label/b");

    public void SingIn(String usuario, String password) throws InterruptedException {
        if (isDisplayed(user)){
            type(usuario,user);
            type(password,pwd);
            Click(ingresar);
        }else{
            System.out.println("caja de texto Usuario no está presente");
        }
    }



    public boolean isHomeDisplayed(){
        return isDisplayed(tituloObtenido);
    }

    public void cerrarSesion(){
        Click(tituloObtenido);
    }

    public void clicBtnCliente(){
        Click(btnCliente);
    }

    By etiquetaLineNegocio=By.xpath("//*[text()='INDIVIDUAL PRIVADO']");
    By etiquetaRamo=By.xpath("//*[text()='VIDA']");
    By etiquetaProducto=By.xpath("//*[text()='METALIFE']");
    By etiquetaRol=By.xpath("//*[text()='BENEFICIARIO']");

    public  void datosMinimos() throws InterruptedException {
        Click(listLineaNegocio);
        esperaListDesplegable(etiquetaLineNegocio);
        keyEnter(txtLineaNegocio);

        Click(listRamo);
        esperaListDesplegable(etiquetaRamo);
        keyEnter(txtRamo);

        Click(listProducto);
        esperaListDesplegable(etiquetaProducto);
        keyEnter(txtProducto);

        Click(listRol);
        esperaListDesplegable(etiquetaRol);
        keyTab(txtRol);
        Click(btnPF);
    }

    //Datos Generales
    By listtitulo=By.xpath("//input[@id='tituloID']/ancestor::div/preceding-sibling::div/preceding-sibling::div/input");
    By txtNombre=By.cssSelector("input[id='nombreID']");
    By txtAPaterno=By.cssSelector("input[id='aPatID']");
    By txtAMaterno=By.cssSelector("input[id='aMatID']");
    By txtFNacimiento=By.cssSelector("input[id='fNacID']");
    By txtRFC=By.cssSelector("input[id='rfcID']");
    By txtCURP=By.id("curpID");

    By listGenero=By.xpath("//input[@id='generoID']/ancestor::div/preceding-sibling::div/preceding-sibling::div/input");
    By opcionGenero=By.id("generoID");
    By listEdoCivil=By.xpath("//input[@id='edoCivID']/ancestor::div/preceding-sibling::div/preceding-sibling::div/input");
    By opcionEdoCivil=By.id("edoCivID");
    By listIdentificación=By.xpath("//input[@id='tipoIdID']/ancestor::div/preceding-sibling::div/preceding-sibling::div/input");
    By txtNumIdent=By.id("numIdID");
    By txtNSS=By.id("nssID");


    By etiquetaTitulo=By.xpath("//*[text()='SR.']");
    By masculino=By.xpath("//*[text()='MASCULINO']");
    By edoCivil=By.xpath("//*[text()='SOLTERO (A)']");
    By etiquetaTipoIdent=By.xpath("//*[text()='CEDULA PROFESIONAL']");

    public void datosGenerales() throws InterruptedException {
        Click(listtitulo);
        esperaListDesplegable(etiquetaTitulo);
        keyEnter(listtitulo);

        type("Paco",txtNombre);
        type("Munguia",txtAPaterno);
        type("Contreras",txtAMaterno);
        type("29011984",txtFNacimiento);
        type("PAMU8401293u7",txtRFC);
        type("PAMU840129HHGRRR04",txtCURP);
        Click(listGenero);
        esperaListDesplegable(masculino);
        keyEnter(opcionGenero);
        Click(listEdoCivil);
        esperaListDesplegable(edoCivil);
        keyEnter(opcionEdoCivil);
        Click(listIdentificación);
        esperaListDesplegable(etiquetaTipoIdent);
        keyEnter(listIdentificación);
        type("1234556",txtNumIdent);
        type("98656",txtNSS);
    }

    By seccionLugarNacimiento=By.id("lugarNacId");
    By listPaisNacimiento=By.xpath("//input[@id='paisNacID']/ancestor::div/preceding-sibling::div/preceding-sibling::div/input");
    By txtEdoProv=By.id("edoNacID");
    By txtMpio=By.id("mpioNacID");
    By btnAgregarNacionalidad=By.xpath("//div[@id='nacionalidadId']/table/tbody/tr/td/span/span/span");
    By indexNacionalidad=By.xpath("//div[@id='tblDGPF']/div[2]/div/div/div/div/div/table/tbody/tr/td[@idx='0']");
    By btnCofiNacionalidad=By.xpath("//div[@id='tblDGPF']/div[2]/div/div/div/div/div/table/tbody/tr/td[2]/div/span[1]/span/span");

    By etiquetaPaisNacimiento=By.xpath("//*[text()='MEXICO']");

    public void lugarNacimiento() throws InterruptedException {
        Click(seccionLugarNacimiento);
        Click(listPaisNacimiento);
        esperaListDesplegable(etiquetaPaisNacimiento);
        keyEnter(listPaisNacimiento);
        type("Hidalgo",txtEdoProv);
        type("Huejutla",txtMpio);
        Click(btnAgregarNacionalidad);
        Thread.sleep(1000);
        //Click(indexNacionalidad);
        //Thread.sleep(6000);
        //type("MEXICO",indexNacionalidad);
        //Thread.sleep(1000);
        esperaListDesplegable(btnCofiNacionalidad);

    }

    By etiquetaTipoDom=By.xpath("//*[text()='PARTICULAR']");
    public void domicilios() throws InterruptedException {
        Click(seccionDomicilios);
        esperaListDesplegable(btnAgregarDom);
        Click(listTipoDom);
        esperaListDesplegable(etiquetaTipoDom);

        Click(opcionCalleAve);
        type("Abasolo",txtCalleAve);
        Click(opcionNumExt);
        type("32",txtNumExt);
        Click(opcionCP);
        type("43000",txtCP);
        keyEnter(txtCP);
        Thread.sleep(1000);
        Click(opcionColonia);
        type("HUEJUTLA DE REYES CENTRO",txtColonia);
        keyEnter(txtColonia);

        Click(opcionMunDel);
        type("HUEJUTLA DE REYES",txtMunDel);
        keyEnter(txtMunDel);

        Click(opcionCiudad);
        type("HUEJUTLA DE REYES",txtCiudad);
        keyEnter(txtCiudad);
        Click(opcionEstado);
        type("HIDALGO",txtEstado);
        keyEnter(txtEstado);
        Thread.sleep(500);

        Click(btnAgDom);
    }

    By seccionTelefonos= By.id("telefonoIdPF");
    By btnAgregarTel=By.id("btnAgregarTel");

    By listTipoTel=By.xpath("//div[@id='tblTelPF']/div[2]/div/div/div/div/div/table/tbody/tr/td[@idx='0']");

    public void telefonos() throws InterruptedException {
        Click(seccionTelefonos);
        esperaListDesplegable(btnAgregarTel);
        Thread.sleep(2000);
        Click(listTipoTel);
        Thread.sleep(2000);
        type("MOVIL",listTipoTel);
    }

    By seccionRedesSociales=By.id("redesId_titleBarNode");
    public void redesSociales(){
        Click(seccionRedesSociales);

    }

    public void obtieneFolio() throws InterruptedException {
        //Thread.sleep(500);
        //Click(btnGuardar);
        //Thread.sleep(500);
        //Click(btnConfirGuardar);
        //Thread.sleep(500);
        //obtieneTexto(txtIdCliente);
        //Thread.sleep(500);
        //Click(btnAceptConfirm);



    }



}
