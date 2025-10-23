import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.URL;


public class MyFirstClass {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://hr.kapitalbank.az/account/login");
            driver.findElement(By.xpath("//div/span[@class='ins-close-button']")).click();
            driver.findElement(By.cssSelector("input#email")).sendKeys("samira.novruzova.02@bk.ru");
            driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Samire2002s!");
            driver.findElement(By.className("sc-guDMob")).click();
            Thread.sleep(10000);
            driver.quit();
    }
}