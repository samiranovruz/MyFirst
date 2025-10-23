import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class dropdown2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//     driver.get("https://www.youtube.com/");
//     driver.findElement(By.cssSelector("input[name='search_query']")).sendKeys("Prens dizisi");
//     driver.findElement(By.xpath("//div/yt-searchbox/button")).click();

        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.xpath("//form[@class='form']/input[1]")).sendKeys("samira.novruz02@gmail.com");
        String password = getpassword (driver);
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
        driver.findElement(By.xpath("//input[contains(@name,'One')]")).click();
        driver.findElement(By.cssSelector("input#chkboxTwo")).click();
        driver.findElement(By.xpath("//*[text()='Sign In']")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.xpath("//form[@class='form']/p")).getText());
        Assert.assertEquals(driver.findElement(By.xpath("//form[@class='form']/p")).getText(), "* Incorrect username or password");


    }

    public static String getpassword(WebDriver driver) {

        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        String Text = driver.findElement(By.xpath("//h1[text()='Sign in']")).getText();
        String[] splittedtext1 = Text.split(" ");
        // [0] An Academy to Learn Earn
        // [1]  Shine  in your QA Career
//        String [] splittedtext2 = splittedtext1[1].split("Shine  in your QA");
//        String password = splittedtext2 [1] ;

        String password = splittedtext1[0];
        //yuxaridaki iki setir ile bu commentin ustundeki eyni neticeni verir
        System.out.println(password);
//
        return password;

        // [0] eyni
        // [1] Career


    }
}

