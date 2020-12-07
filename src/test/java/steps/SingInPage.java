package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SingInPage extends Base {
    private Base base;

    public SingInPage(WebDriver driver) {
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

    //Datos Generales
    
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


    //Domicilios
    By seccionDomicilios=By.id("direccionId");
    By btnAgregarDom=By.id("btnAgregarDomicilio");
    By listTipoDom=By.xpath("//input[@id='dijit_form_ComboBox_0']/ancestor::div/preceding-sibling::div/preceding-sibling::div/input");
    By txtTipoDom=By.id("dijit_form_ComboBox_0");
    By opcionCalleAve=By.cssSelector("td[idx='1']");
    By txtCalleAve=By.id("dijit_form_ValidationTextBox_0");
    By opcionNumExt=By.cssSelector("td[idx='2']");
    By txtNumExt=By.id("dijit_form_ValidationTextBox_1");
    By opcionCP=By.cssSelector("td[idx='4']");
    By txtCP=By.id("dijit_form_ComboBox_1");
    By opcionColonia=By.cssSelector("td[idx='5']");
    By txtColonia=By.id("dijit_form_ComboBox_2");
    By opcionMunDel=By.cssSelector("td[idx='6']");
    By txtMunDel=By.id("dijit_form_ComboBox_3");
    By opcionCiudad=By.cssSelector("td[idx='7']");
    By txtCiudad=By.id("dijit_form_ComboBox_4");
    By opcionEstado=By.cssSelector("td[idx='8']");
    By txtEstado=By.id("dijit_form_ComboBox_5");

    By btnAgDom=By.xpath("//td[@idx='14']/div/span/span/span[@title='ok']");
    By btnGuardar=By.xpath("//div[@id='datosTab']/div[2]/span[3]/span/span");
    By btnConfirGuardar=By.xpath("//div[contains(@id,'dijit_Dialog')]/div[2]/div[2]/span[1]/span/span");
    By btnAceptConfirm=By.xpath("(//div[contains(@id,'dijit_Dialog')]/div[2]/div[2]/span[1]/span/span)[2]");
    By txtIdCliente=By.xpath("//div[contains(@id,'dijit_layout_ContentPane')]/table/tbody/tr/td[2]/label/b");

    public void SingIn() throws InterruptedException {
        if (isDisplayed(user)){
            type("N3262623",user);
            type("SanchWz90",pwd);
            Click(ingresar);
        }else{
            System.out.println("UserName textbox was not present");
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

    By indvidual=By.xpath("//*[text()='INDIVIDUAL PRIVADO']");

    public  void datosMinimos() throws InterruptedException {
        Click(listLineaNegocio);
        esperaListDesplegable(indvidual);
        keyEnter(txtLineaNegocio);
        Click(listRamo);

        type("VIDA",txtRamo);
        keyEnter(txtRamo);
        Click(listProducto);
        type("METALIFE",txtProducto);
        keyEnter(txtProducto);
        Click(listRol);
        type("BENEFICIARIO",txtRol);
        keyTab(txtRol);
        Click(btnPF);
    }


    public void personaFisica() throws InterruptedException {
        //Click(btnPF);
        //Thread.sleep(3000);
    }
    By masculino=By.xpath("//*[text()='MASCULINO']");
    By edoCivil=By.xpath("//*[text()='SOLTERO (A)']");

    public void datosGenerales() throws InterruptedException {
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

    }
    public void domicilios() throws InterruptedException {
        Click(seccionDomicilios);
        esperaListDesplegable(btnAgregarDom);
        Click(listTipoDom);
        type("PARTICULAR",txtTipoDom);
        keyEnter(txtTipoDom);
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
