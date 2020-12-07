package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cliente extends Base {

    private Base base;
    public Cliente(WebDriver driver) {
        base=new Base(this.driver);
    }

    By btnCliente= By.id("btn_crearCte");

    public void clicBtnCliente(){
        Click(btnCliente);
    }


}
