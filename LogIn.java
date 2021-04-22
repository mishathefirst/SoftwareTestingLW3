import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Test4Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void test4() {
    driver.get("https://wikimapia.org/#lang=ru&lat=55.749917&lon=37.616501&z=12&m=w");
    driver.manage().window().setSize(new Dimension(1550, 838));
    driver.findElement(By.cssSelector(".n-0-2-0 span:nth-child(2)")).click();
    driver.switchTo().frame(0);
    driver.findElement(By.cssSelector("#user-login")).click();
    driver.findElement(By.name("pw1")).click();
    driver.findElement(By.cssSelector(".login-submit")).click();
    driver.switchTo().defaultContent();
    driver.findElement(By.id("wm-window-85-close-button")).click();
  }
}
