package com.roofstacks.step_definitions;

import com.roofstacks.pages.BasePage;
import com.roofstacks.pages.RoofStacksPage;
import com.roofstacks.utilities.BrowserUtils;
import com.roofstacks.utilities.ConfigurationReader;
import com.roofstacks.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

public class UploadingFileStepDefs {

    RoofStacksPage roofStacksPage = new RoofStacksPage();


    @Given("user navigates to url")
    public void user_navigates_to_url() {
        Driver.get().get(ConfigurationReader.get("url"));

    }

    @Given("search for {string} in search button")
    public void search_for_in_search_button(String str) {

        roofStacksPage.googleSearchInput.sendKeys(str);
        roofStacksPage.googleSearchBtn.click();

    }

    @Then("select roofstacks.com on the search result page")
    public void select_roofstacks_com_on_the_search_result_page() {

        roofStacksPage.roofStackSelectionBtn.click();

    }

    @Then("click Career page")
    public void click_Career_page() {

        roofStacksPage.careerSelectionBtn.click();

    }

    @Then("select Product position from the jobs")
    public void select_Product_position_from_the_jobs() {

        roofStacksPage.productSelectionBtn.click();

    }

    @Then("click Lead Product Tester seçilir.")
    public void click_Lead_Product_Tester_seçilir() {

        roofStacksPage.leadProductTesterSelectionBtn.click();

    }

    @Then("verify that we are on Lead Product Tester page")
    public void verify_that_we_are_on_Lead_Product_Tester_page() throws InterruptedException {

        String expectedResult = "Lead Product Tester";

        BrowserUtils.waitForVisibility(roofStacksPage.leadProductTesterText,10);
        String actualResult =roofStacksPage.leadProductTesterText.getText();
        System.out.println("actual = " + actualResult);


        Assert.assertEquals(expectedResult,actualResult);
        Thread.sleep(5);

    }

    @Then("click SendCV button")
    public void click_SendCV_button() throws InterruptedException {

        roofStacksPage.sendCVSelectionBtn.click();
        Thread.sleep(5);

    }

    @Then("user enters email")
    public void user_enters_email() throws InterruptedException {

        roofStacksPage.emailInputBox.sendKeys(ConfigurationReader.get("email"));
        Thread.sleep(5);

    }

    @Then("upload a sample page to share your file")
    public void upload_a_sample_page_to_share_your_file() {

        String filePath = "C:\\Users\\HP\\Desktop\\ROOF STACKS\\src\\test\\resources\\sampleFile.txt";
        roofStacksPage.selectFileInputBox.sendKeys(filePath);
        roofStacksPage.uploadBtn.click();
        BrowserUtils.waitFor(5);
        String percentage = Driver.get().findElement(By.id("percent")).getText();
        System.out.println(" percentage= " +percentage );
        Assert.assertEquals("100%", percentage);

        /* Send CV/Make An Application'a basıldıktan sonra açılan "File Upload Form"da
         e-mail girişi yapılıp features klasörümüzün altında oluşturduğumuz örnek dosya
         (sampleFile.txt) seçilip "upload" tıklandığında başarılı bir şekilde dosya yüklemesi yapılamamaktadır.
         Bu durum "Manual" olarak test edildiğinde de gözükmektedir.) Dolayısıyla burada bir "BUG" bulunduğundan
         bu kısım "automate edilemez". STLC döngüsüne istinaden bir "Bug Ticket" açılır. İlgili developer'a assign
         edilip gerekli fix yapıldıktan sonra tekrar test edilir.
        */


//        String percentage = roofStacksPage.percentage.getText();
//        System.out.println("percentage = " + percentage);

        //

    }




}
