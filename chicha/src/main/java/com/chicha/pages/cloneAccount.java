package com.chicha.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chicha.genericlib.baseTest;

public class cloneAccount {
	@FindBy(xpath="(//input[@name='Button'])[1]") private WebElement savebtn;
	@FindBy(xpath="(//input[@value='Save & New'])[1]") private WebElement sanbtN;
	
	public cloneAccount() {
		PageFactory.initElements(baseTest.driver, this);
	}
	
	public void savebutton() {
		savebtn.click();
	}
	public void saveandnewbuttoN() {
		sanbtN.click();
	}

}
