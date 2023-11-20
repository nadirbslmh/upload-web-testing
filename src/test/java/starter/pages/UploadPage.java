package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class UploadPage extends PageObject {
    private By uploadButton() {
        return By.id("file");
    }

    private By title() {
        return By.xpath("/html/body/h1");
    }

    private By submitUpload() {
        return By.xpath("/html/body/form/input[2]");
    }

    @Step
    public boolean validateOnWebPage() {
        return $(title()).isDisplayed();
    }

    @Step
    public void uploadFile() {
        WebElement uploadElement = $(uploadButton());
        // insert sample file to upload, must be full path
        uploadElement.sendKeys("/home/nadir/IdeaProjects/upload-web-testing/README.md");
        $(submitUpload()).click();
    }

}
