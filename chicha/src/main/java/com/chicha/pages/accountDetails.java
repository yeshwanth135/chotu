package com.chicha.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chicha.genericlib.baseTest;

public class accountDetails {
	
	@FindBy(xpath="(//input[@name='Delete2'])[1]") private WebElement dbtn;
	@FindBy(xpath="(//input[@name='Clone2'])[1]") private WebElement clonebtn;
	public accountDetails() {
		PageFactory.initElements(baseTest.driver, this);
	}
	public void ddeleteaccountdetails() {
		dbtn.click();
	}
	public void clonebutton() {
		clonebtn.click();
	}

}
