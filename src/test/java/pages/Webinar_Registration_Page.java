package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Webinar_Registration_Page extends BasicActions {

@FindBy(id="deftphnumber")
    WebElement phone_Number;
@FindBy(id="deftemail")
    WebElement email;
@FindBy(id="deftusername")
    WebElement username;
@FindBy(id="deftyear")
    WebElement drop_passout_Year;
@FindBy(xpath="//div[@value='2023']")
    WebElement passout_Year_2023;
@FindBy(id="deftdegree")
    WebElement drop_Degre;
@FindBy(xpath="//div[@value='Engineering (CS/IT)']")
    WebElement degree;
@FindBy(xpath="//span[@style='letter-spacing: 0;']")
    WebElement enter_Room_Btn;

    public Webinar_Registration_Page(WebDriver driver) {
 //       super();
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
//public void open_Browser_And_Pass_Url(String url){
//    setUp();
//    driver.get(url);
//}
public void phone_Number(String phone){
    phone_Number.sendKeys(phone);
}
public void email_Id(String email_id){
    email.sendKeys(email_id);
}
public void username(String u_name){
    username.sendKeys(u_name);
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,2000)");
}
public void year_Of_Passout(String year) {
    drop_passout_Year.click();
    if (year.equals("2023")) {
        passout_Year_2023.click();
    }
}
    public void stream(String qualification){
        drop_Degre.click();
        if (qualification.equals("Engineering (CS/IT)")){
            degree.click();
        }
}
public void click_Enter_Room(){
    enter_Room_Btn.click();
}
public void close(){
        driver.close();
}
}
