package test.se.monitor;// Generated by Selenium IDE

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertTrue;

public class _12CantLoginNotificationTest {
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
        driver.manage().window().maximize();
        vars.put("window_handles", driver.getWindowHandles());
        driver.findElement(By.cssSelector("#header > div > div.hfr.htr.fs14.lpr-15.lpt-2.flx-s_0.flx-g_10.pr0 > div.hdn.hdib-s > div:nth-child(2) > a.lpr-0.hbtn.hbtn-t.lmt-5.fs15.cdo-login-button > i")).click();
        Thread.sleep(4000);
        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#gigya-login-form > div.gigya-layout-row.with-divider > div.gigya-layout-cell.responsive.with-site-login > div.gigya-composite-control.gigya-composite-control-textbox > input"))
                .sendKeys("vvvanya3@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#gigya-login-form > div.gigya-layout-row.with-divider > div.gigya-layout-cell.responsive.with-site-login > div.gigya-composite-control.gigya-composite-control-password > input"))
                .sendKeys("1121223456Ivan");
        driver.findElement(By.cssSelector("#gigya-login-form > div.gigya-layout-row.with-divider > div.gigya-layout-cell.responsive.with-site-login > div.gigya-composite-control.gigya-composite-control-submit > input")).click();
        Thread.sleep(4000);
        WebElement element = driver.findElement(By.cssSelector("#gigya-login-form > div.gigya-layout-row.with-divider > div.gigya-layout-cell.responsive.with-site-login > div.gigya-error-display.gigya-composite-control.gigya-composite-control-form-error.gigya-error-display-active.gigya-error-code-403042 > div"));
        assertTrue(element.isDisplayed());
    }
}
