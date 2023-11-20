package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Assertions;
import starter.pages.UploadPage;

public class UploadSteps {

    @Steps
    UploadPage uploadPage;

    @Given("I am on the web page")
    public void onTheWebPage() {
        uploadPage.openUrl("http://localhost:5500/");
        Assertions.assertTrue(uploadPage.validateOnWebPage());
    }

    @When("I upload file")
    public void uploadFile() {
        uploadPage.uploadFile();
    }

    @Then("The file is uploaded")
    public void fileUploaded() {
        System.out.println("oke");
    }
}
