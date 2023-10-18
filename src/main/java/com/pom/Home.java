package com.pom;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Base_class;

public class Home extends Base_class {

	//public WebDriver driver;
	//span[text()='SHOP MEN']

	public Home( )
	{
		//driver = driv;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath = "//span[text()='SHOP WOMEN']")
	private WebElement shopwomen ;


	public WebElement getShopwomen() 
	{
		return shopwomen;

	}


	@FindBy(id="women_category")
	private WebElement women_category ;

	public WebElement get_women_category() 
	{
		return women_category;

	}


	@FindBy(xpath ="//span[text()='Beauty & Personal Care']" )
	private WebElement Beauty_and_personalCare ;

	public WebElement getBandP_care()
	{
		return Beauty_and_personalCare;
	}

	//a[@data-prod-id='17679158']

	@FindBy(xpath="//a[@data-prod-id='17679158']")
	private WebElement product ;

	public WebElement getproduct()
	{
		return product;
	}

	//div[text()='ADD TO CART']

	@FindBy(xpath = "//div[text()='ADD TO CART']")
	private WebElement cart ;

	public WebElement get_Cart()
	{
		return cart ;
	}
}







