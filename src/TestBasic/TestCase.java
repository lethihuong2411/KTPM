/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestBasic;

  
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author LeThiHuong
 */
public class TestCase {

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
            
            WebElement btn_dkingay = driver.findElement(By.xpath("//a[contains(text(),'Đăng ký ngay !!')]"));
            btn_dkingay.click();
            Thread.sleep(3000);
                       
            WebElement hovaten = driver.findElement(By.name("fullname"));
            hovaten.sendKeys("Lê Thị Hương");
            Thread.sleep(1000);

            WebElement username = driver.findElement(By.name("username"));
            username.sendKeys("huong@gmail.com");
            Thread.sleep(1000);
            
            WebElement matkhau = driver.findElement(By.name("password"));
            matkhau.sendKeys("123456");
            Thread.sleep(1000);
           
            WebElement rematkhau = driver.findElement(By.name("re_password"));
            rematkhau.sendKeys("123456");
            Thread.sleep(1000);
            
            WebElement diachi = driver.findElement(By.name("address"));
            diachi.sendKeys("Thôn 5 Quảng Phú Tp Thanh Hóa");
            Thread.sleep(1000);
            
            WebElement sdt = driver.findElement(By.name("phone"));
            sdt.sendKeys("0834306268");
            Thread.sleep(1000);
            
            WebElement btn_dangki = driver.findElement(By.xpath("//body/div[@id='tg-wrapper']/main[@id='tg-main']/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/button[1]"));
            btn_dangki.click();
            Thread.sleep(1000);
             
            WebElement tb = driver.findElement(By.xpath("//p[contains(text(),'Username đã tồn tại')]"));
            
            //String tb = driver.switchTo().alert().getText();
            String actual = "Username đã tồn tại";
            
//            String at = driver.getTitle();
//            String et = "BookStore";
            driver.close();
            if(!tb.toString().equals(actual)){
                System.out.println("Test Successful");   
            }
            else{
                System.out.println("Test Failure");  
            }
            
            Thread.sleep(2000);
            driver.quit();
        }
       
}
    

