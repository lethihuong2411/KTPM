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
public class TestCase2 {
    
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
            System.setProperty("webdriver.chrome.driver","C:\\Users\\MM\\Documents\\NetBeansProjects\\Selenium\\chromedriver.exe");
            String url="http://localhost/Web_sach1/login.php";
            WebDriver driver = new ChromeDriver();
            driver.get(url);
            driver.manage().window().maximize();
            Thread.sleep(1000);
            
            WebElement btn_dkingay = driver.findElement(By.xpath("//a[contains(text(),'Đăng ký')]"));
            btn_dkingay.click();
            Thread.sleep(3000);
                       
            WebElement hovaten = driver.findElement(By.name("name"));
            hovaten.sendKeys("Thanh Nga ");
            Thread.sleep(1000);

            WebElement email = driver.findElement(By.name("email"));
            email.sendKeys("ThanhNga@gmail.com");
            Thread.sleep(1000);
            
            WebElement matkhau = driver.findElement(By.name("password"));
            matkhau.sendKeys("1234567");
            Thread.sleep(1000);
           
            WebElement rematkhau = driver.findElement(By.name("cpassword"));
            rematkhau.sendKeys("1234567");
            Thread.sleep(1000);
            
            WebElement cv = driver.findElement(By.xpath("//option[contains(text(),'user')]"));
            cv.sendKeys("user");
            Thread.sleep(1000);
                  
            WebElement btn_dangki = driver.findElement(By.xpath("//body/div[1]/form[1]/input[5]"));
            btn_dangki.click();
            Thread.sleep(1000);
             
            //WebElement tb = driver.findElement(By.xpath("//p[contains(text(),'Username đã tồn tại')]"));
            
            //String tb = driver.switchTo().alert().getText();
            //String actual = "Đăng kí thành công";
            
//            String at = driver.getTitle();
//            String et = "BookStore";
//            driver.close();
//            if(!tb.toString().equals(actual)){
//                System.out.println("Test Successful");   
//            }
//            else{
//                System.out.println("Test Failure");  
//            }
            
            //Thread.sleep(2000);
            driver.quit();
        }
       
}


    