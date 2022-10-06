package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    WebDriver driver;

    private By linkMotDePassLostLocator = By.cssSelector("#root > div.LoginPage_page__awk27 > main > div > div > form > a");
    private By InputMotDePassLostLocator = By.cssSelector("#root > div.PwdPages_container__JV5LW > main > form > div > div > input");

    private By ButtonValiderLocator = By.xpath("//*[@id=\"root\"]/div[2]/main/form/button");

    private By MessageLocator = By.xpath("//*[@id=\"root\"]/div[2]/main/form/div[1]");

    private final int TIMEOUT_COOKIE = 1000;

    public HomePage(WebDriver driver){

        this.driver = driver;
    }

    public HomePage clickMotDePassLost(){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT_COOKIE));
        WebElement linkMotDePassLost = wait.until(ExpectedConditions.visibilityOfElementLocated(linkMotDePassLostLocator));
        linkMotDePassLost.click();
        return this;
    }

    public HomePage EnterMotDePassLost(String val){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT_COOKIE));
        WebElement InputMotDePassLost = wait.until(ExpectedConditions.visibilityOfElementLocated(InputMotDePassLostLocator));
        InputMotDePassLost.sendKeys(val);
        return this;
    }

    public HomePage ClickValider(){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT_COOKIE));
        WebElement ButtonValider = wait.until(ExpectedConditions.visibilityOfElementLocated(ButtonValiderLocator));
        ButtonValider.click();
        return this;
    }

    public HomePage CheckPageContains(String message){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT_COOKIE));
        WebElement Message = wait.until(ExpectedConditions.visibilityOfElementLocated(MessageLocator));
        Message.getText().contains(message);
        return this;
    }


}
