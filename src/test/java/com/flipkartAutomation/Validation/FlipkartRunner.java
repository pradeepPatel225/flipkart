package com.flipkartAutomation.Validation;

import org.testng.annotations.Test;

import filpkartPagewiseClass.FlipkartHomePage;
import flipkartUtil.ScreenRecorderUtil;
import flipkartUtil.Testbaseclass;
import flipkartUtil.WebUtil;

public class FlipkartRunner extends Testbaseclass {
     @Test
	public void flipkartValidation() throws Exception {
    	 WebUtil web= new WebUtil();
		FlipkartHomePage fkobj=	new FlipkartHomePage(util);
		
		fkobj.cancelLoginPopup();
		fkobj.clickOnAnyBanner();
		fkobj.mooveOnElectronic();
		fkobj.clickonMainMenuandprintSubMenu();

	}
}
