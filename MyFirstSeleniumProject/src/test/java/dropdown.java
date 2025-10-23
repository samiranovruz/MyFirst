import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        WebElement dropdownelement = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdown = new Select(dropdownelement);
        dropdown.selectByValue("USD");
        System.out.println (dropdown.getFirstSelectedOption().getText());
        Thread.sleep(2000);

        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);
       for (int i=1; i<5; i++) {
           driver.findElement(By.id("hrefIncAdt")).click();
       }
       driver.findElement(By.id("btnclosepaxoption")).click();
    }
}
//bu oldu
