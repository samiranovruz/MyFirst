import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class Autosuggestivedropdown {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        Thread.sleep(5000);
//        driver.findElement(By.id("autosuggest")).sendKeys("Fra");
//        Thread.sleep(3000);
        driver.findElement(By.id("autosuggest")).sendKeys("Turk");
        Thread.sleep(6000);
        List<WebElement> gelenneticeler = driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
        for (int i = 0; i < gelenneticeler.size(); i++) {
            if (gelenneticeler.get(i).getText().equalsIgnoreCase("Turkmenistan")) {
                gelenneticeler.get(i).click();
                break;
            }
        }


//        List<WebElement> suggestions = driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
//
//        for (WebElement suggestion : suggestions)
//        {
//            if (suggestion.getText().equalsIgnoreCase("France")) {
//                suggestion.click();
//            }
//        }
//    }
    }
}