package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public void invalidLoginTest() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");

        driver.manage().window().maximize();

        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("admin");

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        String error = driver.findElement(By.xpath("//div[@class='flash error']")).getText();
        System.out.println(error);

        driver.quit();

    }

}
