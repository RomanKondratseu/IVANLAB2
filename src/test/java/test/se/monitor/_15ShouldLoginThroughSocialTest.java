package test.se.monitor;// Generated by Selenium IDE

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class _15ShouldLoginThroughSocialTest {
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
        driver.get("https://www.facebook.com/login.php?skip_api_login=1&api_key=1080830321934853&kid_directed_site=0&app_id=1080830321934853&signed_next=1&next=https%3A%2F%2Fwww.facebook.com%2Fv6.0%2Fdialog%2Foauth%3Fresponse_type%3Dcode%26client_id%3D1080830321934853%26redirect_uri%3Dhttps%253A%252F%252Flogin.cambridge.org%252FGS%252FGSLogin.aspx%26scope%3Demail%26state%3Dyc463l70n4055151h7tk1.NOOfiAPXK0uGQfGezCQ86N697N-qssb3t3DCP7OcIlM.1645465728%26display%3Dpopup%26ret%3Dlogin%26fbapp_pres%3D0%26logger_id%3Dac6dc0d3-5f2e-4380-ab30-8138c3a4f1b1%26tp%3Dunspecified&cancel_url=https%3A%2F%2Flogin.cambridge.org%2FGS%2FGSLogin.aspx%3Ferror%3Daccess_denied%26error_code%3D200%26error_description%3DPermissions%2Berror%26error_reason%3Duser_denied%26state%3Dyc463l70n4055151h7tk1.NOOfiAPXK0uGQfGezCQ86N697N-qssb3t3DCP7OcIlM.1645465728%23_%3D_&display=popup&locale=ru_RU&pl_dbl=0");
        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("#content > div:nth-child(3) > a")).click();
        Thread.sleep(3000);
    }
}
