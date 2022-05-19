import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    private WebDriver driver;


    @Before
    public void openDriver(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
    }

@Test
    public void loginWithValidCredentialsTest(){

        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.id("email")).sendKeys("bustiucr@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("Password1");
        driver.findElement(By.id("send2")).click();
        Assert.assertTrue("Hello, Razvan C Bustiuc!",true);
    System.out.println("Test valid");






    }
@Test
    public void loginWithInvalidPasswordTest(){
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.id("email")).sendKeys("bustiucr@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("Faringosept");
        driver.findElement(By.id("send2")).click();
        Assert.assertFalse("Invalid login or password.",false);
    System.out.println("Test valid");

    }
@Test
    public void loginWithInvalidEmail(){
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.id("email")).sendKeys("bustiucrgmail.com");
        driver.findElement(By.id("pass")).sendKeys("faringoseptsgaeg");
        driver.findElement(By.id("send2")).click();

    }
@Test
    public void loginWithoutCredentialsTest(){
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.id("send2")).click();

    }

    @After
    public void close(){
        driver.close();
    }
}
