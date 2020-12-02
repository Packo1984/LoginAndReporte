package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
    public WebDriver driver;
    public Base(WebDriver driver){
        this.driver=driver;
    }

    public Base() {
    }

    public WebDriver chromeDriverConetion(){
        System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
        driver= new ChromeDriver();
        return driver;
    }

    public  void type(String inputText, By locator){
        driver.findElement(locator).sendKeys(inputText);
    }

    public void Click(By locator){
        driver.findElement(locator).click();
    }

    public Boolean isDisplayed(By locator) {

        try {
           return  driver.findElement(locator).isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public void visit(String url){
        driver.get(url);
    }


}

