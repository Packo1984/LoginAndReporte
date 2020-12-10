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



    public  void datosMinimos(String lineaNegocio, String ramo, String producto,
                              String rol) throws InterruptedException {
        By etiquetaLineNegocio=By.xpath("//*[text()='"+lineaNegocio+"']");
        By etiquetaRamo=By.xpath("//*[text()='"+ramo+"']");
        By etiquetaProducto=By.xpath("//*[text()='"+producto+"']");
        By etiquetaRol=By.xpath("//*[text()='"+rol+"']");

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




    public void datosGenerales(String titulo, String nombre, String aPaterno, String aMaterno,
                               String fecNaci, String rfc, String curp, String genero, String edoCivil,
                               String tipoIdent, String numIdent, String nss) throws InterruptedException {

        By etiquetaTitulo=By.xpath("//*[text()='"+titulo+"']");
        By etiquetaMasculino=By.xpath("//*[text()='"+genero+"']");
        By etiquetaEdoCivil=By.xpath("//*[text()='"+edoCivil+"']");
        By etiquetaTipoIdent=By.xpath("//*[text()='"+tipoIdent+"']");

        Click(listtitulo);
        esperaListDesplegable(etiquetaTitulo);
        keyEnter(listtitulo);

        type(nombre,txtNombre);
        type(aPaterno,txtAPaterno);
        type(aMaterno,txtAMaterno);
        type(fecNaci,txtFNacimiento);
        type(rfc,txtRFC);
        type(curp,txtCURP);
        Click(listGenero);
        esperaListDesplegable(etiquetaMasculino);
        keyEnter(opcionGenero);
        Click(listEdoCivil);
        esperaListDesplegable(etiquetaEdoCivil);
        keyEnter(opcionEdoCivil);
        Click(listIdentificación);
        esperaListDesplegable(etiquetaTipoIdent);
        keyEnter(listIdentificación);
        type(numIdent,txtNumIdent);
        type(nss,txtNSS);
    }

    By seccionLugarNacimiento=By.id("lugarNacId");
    By listPaisNacimiento=By.xpath("//input[@id='paisNacID']/ancestor::div/preceding-sibling::div/preceding-sibling::div/input");
    By txtEdoProv=By.id("edoNacID");
    By txtMpio=By.id("mpioNacID");
    By btnAgregarNacionalidad=By.xpath("//div[@id='nacionalidadId']/table/tbody/tr/td/span/span/span");
    By listNacionalidad=By.xpath("//div[@id='tblDGPF']/div[2]/div/div/div/div/div/table/tbody/tr/td[1]/div/div[1]/input");
    By txtNacionalidad=By.xpath("//div[@id='tblDGPF']/div[2]/div/div/div/div/div/table/tbody/tr/td[1]/div/div[3]/input");
    By btnCofiNacionalidad=By.xpath("//div[@id='tblDGPF']/div[2]/div/div/div/div/div/table/tbody/tr/td[2]/div/span[1]/span/span");

    public void lugarNacimiento(String paisNaci,String edoPro,String ciuPoblacion, String nacionalidad) throws InterruptedException {
        Click(seccionLugarNacimiento);
        Click(listPaisNacimiento);

        By etiquetaPaisNacimiento=By.xpath("//*[text()='"+paisNaci+"']");
        esperaListDesplegable(etiquetaPaisNacimiento);
        keyEnter(listPaisNacimiento);

        type(edoPro,txtEdoProv);
        type(ciuPoblacion,txtMpio);
        Click(btnAgregarNacionalidad);

        Click(listNacionalidad);
        Thread.sleep(1000);
        type(nacionalidad,txtNacionalidad);

        esperaListDesplegable(btnCofiNacionalidad);
    }


    public void domicilios(String tipoDomic, String calleAvenida, String numExt, String cp, String colonia,
                           String municDeleg, String ciudad, String estado) throws InterruptedException {


        Click(seccionDomicilios);
        esperaListDesplegable(btnAgregarDom);

        Click(listTipoDom);
        By etiquetaTipoDom=By.xpath("//*[text()='"+tipoDomic+"']");
        esperaListDesplegable(etiquetaTipoDom);

        Click(opcionCalleAve);
        type(calleAvenida,txtCalleAve);
        Click(opcionNumExt);
        type(numExt,txtNumExt);
        Click(opcionCP);
        type(cp,txtCP);
        keyEnter(txtCP);
        Thread.sleep(1000);
        Click(opcionColonia);
        type(colonia,txtColonia);
        keyEnter(txtColonia);

        Click(opcionMunDel);
        type(municDeleg,txtMunDel);
        keyEnter(txtMunDel);

        Click(opcionCiudad);
        type(ciudad,txtCiudad);
        keyEnter(txtCiudad);
        Click(opcionEstado);
        type(estado,txtEstado);
        keyEnter(txtEstado);
        Thread.sleep(500);

        Click(btnAgDom);
    }

    By seccionTelefonos= By.id("telefonoIdPF");
    By btnAgregarTel=By.id("btnAgregarTel");
    By listTipoTel=By.xpath("//div[@id='tblTelPF']/div[2]/div/div/div/div/div/table/tbody/tr/td[1]/div/div[1]/input");
    By txtTipoTel=By.xpath("//div[@id='tblTelPF']/div[2]/div/div/div/div/div/table/tbody/tr/td[1]/div/div[3]/input");
    By columnaNumTel=By.xpath("//div[@id='tblTelPF']/div[2]/div/div/div/div/div/table/tbody/tr/td[2]");
    By txtNumTel=By.xpath("//div[@id='tblTelPF']/div[2]/div/div/div/div/div/table/tbody/tr/td[2]/div/div[2]/input");
    By btnOkTel=By.xpath("//div[@id='tblTelPF']/div[2]/div/div/div/div/div/table/tbody/tr/td[4]/div/span[1]/span/span");


    public void telefonos(String Tipo, String numTel) throws InterruptedException {
        Click(seccionTelefonos);
        esperaListDesplegable(btnAgregarTel);

        Click(listTipoTel);
        By etiquetaTipoTel=By.xpath("//*[text()='"+Tipo+"']");
        esperaListDesplegable(etiquetaTipoTel);
        keyEnter(listTipoTel);

        Click(columnaNumTel);
        Thread.sleep(1000);
        type(numTel,txtNumTel);

        Click(btnOkTel);
    }

    By pestOcupacion=By.id("tabUpdateCustomer_tablist_OcupacionID");
    By seccionOcupacion=By.id("ocupaPagoId_titleBarNode");
    By btnAgregarOcupacion=By.xpath("//div[@id='tblOC']/following-sibling::div/span/span/span");
    By listOcupacion=By.xpath("//div[@id='tblOC']/div[2]/div/div/div/div/div/table/tbody/tr/td[1]/div[1]/div[1]/input");
    By txtOcupacion= By.xpath("//div[@id='tblOC']/div[2]/div/div/div/div/div/table/tbody/tr/td[1]/div/div[3]/input");
    By columnaClaveOcupacion= By.xpath("//div[@id='tblOC']/div[2]/div/div/div/div/div/table/tbody/tr/td[2]");
    By listClaveOcupacion=By.xpath("//div[@id='tblOC']/div[2]/div/div/div/div/div/table/tbody/tr/td[2]/div/div[1]");
    By txtClaveOcupacion=By.xpath("//div[@id='tblOC']/div[2]/div/div/div/div/div/table/tbody/tr/td[2]/div/div/div[3]/input");
    By columnaDetalleOcupa= By.xpath("//div[@id='tblOC']/div[2]/div/div/div/div/div/table/tbody/tr/td[3]");
    By txtDetalleOcupa=By.xpath("//div[@id='tblOC']/div[2]/div/div/div/div/div/table/tbody/tr/td[3]/div/div[2]/input");
    By  btnOkOcupacion=By.xpath("//div[@id='tblOC']/div[2]/div/div/div/div/div/table/tbody/tr/td[4]/div/span[1]/span/span");
    public void pestañaOcupacion(String ocupacion, String claveOcupa, String detalleOcupa
    ) throws InterruptedException {
        Click(pestOcupacion);
        Click(seccionOcupacion);
        esperaListDesplegable(btnAgregarOcupacion);

        Click(listOcupacion);
        type(ocupacion,txtOcupacion);
        keyEnter(txtOcupacion);
        Thread.sleep(500);
        esperaListDesplegable(columnaClaveOcupacion);
        Click(listClaveOcupacion);
        By etiquetaClaveOcupacion=By.xpath("//*[text()='"+claveOcupa+"']");
        esperaListDesplegable(etiquetaClaveOcupacion);

        Click(columnaDetalleOcupa);
        type(detalleOcupa,txtDetalleOcupa);

        Click(btnOkOcupacion);
    }

    By txtIngresoMensual=By.id("ingMenID");
    public void percepcionMensual(String ingresoMensual) throws InterruptedException {
        type(ingresoMensual,txtIngresoMensual);

    }

    By btnPestañaDeclaPErfilTrans=By.id("tabUpdateCustomer_tablist_dptTab");
    By txtapoNumTranAnual=By.id("ptNumTransID");
    By txtretNumTranAnual=By.id("ptNumRetirosID");
    By txtapoMonTrnAnual=By.id("ptMontTransID");
    By txtretMonTrnAnual=By.id("ptMontRetirosID");
    public void perfilTransaccional(String apoNumTranAnual, String retNumTranAnual, String apoMonTrnAnual, String retMonTrnAnual) throws InterruptedException {
        Click(btnPestañaDeclaPErfilTrans);
        type(apoNumTranAnual,txtapoNumTranAnual);
        type(retNumTranAnual,txtretNumTranAnual);
        type(apoMonTrnAnual,txtapoMonTrnAnual);
        type(retMonTrnAnual,txtretMonTrnAnual);
    }


    By rbtnFuncionesPublicN=By.id("pepID_N");
    By rbtnFuncionesPublicS=By.id("pepID_S");
    public void declaracionImpuestos(String funcionesPublicas){
        System.out.println("Ingresa al método: "+funcionesPublicas);


             esperaListDesplegable(rbtnFuncionesPublicN);

     }



    By pestañaAvisoPrivacidad=By.id("tabUpdateCustomer_tablist_pdcTab");
    By rbtnDivulgacionDatosS=By.id("reusID_S");
    public void avisoPrivacidad(){
    Click(pestañaAvisoPrivacidad);
    esperaListDesplegable(rbtnDivulgacionDatosS);
    }


    By btnGuardar=By.xpath("//div[@id='commentsCusId']/following-sibling::div/span[4]/span/span");
    By btnConfirGuardar=By.xpath("//div[contains(@id,'dijit_Dialog')]/div[2]/div[2]/span[1]/span/span");
    By btnAceptConfirm=By.xpath("(//div[contains(@id,'dijit_Dialog')]/div[2]/div[2]/span[1]/span/span)[2]");
    By txtIdCliente=By.xpath("//div[contains(@id,'dijit_layout_ContentPane')]/table/tbody/tr/td[2]/label/b");

    public void obtieneFolio() throws InterruptedException {
        Thread.sleep(500);
        Click(btnGuardar);
        Thread.sleep(500);
        Click(btnConfirGuardar);
        Thread.sleep(500);
        obtieneTexto(txtIdCliente);
        Thread.sleep(500);
        Click(btnAceptConfirm);



    }



}
