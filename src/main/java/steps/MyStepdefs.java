package steps;

import cucumber.api.java.After;
import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

public class MyStepdefs {

    WebDriver driver;
    HomePage homePage;

    String val;

    @Given("je suis sur la page de connexion")
    public void je_suis_sur_la_page_de_connexion() {
        System.out.println("je suis sur la page de connexion");

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tipoca-recette.sogelabs.com/");
    }

    @When("cliquer sur Lost your password?")
    public void cliquer_sur_Lost_your_password() {

        homePage = new HomePage(driver);
        homePage.clickMotDePassLost();


    }

    @And("Saisir un {string}")
    public void saisirUnEmailInvalid(String val) {
        homePage.EnterMotDePassLost(val);
    }

    @When("cliquer sur Reset Password")
    public void cliquer_sur_Reset_Password() {
        homePage.ClickValider();
    }

    @Then("Un message d’erreur s’affiche {string}")
    public void un_message_d_erreur_s_affiche(String message) {
        //homePage.PageContains()
        homePage.CheckPageContains(message);
    }
    @After
    public void ClearnDown(){
        driver.quit();
    }


}
