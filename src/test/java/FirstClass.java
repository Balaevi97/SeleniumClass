import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {

    @Test
    public void testLogin () throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://test.css.credo.ge/");

        System.out.println("Page title is: " + driver.getTitle());
        Thread.sleep(3000);
        driver.close();
    }
}
