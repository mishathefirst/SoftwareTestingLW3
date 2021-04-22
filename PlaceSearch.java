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


public class Test2Test {
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
  public void test2() {
    driver.get("https://wikimapia.org/#lang=ru&lat=55.750000&lon=37.616600&z=12&m=w");
    driver.manage().window().setSize(new Dimension(1550, 838));
    driver.findElement(By.xpath("//search-input")).click();
    driver.findElement(By.xpath("//search-input")).click();
    driver.findElement(By.xpath("//search-input")).sendKeys("Сочи");
    driver.findElement(By.xpath("//search-input")).sendKeys(Keys.ENTER);
    driver.switchTo().frame(1);
    driver.findElement(By.cssSelector(".search-result-item:nth-child(1) strong")).click();
    driver.switchTo().defaultContent();
    driver.findElement(By.cssSelector("#wm-panel-1231-hide-button > .icon")).click();
  }
}
