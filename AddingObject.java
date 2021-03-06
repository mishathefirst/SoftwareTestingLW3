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

public class Test3Test {
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
  public void test3() {
    driver.get("https://wikimapia.org/#lang=ru&lat=55.236854&lon=40.704346&z=8&m=w");
    driver.manage().window().setSize(new Dimension(1550, 838));
    {
      WebElement element = driver.findElement(By.id("polygon-157"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.id("polygon-129"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("polygon-129"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    driver.findElement(By.id("polygon-157")).click();
    driver.findElement(By.cssSelector("#wm-button-73-content > .button-text")).click();
    driver.findElement(By.id("wikimapia-layers")).click();
    driver.findElement(By.id("polyline-398")).click();
    driver.findElement(By.id("polyline-398")).click();
    driver.findElement(By.id("polyline-398")).click();
    driver.findElement(By.id("wm-icn-396")).click();
    driver.findElement(By.id("save-button")).click();
    driver.findElement(By.id("title")).sendKeys("SomeObject1");
    driver.findElement(By.cssSelector(".edit-form-description-input > .input-block-level")).click();
    driver.findElement(By.cssSelector(".edit-form-description-input > .input-block-level")).sendKeys("Some object");
    driver.findElement(By.cssSelector(".address > .title")).click();
    driver.findElement(By.cssSelector(".address > .title")).click();
    driver.findElement(By.cssSelector(".select2-choices")).click();
    driver.findElement(By.cssSelector(".btn-primary")).click();
    driver.findElement(By.cssSelector("#wm-panel-421-hide-button > .icon")).click();
  }
}
