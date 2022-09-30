import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.sql.Driver;

public class ImdbAutomationScript {
    SignInPage signInPage;
    WebDriver driver;
    ImdbHomePage imdbHomePage;

    ImdbSignIn imdbSignIn;
    Actions actions;

    public ImdbAutomationScript() {
        this.driver=new ChromeDriver();
        this.actions=new Actions(this.driver);
        this.imdbHomePage = new ImdbHomePage(driver,actions);
        this.signInPage = new SignInPage(this.driver, this.actions);
        this.imdbSignIn = new ImdbSignIn(driver, actions);
    }

    public void runScript() throws InterruptedException {
        driver.get("https://www.imdb.com/");
        driver.manage().window().maximize();
        Thread.sleep(4000);
//        imdbHomePage.search("Iron Man");
//        imdbHomePage.clickSearchButton();

//        imdbHomePage.signIn();
//        Thread.sleep(3000);

//        signInPage.signInWithImdb();
//        Thread.sleep(4000);
//
//        imdbSignIn.enterUsername();
//        imdbSignIn.enterPassword();
//        imdbSignIn.clickSignInButton();
//        Thread.sleep(3000);

        imdbHomePage.selectCategory("Title");
        imdbHomePage.search();
        imdbHomePage.clickSearchButton();



//        Thread.sleep(10000);
//        driver.quit();
    }
}
