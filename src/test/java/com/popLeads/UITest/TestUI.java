package com.popLeads.UITest;

import com.popLeads.pages.BasePage;
import com.popLeads.utilities.BrowserUtilities;
import com.popLeads.utilities.ConfigurationReader;
import com.popLeads.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestUI extends BasePage {
Actions actions=new Actions(Driver.getDriver());
WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
@Test
    public void test(){
Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    for (WebElement eachCourse : courses) {
        System.out.println(eachCourse.getText());
    }

    course1.click();


    actions.click(faceToFace).perform();


    for (WebElement webElement : date) {
        System.out.println(webElement.getText());
    }
wait.until(ExpectedConditions.elementToBeClickable(date1));
date1.click();
    add.click();

    Assert.assertTrue(kontrol.equals("Added To Cart"));
}


}
