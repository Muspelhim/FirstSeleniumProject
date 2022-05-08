import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PolitripSingUpTest {

    public void signUpValidTest () {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://politrip.com/account/sign-up");
        driver.findElement(By.cssSelector("#first-name")).click();
        driver.findElement(By.id("first-name")).sendKeys("Razvan");
        driver.findElement(By.cssSelector("#last-name")).click();
        driver.findElement(By.id("last-name")).sendKeys("Bustiuc");
        driver.findElement(By.cssSelector("#email")).click();
        driver.findElement(By.id("email")).sendKeys("bustiucr@gmail.com");
        driver.findElement(By.cssSelector("#sign-up-password-input")).sendKeys("Faringosept1");
        driver.findElement(By.cssSelector("#sign-up-confirm-password-input")).sendKeys("Faringosept1");
        driver.findElement(By.cssSelector("#.button-label")).click();


    }
    public void signUpInvalidEmailTest () {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://politrip.com/account/sign-up");
        driver.findElement(By.cssSelector("#first-name")).click();
        driver.findElement(By.id("first-name")).sendKeys("Razvan");
        driver.findElement(By.cssSelector("#last-name")).click();
        driver.findElement(By.id("last-name")).sendKeys("Bustiuc");
        driver.findElement(By.cssSelector("#email")).click();
        driver.findElement(By.id("email")).sendKeys("bustiucrgmail.com");
        driver.findElement(By.cssSelector("#sign-up-password-input")).sendKeys("Faringosept1");
        driver.findElement(By.cssSelector("#sign-up-confirm-password-input")).sendKeys("Faringosept1");
        driver.findElement(By.cssSelector(" qa_loader-button")).click();


    }
    public void signUpInvalidNameFormatTest () {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://politrip.com/account/sign-up");
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

    public void signUpInvalidNameAndEmailFormatTest () {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://politrip.com/account/sign-up");
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
}
