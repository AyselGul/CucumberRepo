package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.WUniPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.Set;

public class WebUniversitystepdefinitions {
    WUniPage wup = new WUniPage();
    Actions actions= new Actions(Driver.getDriver());



    @Given("Login Portal'a  kadar asagi iner")
    public void login_portal_a_kadar_asagi_iner() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();



    }

    @Given("Login Portal'a  tiklar")
    public void login_portal_a_tiklar() {
        wup.loginPortalWebelement.click();
        String ilksyfWindowHandle= Driver.getDriver().getWindowHandle();
        String ikinciSyfWindowHandle="";

        Set<String> windowHandles=Driver.getDriver().getWindowHandles();

        for (String each :windowHandles
        ) {
            if(!each.equals(ilksyfWindowHandle))
                ikinciSyfWindowHandle+=each;
        }
    }

    @Then("acilan diger window'a gecer")
    public void acilan_diger_window_a_gecer() {

        ReusableMethods.switchToWindow("WebDriver | Login Portal");

    }
    @Then("{string} ve  {string} kutularina deger yazdirin")
    public void ve_kutularina_deger_yazdirin(String username, String password) {
        wup.wuusername.sendKeys(username);
        wup.wupassword.sendKeys(password);
    }

    @Then("WebUniversity Login butonuna basar")
    public void web_university_login_butonuna_basar() {
        wup.wuloginButton.click();
    }

    @Then("Popup'ta cikan yazinin {string} oldugunu test eder")
    public void popup_ta_cikan_yazinin_oldugunu_test_eder(String popUp) {
        String alertText=Driver.getDriver().switchTo().alert().getText();
        String expectedAlertText="validation failed";
        Assert.assertTrue(expectedAlertText.contains(alertText));
    }
    @Then("Ok diyerek Popup'i kapatir")
    public void ok_diyerek_popup_i_kapatir() {
        Driver.getDriver().switchTo().alert().accept();

    }
    @Then("Ilk sayfaya geri doner")
    public void ilk_sayfaya_geri_doner() {

        Driver.getDriver().navigate().to(ConfigReader.getProperty("WebUniversityUrl"));

    }
    @Then("Ilk sayfaya donuldugunu test eder")
    public void ilk_sayfaya_donuldugunu_test_eder() {
       String actualTitle= Driver.getDriver().getTitle();
       String expectedTitle="WebDriverUniversity.com";

       Assert.assertEquals(expectedTitle,actualTitle);


    }

}
