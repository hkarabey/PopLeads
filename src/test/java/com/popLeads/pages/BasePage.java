package com.popLeads.pages;

import com.popLeads.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='sc-18ecabe2-0 sc-18ecabe2-1 hyuaVJ fCWyKC']//div[@class='sc-18ecabe2-0 sc-909ce6e0-0 djRASc kRfcpp']")
    public List<WebElement> courses;

    @FindBy(xpath = "(//div[.='Facility Management Professional® - Review Course'])[2]")
    public WebElement course1;

    @FindBy(xpath = "((//div[@class='sc-18ecabe2-0 flVutI'])[3]//div[1]")
    public WebElement faceToFace;

    @FindBy(xpath = "//label[@class='sc-18ecabe2-0 flVutI']")
    public List<WebElement> date;

    @FindBy(xpath = "(//label[@class='sc-18ecabe2-0 flVutI'])[1]")
    public WebElement date1;

    @FindBy(xpath = "//button[@aria-label='Add to cart']")
    public WebElement add;

    @FindBy(xpath = "//div[@class='sc-18ecabe2-0 cQzevD']")
public WebElement kontrol;

}
