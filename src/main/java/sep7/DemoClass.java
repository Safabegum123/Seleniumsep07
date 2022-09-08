package sep7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("https://amazon.com");
        String text= driver.getTitle();
        System.out.println(text);
        System.out.println("Safa");

    }
}
