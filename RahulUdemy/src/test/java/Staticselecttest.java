import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.time.Duration;

public class Staticselecttest {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://client-alpha.clopos.com/alphas/1");
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("input[placeholder='E-mail']")).sendKeys("samira.novruzova.02@bk.ru");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Samire2002s");
        driver.findElement(By.xpath("//div[@role='toolbar']/button[2]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//div[@id='staff']/a[1]")).click(); //div parentdir, esasi a taginin ichinde idi. Bu formada yazdiq
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//a[@href='/alphas/1/staff/users']")).click();
        driver.findElement(By.xpath("//div[@class='mr-3']/a[1]")).click(); // //a[@test-id='create-button'] bele de yaza bilerdik
        driver.findElement(By.xpath("//input[@test-id='username']")).sendKeys("Seleniumtest");
        driver.findElement(By.xpath("//div[@test-id='role']")).click();
        driver.findElement(By.xpath("//div[@data-key='manager']")).click();
        driver.findElement(By.xpath("//input[@test-id='password']")).sendKeys("Demo12345");
        WebElement pinfield = driver.findElement(By.xpath("//input[@test-id='pin']"));
        pinfield.click();
        pinfield.sendKeys("2233");
        driver.findElement(By.xpath("//div[@class='rs-picker rs-picker-input rs-picker-default rs-picker-toggle-wrapper rs-picker-tag']")).click();
        driver.findElement(By.xpath("(//span[@class='rs-checkbox-wrapper'])[1]")).click();
        driver.findElement(By.xpath("//button[@test-id='create-form-save-btn']")).click();
    }
}