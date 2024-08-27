package com.Appdemo.runner;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Appdemo.Pom.pomAppdemo;
import com.Appdemo.generic.Base_classAppdemo;
@Listeners(com.Appdemo.generic.listannersdemo.class)
public class run extends Base_classAppdemo {
@Test
public void addCart()  {
	pomAppdemo p=new pomAppdemo(driver);
	p.click_btn().click();
	p.ent_emil().sendKeys("avinashbiradar8@gmail.com");
	p.ent_pass().sendKeys("a9632964248");
	p.cli_logbtn().click();
	p.clic_book().click();
	p.clic_com().click();
	p.cli_tab().click();
	p.click_link().click();
	p.clic_chebox().click();
	p.clic_cheb().click();
	p.clic_updat().click();
	p.clic_logout().click();
}
}
