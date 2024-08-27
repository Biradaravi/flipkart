package com.Appdemo.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomAppdemo {
     @FindBy (linkText = "Log in") private WebElement log_btn;
     @FindBy (xpath = "//input[@id='Email']") private WebElement emai_text;
     @FindBy (xpath = "//input[@id='Password']") private WebElement pass_text;
     @FindBy(xpath = "//input[@value='Log in']") private WebElement cli_log;
     @FindBy (xpath = "//div[@class='header-menu']/ul[1]/li[1]/a") private WebElement boo_tab;
     @FindBy (xpath = "//a[contains(@title,'Show details for Computing and Internet')]/../following-sibling::div[1]/div[3]/div[2]/input")
     private WebElement comp_btn;
     @FindBy (xpath = "//a[@title='Show details for Computing and Internet']/../../../following-sibling::div[2]/div/div[2]/div[3]/div[2]/input")
     private WebElement com_tab;
     @FindBy(xpath = "//span[text()='Shopping cart']") private WebElement shoop_link;
     @FindBy (xpath = "//tr[@class='cart-header-row']/../../tbody/tr[1]/td[1]/input") private WebElement chek_box1;
     @FindBy(xpath = "//tr[@class='cart-header-row']/../../tbody/tr[2]/td[1]/input") private WebElement che_box2;
     @FindBy(xpath = "//input[@name='updatecart']") private WebElement upd_btn;
     @FindBy(xpath = "//a[text()='Log out']") private WebElement logout_btn;
     
     public pomAppdemo(WebDriver driver)
     {
    	 PageFactory.initElements(driver, this);
     }
     public WebElement click_btn()
     {
    	 return log_btn;
     }
     public WebElement ent_emil()
     {
    	 return emai_text;
     }
     public WebElement ent_pass()
     {
    	 return pass_text;
     }
     public WebElement cli_logbtn()
     {
    	 return cli_log;
     }
     public WebElement clic_book()
     {
    	 return boo_tab;
     }
     public WebElement clic_com()
     {
    	 return comp_btn;
     }
     public WebElement cli_tab()
     {
    	 return com_tab;
     }
     public WebElement click_link()
     {
    	 return shoop_link;
     }
     public WebElement clic_chebox()
     {
    	 return chek_box1;
     }
     public WebElement clic_cheb()
     {
    	 return che_box2;
     }
     public WebElement clic_updat()
     {
    	 return upd_btn;
     }
     public WebElement clic_logout()
     {
    	 return logout_btn;
     }
     
 }
