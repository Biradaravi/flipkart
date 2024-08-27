package com.Appdemo.generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class screenpicture {
   public static void getphoto(WebDriver driver) throws IOException
   {
	   Date d=new Date();
	   String sd = d.toString();
	   String da = sd.replaceAll(":", "-");
	   
	   TakesScreenshot tss=(TakesScreenshot)driver;
	   File tem = tss.getScreenshotAs(OutputType.FILE);
	   File dst=new File("./Photos/"+da+".jpg");
	   FileHandler.copy(tem, dst);
	   
   }
}
