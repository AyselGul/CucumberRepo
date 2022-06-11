package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.EditorDataTablesPage;
import utilities.ConfigReader;
import utilities.Driver;

public class EditorStepdefinitions {
    EditorDataTablesPage edt = new EditorDataTablesPage();


    @Given("kullanici editor gider")
    public void kullaniciEditorGider() {
        Driver.getDriver().get(ConfigReader.getProperty("EditorDataTables"));
    }


    @Then("new butonuna basar")
    public void newButonunaBasar() {
        edt.newButonu.click();
    }

    @And("firstname olarak {string} yazar")
    public void firstnameOlarakYazar(String firstname) {
        edt.firstNameBox.sendKeys(firstname);
    }

    @And("{int} saniye bekler")
    public void saniyeBekler(int saniye) throws InterruptedException {
        Thread.sleep(saniye * 1000);
    }

    @And("lastname olarak {string} yazar")
    public void lastnameOlarakYazar(String lastname) {
        edt.lastNameBox.sendKeys(lastname);
    }

    @And("Position olarak {string} yazar")
    public void positionOlarakYazar(String position) {
        edt.possitionBox.sendKeys(position);
    }

    @And("Office olarak {string} yazar")
    public void officeOlarakYazar(String office) {
        edt.officeBox.sendKeys(office);
    }

    @And("Extension olarak {string} yazar")
    public void extensionOlarakYazar(String extention) {
        edt.extensionBox.sendKeys(extention);
    }

    @And("Start date olarak {string} yazar")
    public void startDateOlarakYazar(String startdate) {
        edt.dateBox.sendKeys(startdate);
    }

    @And("Salary olarak {string} yazar")
    public void salaryOlarakYazar(String salary) {
        edt.salary.sendKeys(salary);
    }

    @And("Create tusuna basar")
    public void createTusunaBasar() {
        edt.createButtonElement.click();
    }

    @When("kullanici {string} ile arama yapar")
    public void kullaniciIleAramaYapar(String firstname) {
        edt.searchBoxElement.sendKeys(firstname);
    }


    @Then("isim bolumunde {string} oldugunu dogrular")
    public void isimBolumundeOldugunuDogrular(String firstname) {
        Assert.assertTrue(edt.aramasonucuElement.isDisplayed());
    }


}
