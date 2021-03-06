import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CartTest{
    private WebDriver driver;

    @Before
    public void openDriver() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
    }
@Test
   public void AddToCartTest() {
        driver.findElement(By.cssSelector("li.level0.nav-2.parent>a")).click();
        WebElement menCategory = driver.findElement(By.cssSelector("li.level0.nav-2.parent>a"));
        Actions actions = new Actions(driver);
        actions.moveToElement(menCategory).perform();
        driver.findElement(By.cssSelector("li.level1.nav-2-2 >a")).click();
        driver.findElement(By.cssSelector("#product-collection-image-403")).click();
        driver.findElement(By.cssSelector("#swatch27 > span.swatch-label > img")).click();
        driver.findElement(By.cssSelector("#swatch81 > span.swatch-label")).click();
       driver.findElement(By.cssSelector("#product_addtocart_form > div.product-shop > div.product-options-bottom > div.add-to-cart > div.add-to-cart-buttons > button > span > span")).click();
       driver.findElement(By.cssSelector("#shopping-cart-table > tbody > tr > td.a-center.product-cart-remove.last > a")).click();
    Assert.assertTrue(driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col1-layout > div > div > div.page-title > h1")).isDisplayed());


    }

    @Test
    public void emptyCartTest(){
        driver.findElement(By.cssSelector("div.skip-links > div > div > a > span.label")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("#header-cart > div.minicart-wrapper > p.empty")).isDisplayed());

        }

    @After
    public void closeDriver(){
        driver.close();
    }


}
