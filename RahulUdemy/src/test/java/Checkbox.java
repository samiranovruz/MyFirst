import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Checkbox {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://client.clopos.com/alphas/1");
        Thread.sleep(13000);
        driver.findElement(By.cssSelector("input[placeholder='E-mail']")).sendKeys("samira.novruzova.02@bk.ru");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Samire2002s");
        driver.findElement(By.xpath("//div[@role='toolbar']/button[2]")).click();
        Thread.sleep(9000);
        System.out.println("test");
        driver.findElement(By.xpath("(//div[@id='menu']/a)[1]")).click();
        System.out.println("test 2");
        Thread.sleep(3000);
        driver.findElement(By.id("_menu_products")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@test-id='create-button']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@test-id='create-dish']//div[@class='ml-3']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@test-id='name']")).sendKeys("Avokado");
        Thread.sleep(3000);

        List <WebElement> checkboxlarr = driver.findElements(By.xpath("(//span[@class='rs-checkbox-wrapper'])[position() >= 4 and position() <= 5]"));
        for ( WebElement checkbox : checkboxlarr)
        {
            checkbox.click();
        }

        for ( WebElement checkbox : checkboxlarr)
        {
            System.out.println(checkbox.isSelected());
        }

        driver.findElement(By.xpath("create-form-save-btn")).click();

//        driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).click();
//        List<WebElement> checkboxlar = driver.findElements(By.cssSelector("input[type='checkbox']"));
//        for (int i = 0; i< checkboxlar.size(); i++)
//        {
//           checkboxlar.get(i).click();
//        }

//        for (WebElement checkbox : checkboxlar) {
//            if (!checkbox.isSelected()) {
//                checkbox.click();
//            }
//        }
      }
    }