import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ImdbSignIn {
    WebDriver driver;
    Actions actions;

    public ImdbSignIn(WebDriver driver, Actions actions){
        this.driver = driver;
        this.actions = actions;
    }

    public void enterUsername(){
        driver.findElement(By.xpath("//input[@id=\"ap_email\"]")).sendKeys("jujjwal81@gmail.com");
    }

    public void enterPassword(){
        driver.findElement(By.xpath("//input[@id=\"ap_password\"]")).sendKeys("tempPassword81!");
    }

    public void clickSignInButton(){
        driver.findElement(By.xpath("//input[@id=\"signInSubmit\"]")).click();
    }

}
