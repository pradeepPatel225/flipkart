package filpkartPagewiseClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import flipkartUtil.WebUtil;

public class FlipkartHomePage {

	//public WebDriver driver ;

	@FindBy(xpath = "//button[@class='_2KpZ6l _2doB4z']")
	private WebElement cancelbtn;

	@FindBy(xpath = "(//img[@class='_2OHU_q aA9eLq' ]//following-sibling::img[@class='kJjFO0 _3DIhEh'])[1]")
	private WebElement banner;

	@FindBy(xpath = "//span[text()='Electronics']")
	private WebElement electronic;

	
	
	@FindBy(xpath = "//div[@class='_1QrT3s']//a")
	private List<WebElement> subnmenu;
	

	//=============================================================================================	
	private WebUtil commonmethod;

	public FlipkartHomePage(WebUtil wu) {

		PageFactory.initElements(wu.getWebDriver(), this);
		commonmethod=wu;

	}

	//=========================================================================================
	public void cancelLoginPopup() throws InterruptedException {
		commonmethod.click(cancelbtn, "User clicked on cancel button");
		Thread.sleep(5000);
	}

	public void clickOnAnyBanner() throws InterruptedException {
		commonmethod.jsClick(banner, "User clicked on Banner");

		Thread.sleep(2000);
	}

	public void mooveOnElectronic() {

		commonmethod.mouseover(electronic, "user mouseover on Electronic menu");
	String menutext=	electronic.getText();
	System.out.println(menutext);
	}



	public void clickonMainMenuandprintSubMenu() throws InterruptedException{

		
			for (WebElement single : subnmenu) {
				String subMenu = single.getText();
				
				System.out.println(subMenu);
			}

			System.out.println("=======================================================");


		}

	}


