import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PolitripSingUpTest {
    private WebDriver driver;

    @Before
    public void OpenDriver(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://politrip.com/account/sign-up");

    }
@Test
    public void signUpValidTest () {
        driver.findElement(By.cssSelector("#first-name")).click();
        driver.findElement(By.id("first-name")).sendKeys("Razvan");
        driver.findElement(By.cssSelector("#last-name")).click();
        driver.findElement(By.id("last-name")).sendKeys("Bustiuc");
        driver.findElement(By.cssSelector("#email")).click();
        driver.findElement(By.id("email")).sendKeys("bustiucr@gmail.com");
        driver.findElement(By.cssSelector("#sign-up-password-input")).sendKeys("Faringosept1");
        driver.findElement(By.cssSelector("#sign-up-confirm-password-input")).sendKeys("Faringosept1");
        driver.findElement(By.cssSelector("#button.button")).click();
       System.err.println("Test nevalid");

    }
    @Test
    public void signUpInvalidEmailTest () {
        driver.findElement(By.cssSelector("#first-name")).click();
        driver.findElement(By.id("first-name")).sendKeys("Razvan");
        driver.findElement(By.cssSelector("#last-name")).click();
        driver.findElement(By.id("last-name")).sendKeys("Bustiuc");
        driver.findElement(By.cssSelector("#email")).click();
        driver.findElement(By.id("email")).sendKeys("bustiucrgmail.com");
        driver.findElement(By.cssSelector("#sign-up-password-input")).sendKeys("Faringosept1");
        driver.findElement(By.cssSelector("#sign-up-confirm-password-input")).sendKeys("Faringosept1");
        driver.findElement(By.cssSelector("#\\ qa_loader-button")).click();



    }
    @Test
    public void signUpInvalidNameFormatTest () {
        driver.findElement(By.cssSelector("#first-name")).click();
        driver.findElement(By.id("first-name")).sendKeys("1234");
        driver.findElement(By.cssSelector("#last-name")).click();
        driver.findElement(By.id("last-name")).sendKeys("2425");
        driver.findElement(By.cssSelector("#email")).click();
        driver.findElement(By.id("email")).sendKeys("bustiucr@gmail.com");
        driver.findElement(By.cssSelector("#sign-up-password-input")).sendKeys("Faringosept1");
        driver.findElement(By.cssSelector("#sign-up-confirm-password-input")).sendKeys("Faringosept1");
        driver.findElement(By.id("qa_loader-button")).click();


    }
@Test
    public void signUpInvalidNameAndEmailFormatTest () {
        driver.findElement(By.cssSelector("#first-name")).click();
        driver.findElement(By.id("first-name")).sendKeys("1234");
        driver.findElement(By.cssSelector("#last-name")).click();
        driver.findElement(By.id("last-name")).sendKeys("2425");
        driver.findElement(By.cssSelector("#email")).click();
        driver.findElement(By.id("email")).sendKeys("bustiucrgmail.com");
        driver.findElement(By.cssSelector("#sign-up-password-input")).sendKeys("Faringosept1");
        driver.findElement(By.cssSelector("#sign-up-confirm-password-input")).sendKeys("Faringosept1");
        driver.findElement(By.id("qa_loader-button")).click();


    }

@Test
    public void blankFieldsTest(){
        driver.findElement(By.cssSelector("#\\ qa_loader-button")).click();
    }
    @After
    public void closeDriver(){
        driver.close();
    }
}
