import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {

    public void validRegisterTest(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
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
        driver.close();



        }

    public void invalidRegisterTest(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
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
        driver.close();


    }



    }

