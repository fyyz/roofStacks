package com.roofstacks.step_definitions;

import com.roofstacks.pages.BasePage;
import com.roofstacks.pages.RoofStacksPage;
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
        Thread.sleep(5);
        String actualResult =roofStacksPage.leadProductTesterText.getText();
        System.out.println("actual = " + actualResult);

        Thread.sleep(5);

        Assert.assertEquals(expectedResult,actualResult);

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




    }




}
