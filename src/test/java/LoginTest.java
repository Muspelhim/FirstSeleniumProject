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

        driver.findElement(By.cssSelector(".skip-account .label")).click();
//        WebElement accountLink = driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label"));
//        accountLink.click();
        driver.findElement(By.cssSelector("a[title='Log in']")).click();
        driver.findElement(By.id("email")).sendKeys("bustiucr@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("Password1");
        driver.findElement(By.id("send2")).click();
        WebElement dashoardTextElement = driver.findElement(By.cssSelector(".page-title h1"));
        driver.findElement(By.cssSelector(".hello strong")).getText();
        Assert.assertTrue(dashoardTextElement.isDisplayed());
        Assert.assertEquals("Hello, Razvan C Bustiuc!",dashoardTextElement);






    }
@Test
    public void loginWithInvalidPasswordTest(){
        driver.findElement(By.cssSelector(".skip-account .label")).click();
//        WebElement accountLink = driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label"));
//        accountLink.click();
        driver.findElement(By.cssSelector("a[title='Log in']")).click();
        driver.findElement(By.id("email")).sendKeys("bustiucr@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("Faringosept");
        driver.findElement(By.id("send2")).click();

    }
@Test
    public void loginWithInvalidEmail(){
        driver.findElement(By.cssSelector(".skip-account .label")).click();
//        WebElement accountLink = driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label"));
//        accountLink.click();
        driver.findElement(By.cssSelector("a[title='Log in']")).click();
        driver.findElement(By.id("email")).sendKeys("bustiucrgmail.com");
        driver.findElement(By.id("pass")).sendKeys("faringoseptsgaeg");
        driver.findElement(By.id("send2")).click();

    }
@Test
    public void loginWithoutCredentialsTest(){
        driver.findElement(By.cssSelector(".skip-account .label")).click();
//        WebElement accountLink = driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label"));
//        accountLink.click();
        driver.findElement(By.cssSelector("a[title='Log in']")).click();
        driver.findElement(By.id("send2")).click();

    }

    @After
    public void close(){
        driver.close();
    }
}
