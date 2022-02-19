package test.se.monitor;// Generated by Selenium IDE

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class _3ShouldRegisterTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;

  @Before
  public void setUp() {
    System.setProperty(
            "webdriver.chrome.driver",
            Paths.get("src/test/resources/chromedriver.exe").toString()
    );
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<>();
  }

  @After
  public void tearDown() {
    driver.quit();
  }


  @Test
  public void shouldRegister() throws InterruptedException {
    driver.get("https://dictionary.cambridge.org/");
    driver.manage().window().setSize(new Dimension(1476, 880));
    vars.put("window_handles", driver.getWindowHandles());
    driver.findElement(By.cssSelector(".lpl-0 > .tb")).click();

    Thread.sleep(4000);
    driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
    driver.findElement(By.cssSelector("#register-site-login > div:nth-child(1) > div > div > input")).click();
    driver.findElement(By.cssSelector("#register-site-login > div:nth-child(1) > div > div > input"))
            .sendKeys("hello");

    System.out.println(vars);
  }
}