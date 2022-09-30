import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class SignInPage {

    WebDriver driver;
    Actions actions;

    public SignInPage(WebDriver driver, Actions actions){
        this.driver = driver;
        this.actions = actions;
    }

    public void signInWithImdb(){
        driver.findElement(By.xpath("//*[@id=\"signin-options\"]/div/div[1]/a[1]")).click();
    }

    public void signInWithAmazon(){
        driver.findElement(By.xpath("//span[@class=\"auth-sprite amazon-logo  retina \"]")).click();
    }

    public void signInWithGoogle(){
        driver.findElement(By.xpath("//span[@class=\"auth-sprite google-logo retina \"]")).click();
    }

    public void signInWithAppleId(){
        driver.findElement(By.xpath("//span[@class=\"auth-sprite apple-logo retina \"]")).click();
    }

    public void showMoreOptions(){
        driver.findElement(By.xpath("//span[@class=\"//div[@class=\"auth-options-toggle\"] \"]")).click();
    }
    public void signInWithFacebook(){
        driver.findElement(By.xpath("//span[@class=\"auth-sprite imdb-logo retina \"]")).click();
    }

    public void createNewAcco(){
        driver.findElement(By.xpath("//span[@class=\"auth-sprite imdb-logo retina \"]")).click();
    }

}
