import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MadisonSmokeTest {

    private WebDriver driver;

    @Before
    public void openDriver(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
    }
  @Test
    public void MadisonSmokeTest () {

        WebElement accesories = driver.findElement(By.cssSelector("li.level0.nav-3.parent > a"));
        Actions actions = new Actions(driver);
        actions.moveToElement(accesories).perform();
        driver.findElement(By.cssSelector("li.level0.nav-3.active.parent > ul > li.level1.nav-3-3.active > a")).click();
        driver.findElement(By.cssSelector("#product-collection-image-433")).click();








    }
    @After
    public void closeDriver(){
        driver.close();
    }
}
