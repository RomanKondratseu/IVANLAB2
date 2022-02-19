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

import static org.junit.Assert.assertEquals;

public class _2ShouldLeadToRightAddress {
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
  public void shouldBeWorkingLinks() {
    driver.get("https://dictionary.cambridge.org/");
    driver.manage().window().setSize(new Dimension(1476, 880));
    driver.findElement(By.linkText("Grammar")).click();

    assertEquals("https://dictionary.cambridge.org/grammar/british-grammar/", driver.getCurrentUrl());
  }
}
