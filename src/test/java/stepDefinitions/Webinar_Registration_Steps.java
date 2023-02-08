package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.reporters.XMLConstants;
import pages.BasicActions;
import pages.Webinar_Registration_Page;


public class Webinar_Registration_Steps extends BasicActions {

    Webinar_Registration_Page reg;
    @Given("User is on Webinar Registration page {string}")
    public void user_is_on_webinar_registration_page(String string) {
//        reg = new Webinar_Registration_Page(driver);
//        reg.open_Browser_And_Pass_Url(string);
        setUp();
        driver.get(string);
    //    System.out.println("the User is on Webinar Registration page");
    }

    @When("user enter the valid value to Phone number field {string}")
    public void user_enter_the_valid_value_to_phone_number_field(String string) throws InterruptedException {
        reg = new Webinar_Registration_Page(driver);
        reg.phone_Number(string);
        Thread.sleep(3000);
     //   System.out.println("the User entered valid phone number");
    }

    @When("user enter the valid email to Email Id field {string}")
    public void user_enter_the_valid_email_to_email_id_field(String string) throws InterruptedException {
        reg.email_Id(string);
        Thread.sleep(3000);
//        System.out.println("the User entered valid email id");
    }

    @When("user enter the valid Full name to Full name field {string}")
    public void user_enter_the_valid_full_name_to_full_name_field(String string) throws InterruptedException {
        reg.username(string);
        Thread.sleep(3000);
//        System.out.println("the User entered valid full name");
    }

    @When("user select the Year of Passout {string}")
    public void user_select_the_year_of_passout(String string) throws InterruptedException {
        reg.year_Of_Passout(string);
//        System.out.println("the User selected year of passout");
        Thread.sleep(3000);
    }

    @When("user select the Education qualification {string}")
    public void user_select_the_education_qualification(String string) throws InterruptedException {
        reg.stream(string);
        Thread.sleep(3000);
//        System.out.println("the User selected Education qualification");
    }

    @When("click on Enter Room button")
    public void click_on_enter_room_button() throws InterruptedException {
        reg.click_Enter_Room();
        Thread.sleep(3000);
//        System.out.println("the User clicked on enter room button");
    }

    @Then("The user should successfully registered and should navigate to the landing page")
    public void the_user_should_successfully_registered_and_should_navigate_to_the_landing_page() throws InterruptedException {
        Thread.sleep(3000);
        reg.close();
//        System.out.println("the User successfully registered and navigated to landing page");
    }
}

//    @Given("User is on Webinar Registration page")
//    public void user_is_on_webinar_registration_page() {
//        System.out.println("the User is on Webinar Registration page");
//    }
//    @When("User enter valid data")
//    public void user_enter_valid_data() {
//
//        System.out.println("User entered valid data");
//    }
//    @When("User click on Enter Room button")
//    public void user_click_on_enter_room_button() {
//
//        System.out.println("User clicked on Enter Room button");
//    }
//    @Then("The user should be registered and should navigate to the landing page")
//    public void the_user_should_be_registered_and_should_navigate_to_the_landing_page() {
//        System.out.println("The user navigated to the landing page");
//    }



