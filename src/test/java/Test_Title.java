import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import static org.bouncycastle.asn1.x500.style.RFC4519Style.l;
public class Test_Title{
    String SITE_URL = "https://vk.com/";
    WebDriver driver;

    @Before
    public void start(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
    }
    @After
    public void finish(){
        driver.quit();
    }

    @Test
    public void TestTitle() {
      driver.get (SITE_URL);
      String title = driver.getTitle();
      Assert.assertTrue(title.equals("Добро пожаловать | ВКонтакте"));
    }
}
