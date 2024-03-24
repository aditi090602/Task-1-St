package SeleniumProj.SeleniumProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AppTest{
	
	@Test
    public void test() {
        // Set the path of Chrome driver
//        System.setProperty("webdriver.chrome.driver", "D:\\Lenovo2\\\\Downloadss\\chromedriver-win64\\chromedriver.exe");

        // Initialize WebDriver for Chrome
        WebDriver driver = new ChromeDriver();

        // Navigate to Coursera
        driver.get("https://www.coursera.org/");

        // Maximize the browser window
        driver.manage().window().maximize();
        
       
        // Inspect the search box
        WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"rendered-content\"]/div/header/div/div/div[2]/div[1]/div[3]/div/form/div/div[1]/input"));
        System.out.println("Search Box Attributes:");
        System.out.println("ID: " + searchBox.getAttribute("id"));
        System.out.println("Name: " + searchBox.getAttribute("name"));
        System.out.println("XPath: " + searchBox.getAttribute("xpath"));
        System.out.println("Class Name: " + searchBox.getAttribute("class"));
        System.out.println("CSS Value: " + searchBox.getCssValue("css"));

        // Inspect the Log In link
        WebElement loginLink = driver.findElement(By.linkText("Log In"));
        System.out.println("Log In Link Text: " + loginLink.getText());
        System.out.println("Log In Partial Link Text: " + loginLink.getAttribute("href"));

        // Close the browser
        driver.quit();
    }
}
