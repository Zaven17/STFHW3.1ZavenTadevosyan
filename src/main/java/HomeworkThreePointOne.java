import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class HomeworkThreePointOne {
    @Test
    public void TestAuto(){
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        WebElement searchBox = driver.findElement(By.id("search_query_top"));
        searchBox.sendKeys("Barev Axper");
        searchBox.submit();
    }

    @Test
    public void LinkCLick(){
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver  driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        WebElement women = driver.findElement(By.linkText("Women"));
        women.click();
    }

    @Test
    public void nextBtnClick(){
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver  driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        WebElement next = driver.findElement(By.className("bx-next"));
        next.click();
    }
    @Test
    public void addToCartBtnClick(){
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver  driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        WebElement add_to_cart = driver.findElement(By.linkText("Add to cart"));
        add_to_cart.click();
    }

    @Test
    public void SignIn(){
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver  driver = new ChromeDriver();
        driver.get( "http://automationpractice.com/index.php" );
        WebElement signin = driver.findElement(By.linkText("Sign in"));
        signin.click();
        WebElement inputfieldEmail = driver.findElement(By.id("email"));
        inputfieldEmail.sendKeys("zaventad@gmail.com");
        WebElement inputfieldPass = driver.findElement(By.id("passwd"));
        inputfieldPass.sendKeys("11223344");
        WebElement submit = driver.findElement(By.linkText("Sign in"));
        submit.click();

    }



}
