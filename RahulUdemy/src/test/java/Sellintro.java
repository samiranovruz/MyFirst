import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class Sellintro {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://client-alpha.clopos.com/alphas/1");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input[placeholder='E-mail']")).sendKeys("samira.novruzova.02@bk.ru");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Samire2002s");
        driver.findElement(By.xpath("//div[@role='toolbar']/button[2]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//div[@id='dashboard']/a")).click();
        driver.findElement(By.id("_dashboard-v2")).click();
        driver.findElement(By.xpath("//button[@class='rs-btn rs-btn-default rs-btn-sm']")).click();
        driver.findElement(By.xpath("//div[text()='Profitability by payment method'][1]")).click();
        driver.findElement(By.xpath("//button[@class='tw-rounded-lg rs-btn rs-btn-primary rs-btn-lg']")).click();
        driver.findElement(By.xpath("//div[@class='tw-size-5 -tw-mt-[1px]'][5]")).click();








    }
}
