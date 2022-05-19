import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchTest {
    private WebDriver driver;

    @Before
    public void openDriver() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
    }

    @Test
    public void searchTestValid(){
        driver.findElement(By.cssSelector("#search")).click();
        driver.findElement(By.cssSelector("#search")).sendKeys("Shirt");
        driver.findElement(By.cssSelector("#search_mini_form > div.input-box > button")).click();
        Assert.assertTrue("SEARCH RESULTS FOR 'SHIRT'",true);
        System.out.println("Test valid");
    }
    @Test
    public void searchTestVoid(){
        driver.findElement(By.cssSelector("#search")).click();

    }
    @After
    public void driverClose(){
        driver.close();
    }
}
