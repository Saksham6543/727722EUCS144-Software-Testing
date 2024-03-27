package com.example;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest {
    @Test
    public void TestHe() throws Exception {
        // configuring the browser
        WebDriverManager.chromedriver().setup();
        // creating an instance or an edge driver class to communicate with browser
        WebDriver driver = new ChromeDriver();

        // String FLIPKART_PATH="https://www.flipkart.com";
        // getting the url

        // String goog_path="https://iamneo.ai";
        // driver.get(goog_path);
        // driver.navigate().to(FLIPKART_PATH);
        driver.get("https://www.demoblaze.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(By.linkText("Laptops")).click();
        Thread.sleep(5000);
        driver.findElement(By.partialLinkText("MacBook air")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();
        Thread.sleep(5000);
        driver.switchTo().alert().accept();
        Thread.sleep(5000);
        driver.findElement(By.linkText("Cart")).click();
        Thread.sleep(5000);
        String t = driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/tr[1]/td[2]")).getText();

        String p = driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/tr/td[3]")).getText();
        Thread.sleep(5000);
        System.out.print(t + " " + p);
        Thread.sleep(5000);

        driver.close();
        // driver.findElement(By.className("gm-menu-item__txt")).click();
        // driver.findElement(By.cssSelector(""))
        // driver.findElement(By.id(""));
        // driver.findElement(By.name("uname"));
        // driver.findElement(By.tagName("p"));
        // driver.findElement(By.partialLinkText("Click")).click();
        // driver.findElement(By.linkText("Click here to generate otp"));
        // String title =driver.getTitle();
        // System.out.print(title);
        // String url=driver.getCurrentUrl();
        // System.out.println(url);
        // driver.navigate().to(goog_path);
        // driver.navigate().forward();
        // driver.navigate().back();
        // driver.navigate().refresh();
        // driver.findElement(By.className("gLFyf")).sendKeys("yo bitch");
        // driver.quit();

    }
}