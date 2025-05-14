package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HelloWebDriverTest {

    @Test
    public void openAndPrintTitle()
    {
        // 1. Launch browser
        WebDriver driver = new ChromeDriver();
        // 2. Navigate to your chosen URL

        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
        // 3. Print title
        String title = driver.getTitle();
        System.out.println(title);
        // 4. Quit browser
        driver.quit();
    }

}
