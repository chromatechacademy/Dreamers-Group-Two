package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.web.WebDriverUtils;

public class StudentDetailsPage {

    //*Search Box by Keyword */
    @FindBy(xpath = "//input[@class='form-control']")
    public WebElement SearchByKeywordTextBox;
    ///*Search button under Keyword */
    @FindBy(xpath = "//button[@value='search_full']")
    public WebElement SearchByKeyWordButton; 
    //*Student Name Link Finded by keyword */
    @FindBy(xpath = "//tr[@role='row']//a[contains(text(),'Elena')]")
    public WebElement StudentLink;
    //*Disable Red Button Thumb Down*/
    @FindBy(xpath = "//i[@class='fa fa-thumbs-o-down']")
    public WebElement DisableRedButton;
    //*Disable Student Drop Down Reason */
    @FindBy(xpath = "//*[@id='disable_form']/div[1]/div/div/div/div[1]/div/select")
    public WebElement DropDownReason;
    //*Save Button on Disable Student Pop Up Window */
    @FindBy(xpath = "//*[@id='disable_form']/div[2]/div/button")
    public WebElement SaveButtonDisableStudentPopUp;
    //*Disable Reeaosn Text Under a Patient */
    @FindBy(xpath = "//b[normalize-space()='Disable Reason']")
    public WebElement DisableReasonText;
    //*Verified Enabled Student exist element*/
    @FindBy(xpath = "//td[normalize-space()='25031989']")
    public WebElement EnabledStudentExist;



    public StudentDetailsPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

}
