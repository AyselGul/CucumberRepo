package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HMCPage;
import utilities.ConfigReader;

public class HMCstepdefinitions {
    HMCPage hmc=new HMCPage();


    @Given("login linkine tiklar")
    public void login_linkine_tiklar() {
        hmc.hmcampHomePageLoginLinki.click();
    }
    @Then("kullanici adi olarak {string} girer")
    public void kullanici_adi_olarak_girer(String userType) {
        hmc.usernameBox.sendKeys(ConfigReader.getProperty(userType));

    }
    @Then("password olarak {string} girer")
    public void password_olarak_girer(String passwordType) {
        hmc.passwordBox.sendKeys(ConfigReader.getProperty(passwordType));

    }
    @And("login butonuna basar")
    public void loginButonunaBasar() {
        hmc.hmcLoginButton.click();
    }
    @Then("basarili olarak giris yapildigini test eder")
    public void basarili_olarak_giris_yapildigini_test_eder() {
        Assert.assertTrue(hmc.listOfUsersYaziElementi.isDisplayed());
    }

    @And("giris yapilamadigini test eder")
    public void girisYapilamadiginiTestEder() {
        Assert.assertTrue(hmc.girisYapilamadiYaziElementi.isDisplayed());

    }

    @Then("scenarion outline'dan username olarak {string} yazar")
    public void scenarionOutlineDanUsernameOlarakYazar(String username) {
        hmc.usernameBox.sendKeys(username);

    }

    @Then("scenarion outline'dan password olarak {string} yazar")
    public void scenarionOutlineDanPasswordOlarakYazar(String password) {
        hmc.passwordBox.sendKeys(password);
    }
}
