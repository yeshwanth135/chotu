package com.chicha.test;

import org.testng.annotations.Test;

import com.chicha.genericlib.FileLib;
import com.chicha.genericlib.baseTest;
import com.chicha.genericlib.webdrivercommomLib;
import com.chicha.pages.createaccountPage;
import com.chicha.pages.customviewPage;
import com.chicha.pages.homePage;
import com.chicha.pages.loginPage;

public class createaccountTest extends baseTest {
    
	@Test
	public void verify() throws Throwable
	{
	baseTest bt = new baseTest();
    bt.openBrowser();	
		loginPage lp = new loginPage();
		FileLib flib= new FileLib();
		lp.logintoappn(flib.readpropData(PROP_PATH, "username"), flib.readpropData(PROP_PATH, "password"));
		
		webdrivercommomLib wlib=new webdrivercommomLib();
	    wlib.verify(wlib.getpageTitle(), flib.readpropData(PROP_PATH, "homeTitle"), "Home Page");
	    
	    homePage hp = new homePage();
	    hp.clickaccountsTab();
	    
	    wlib.verify(wlib.getpageTitle(), flib.readpropData(PROP_PATH, "accountstab"), "Displaying Custom View Details");
	    customviewPage cv=new customviewPage();
	    cv.clicknewaccountsBtn();
	    
	    wlib.verify(wlib.getpageTitle(), flib.readpropData(PROP_PATH,"createaccount"), "Create Accounts Page");
	    createaccountPage ca=new createaccountPage(); 
	    ca.createaccountwithmandatoryDetails(flib.readexcelData(EXCEL_PATH, "createaccount", 1, 0));
	    //wlib.verify(wlib.getpageTitle(), flib.readpropData(PROP_PATH, "accountDetails"), "account");
	}
}
