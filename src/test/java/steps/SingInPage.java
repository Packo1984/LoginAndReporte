package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SingInPage extends Base {
    private Base base;

    public SingInPage(WebDriver driver) {
        base=new Base(this.driver);
    }

    By user=By.id("login_usuario");
    By pwd=By.id("login_contrasenya");
    By ingresar=By.id("btn");
    By tituloObtenido=By.partialLinkText("Cerrar");

    public void SingIn() {
        if (isDisplayed(user)){
            type("N3409378",user);
            type("MetMex12",pwd);
            Click(ingresar);
        }else{
            System.out.println("UserName textbox was not present");
        }

    }

    public boolean isHomeDisplayed(){
        return isDisplayed(tituloObtenido);
    }
}
