/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
  
/**
 *
 * @author LeThiHuong
 */
public class Selenium {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
            System.setProperty("webdriver.chrome.driver","C:\\Users\\MM\\Documents\\NetBeansProjects\\Selenium\\chromedriver.exe");
            String url="http://127.0.0.1:8000/login";
            WebDriver driver = new ChromeDriver();
            driver.get(url);
            
            driver.manage().window().maximize();
            Thread.sleep(1000);
            
            WebElement btn_login = driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[1]/a[1]"));
            btn_login.click();
            Thread.sleep(3000);
               
            WebElement name_email = driver.findElement(By.name("username"));
            name_email.sendKeys("huong@gmail.com");
            Thread.sleep(1000);

            WebElement name_password = driver.findElement(By.name("password"));
            name_password.sendKeys("123456");
            Thread.sleep(1000);
                
            WebElement btn_dangnhap = driver.findElement(By.xpath("//body/div[@id='tg-wrapper']/main[@id='tg-main']/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/button[1]"));
            btn_dangnhap.click(); 
            String at = driver.getTitle();
            String et = "BookStore";
            driver.close();
            if(at.equalsIgnoreCase(et))
            {
                System.out.println("Test Successful");   
            }
            else{
                System.out.println("Test Failure");  
            }
            
            Thread.sleep(2000);
            driver.quit();
        }
       
}
    
