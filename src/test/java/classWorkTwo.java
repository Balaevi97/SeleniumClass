import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class classWorkTwo {

    @Test
    public void googleSearch () {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Actions actions = new Actions(driver);
        driver.get("https://www.google.com");
        driver.findElement(By.id("APjFqb")).sendKeys("Selenium WebDriver");
        actions.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();

        driver.findElement(By.xpath("//*[contains(text(), 'https://www.selenium.dev')]")).click();
        System.out.println(driver.getTitle());
    }
}
