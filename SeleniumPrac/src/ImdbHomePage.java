import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class ImdbHomePage {
    WebDriver driver;
    Actions actions;

    public ImdbHomePage(WebDriver driver, Actions actions) {
        this.driver=driver;
        this.actions=actions;
    }

    public void search(){
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Logan");
    }

    public void selectCategory(String category){
        driver.findElement(By.xpath("//label[@aria-label=\"All\"]")).click();
        int i = 1;

        driver.findElement(By.xpath("(//*[@id=\"navbar-search-category-select-contents\"]//ul//li)[2]")).click();
        /*for(WebElement element: list){

            if(category.equals(element)){
                element.click();
                break;
            }
        }*/
        //List<WebElement> list=driver.findElements(By.xpath("//li[@class='ipc-list__item searchCatSelector__item']"));
    }

    public void clickSearchButton(){
        driver.findElement(By.xpath("//button[@class='nav-search__search-submit searchform__submit']")).click();
    }

    public void signIn(){
        driver.findElement((By.xpath("//div[@class=\"nav__userMenu navbar__user sc-idOhPF kGntgQ\"]"))).click();
    }

    public void menuButton() {
        driver.findElement(By.xpath("//label[@id=\"imdbHeader-navDrawerOpen--desktop\"]")).click();
    }

    public void enterPassword() {
    }
}
