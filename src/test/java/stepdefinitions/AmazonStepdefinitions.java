package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepdefinitions {

    AmazonPage amazonPage = new AmazonPage();

    @Given("kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("AmazonUrl"));
    }


    @And("flower icin arama yapar")
    public void flowerIcinAramaYapar() {
        Driver.getDriver().switchTo().alert();
        amazonPage.homepageAlert.click();
        amazonPage.amazonSearchbox.click();
        amazonPage.amazonSearchbox.sendKeys("flower", Keys.ENTER);

    }


    @Then("sonuclarin flower icerdigini test eder")
    public void sonuclarinFlowerIcerdiginiTestEder() {
        Assert.assertTrue(amazonPage.flowerSonucYazisiElementi.isDisplayed());

    }

    @And("crayon icin arama yapar")
    public void crayonIcinAramaYapar() {
        amazonPage.amazonSearchbox.sendKeys("crayon", Keys.ENTER);
    }


    @Then("sonuclarin crayon icerdigini test eder")
    public void sonuclarinCrayonIcerdiginiTestEder() {
        Assert.assertTrue(amazonPage.crayonSonucYazisiElementi.isDisplayed());
    }

    @And("car icin arama yapar")
    public void carIcinAramaYapar() {
        amazonPage.amazonSearchbox.sendKeys("car", Keys.ENTER);
    }

    @Then("sonuclarin car icerdigini test eder")
    public void sonuclarinCarIcerdiginiTestEder() {
        Assert.assertTrue(amazonPage.carSonucYazisiElementi.isDisplayed());
    }

    @And("sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }


    @And("{string} icin arama yapar")
    public void icinAramaYapar(String arananKelime) {

        amazonPage.amazonSearchbox.click();
        amazonPage.amazonSearchbox.sendKeys(arananKelime, Keys.ENTER);
    }

    @Then("sonuclarin {string} icerdigini test eder")
    public void sonuclarinIcerdiginiTestEder(String arananKelime) {
        Assert.assertTrue(amazonPage.flowerSonucYazisiElementi.isDisplayed());

    }

    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String requiredUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(requiredUrl));
    }

}






