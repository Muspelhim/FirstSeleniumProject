import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {
    private WebDriver driver;

    @Before
    public void openDriver(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
    }
@Test
    public void validRegisterTest(){
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
        driver.findElement(By.cssSelector("#firstname")).click();
        driver.findElement(By.id("firstname")).sendKeys("Razvan");
        driver.findElement(By.id("middlename")).sendKeys("C");
        driver.findElement(By.id("lastname")).sendKeys("Bustiuc");
        driver.findElement(By.id("email_address")).sendKeys("bustiucr@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Password1");
        driver.findElement(By.id("confirmation")).sendKeys("Password1");
        driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button")).click();




        }
@Test
    public void invalidRegisterTest(){
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
        driver.findElement(By.cssSelector("#firstname")).click();
        driver.findElement(By.id("firstname")).sendKeys("Razvan");
        driver.findElement(By.id("middlename")).sendKeys("C");
        driver.findElement(By.id("lastname")).sendKeys("Bustiuc");
        driver.findElement(By.id("email_address")).sendKeys("bustiucrgmail.com");
        driver.findElement(By.id("password")).sendKeys("Password1");
        driver.findElement(By.id("confirmation")).sendKeys("Password1");
        driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button")).click();



    }

    @After
    public void closeDriver(){
        driver.close();
    }



    }

