package Functionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class CharuAccount {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\geeth\\IdeaProjects\\Gmail\\driver\\chromedrivernew.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://accounts.google.com/");
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(5));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        //driver.findElement(By.id("identifierId")).sendKeys("msgeethadevims@gmail.com");
        //driver.findElement(By.xpath("//span[text()='Next']")).click();
        //driver.findElement(By.xpath("(//div[@class='VfPpkd-RLmnJb'])[2]")).click();
        driver.findElement(By.xpath("//span[text()='Create account']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='For my personal use']")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstName")).sendKeys("Charithya");
        Thread.sleep(2000);
        driver.findElement(By.name("lastName")).sendKeys("s");
        Thread.sleep(2000);
        driver.findElement(By.name("Username")).sendKeys("charithyageethadaughter");
        Thread.sleep(2000);
        driver.findElement(By.name("Passwd")).sendKeys("Geetha@81295");
        Thread.sleep(2000);
        driver.findElement(By.name("ConfirmPasswd")).sendKeys("Geetha@81295");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//div[@class='VfPpkd-RLmnJb'])[2]")).click();
        Thread.sleep(2000);


//        Actions action = new Actions(driver);
//        action.keyDown(Keys.TAB).pause(Duration.ofSeconds(2000))
////                .sendKeys("geethacharithyas")
////                .keyDown(Keys.TAB).pause(Duration.ofSeconds(2000))
////                .keyDown(Keys.TAB).pause(Duration.ofSeconds(2000))
////                .sendKeys("Geetha@81295")
////                .keyDown(Keys.TAB).pause(Duration.ofSeconds(2000))
////                .sendKeys("Geetha@81295")
////                .keyDown(Keys.TAB).pause(Duration.ofSeconds(2000))
//                .keyDown(Keys.SPACE).pause(Duration.ofSeconds(2000))
//                .keyDown(Keys.TAB).pause(Duration.ofSeconds(2000))
//                .keyDown(Keys.ENTER).build().perform();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//input[@type='tel'])[1]")).sendKeys("9945934340");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']")).click();

        Thread.sleep(20000);
        driver.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[1]")).click();

        WebElement month =driver.findElement(By.id("month"));
        Select Smonth = new Select(month);
        Smonth.selectByValue("12");
        Thread.sleep(2000);

        driver.findElement(By.name("day")).sendKeys("08");
        Thread.sleep(1000);
        driver.findElement(By.name("year")).sendKeys("1995");
        Thread.sleep(1000);

        WebElement gender =driver.findElement(By.id("gender"));
        Select Sgender = new Select(gender);
        Sgender.selectByValue("2");
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[2]")).click();

//        Alert alert = driver.switchTo().alert();
//        String text=alert.getText();
//        Thread.sleep(1000);
//        System.out.println("The alert is : "+ text);
//        alert.dismiss();
        Thread.sleep(2000);
        System.out.println("Account created");

    }


}
