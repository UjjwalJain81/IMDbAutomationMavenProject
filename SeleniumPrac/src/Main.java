import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/ujjwal.jain/Downloads/chromedriver");

        ImdbAutomationScript imdbAutomationScript=new ImdbAutomationScript();
        imdbAutomationScript.runScript();
//        WebDriver driver = new ChromeDriver();
//        Actions actions = new Actions(driver);
//
//        driver.get("https://www.makemytrip.com/");
//        driver.manage().window().maximize();
//
//        driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[4]/div/p")).click();
//        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("jujjwal81@gmail.com");
//        driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/form/div[2]/button")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).sendKeys("shoes men");
//        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button")).submit();
//
//        Thread.sleep(3000);
//        driver.navigate().to("https://www.flipkart.com/asics-gel-contend-4b-running-shoes-men/p/itm72f25e7caf6c7?pid=SHOG4XQXGRPWCZFX&lid=LSTSHOG4XQXGRPWCZFX6T8CQH&marketplace=FLIPKART&q=shoes+men&store=osp%2Fcil&srno=s_1_2&otracker=search&otracker1=search&fm=Search&iid=en_oJM%2F5K%2Fp7iO2NidOGVxadCY7VZ9cUOjbOllwQc9mqNZAcieYr%2FblA4YeUdDa%2FmVf%2BMTR3OqCZwp%2FG5LF4RxKSA%3D%3D&ppt=sp&ppn=sp&ssid=meops2mgmo0000001664304524846&qH=d38bdfc0b9753275");
//
//        Thread.sleep(3000);
//        driver.findElement(By.id("swatch-4-size")).click();
//        Thread.sleep(3000);
//
//        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[2]/form/button")).click();
//        Thread.sleep(5000);
//
//        WebElement pressHold = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/p"));
//        actions.moveToElement(pressHold);
//        actions.clickAndHold().perform();

    }
}