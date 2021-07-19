package com.bridgelabz.keyword.base;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseClass {
    public static  WebDriver driver;
    public  static Properties prop;

    public static  WebDriver  init_driver(String browserName) throws InterruptedException {


        if(browserName.equals("chrome")){
           //handle browser level show notification pop window
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-notifications");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            Thread.sleep(400);
        }
        return driver;
    }
    public static Properties init_properties() {
        prop=new Properties();
        try {
            FileInputStream ip = new FileInputStream("C:\\Users\\sachin\\IdeaProjects\\KeywordDriven\\src\\test\\resources\\config.properties");
            prop.load(ip);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return prop;
    }

}
