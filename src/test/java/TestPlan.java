import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class TestPlan {
    WebDriver driver;

    @Before
    public void setUp() throws Exception {
        //Add this line of code before you instantiate driver
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
    }

    @Test
    public void test(){
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[contains(text(),'Forgot Password')]")).click();
        driver.findElement(By.id("email")).sendKeys("irakli.beridze.pax@gmail.com");
        driver.findElement(By.id("form_submit")).click();

    }
}
