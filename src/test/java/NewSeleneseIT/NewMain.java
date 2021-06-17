/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package NewSeleneseIT;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author yostian
 */
public class NewMain {
    
    @Test
    public void testSimple() throws Exception {
        // Create a new instance of the Chrome driver
        // Notice that the remainder of the code relies on the interface, 
        // not the implementation.
        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        //Navigate to www.amazon.com
        driver.navigate().to("https://www.amazon.com");
        //Click on navbar to find All Department
        driver.findElement(By.xpath("/html/body/div[1]/header/div/div[4]/div[1]/a")).click();
        //Suspend execution for  making processor time available to the other threads in millisecond
        Thread.sleep(2000);
        //Click on Electronics
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/ul[1]/li[7]/a")).click();
        //Suspend execution for  making processor time available to the other threads in millisecond
        Thread.sleep(1500);
        //Click on Television & Video
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/ul[5]/li[15]/a")).click();
        //Suspend execution for  making processor time available to the other threads in millisecond
        Thread.sleep(2000);
        //Click on Televisions
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[2]/div/div[3]/span/div[1]/span/div/div/div[1]/ul/li[14]/span/a/span")).click();
        //Suspend execution for  making processor time available to the other threads in millisecond
        Thread.sleep(1500);
        //Select the Television under 32 inch
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[2]/div/div[3]/span/div[1]/span/div/div/div[5]/ul[3]/li[1]/span/a/div/label/i")).click();
        //Suspend execution for  making processor time available to the other threads in millisecond
        Thread.sleep(2000);
        //Click On Sort By
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/span/div/span/h1/div/div[2]/div/div/form/span/span/span/span/span[1]")).click();
        //Suspend execution for  making processor time available to the other threads in millisecond
        Thread.sleep(2000);
        //Choose Price:High to Low
        driver.findElement(By.xpath("/html/body/div[4]/div/div/ul/li[3]/a")).click();
        //Suspend execution for  making processor time available to the other threads in millisecond
        Thread.sleep(1000);
        //Select Model Year = 2017
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[2]/div/div[3]/span/div[1]/span/div/div/div[5]/ul[5]/li[5]/span/a/div/label/i")).click();
        //Suspend execution for  making processor time available to the other threads in millisecond
        Thread.sleep(2000);
        //Type On $Max = 150
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[2]/div/div[3]/span/div[1]/span/div/div/div[4]/ul/li[2]/span/form/input[10]")).sendKeys("150");
        //Suspend execution for  making processor time available to the other threads in millisecond
        Thread.sleep(1000);
        //Click Go
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[2]/div/div[3]/span/div[1]/span/div/div/div[4]/ul/li[2]/span/form/span[3]/span/input")).click();
        //Suspend execution for  making processor time available to the other threads in millisecond
        Thread.sleep(1000);
        //Choose first product in search result
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[1]/div/span[3]/div[2]/div[1]/div/span/div/div/span/a/div/img")).click();
        //Suspend execution for  making processor time available to the other threads in millisecond
        Thread.sleep(1000);
        //Click on Add to list
        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[10]/div[4]/div[1]/div[4]/div/div/div/div/div/form/div/div/div[5]/div[1]/div[1]/span/span/a")).click();
        //Suspend execution for  making processor time available to the other threads in millisecond
        Thread.sleep(1000);
        //Input Random Username
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[1]/form/div/div/div/div[1]/input[1]")).sendKeys("Quality Assurance Test");
        //Suspend execution for  making processor time available to the other threads in millisecond
        Thread.sleep(1000);
        //Click Submit
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[1]/form/div/div/div/div[2]/span/span/input")).click();
        //Closing the application
        driver.close();
    }
    
    
     public static void main(String []args)throws Exception{
        NewMain ts = new NewMain();
        ts.testSimple();
    }
    
    
}
