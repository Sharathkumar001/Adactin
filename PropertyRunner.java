
package com.Runner_Adactin;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.Baseclass.Base_Class;
import com.Maven_Adac.Login_Ada;
import com.Maven_Adac.Search_Hotel;
import com.Reader.FileReaderManager;

public class PropertyRunner extends Base_Class {
	
public static WebDriver driver = getbrowser("chrome");
	
	public static void main(String[] args) throws IOException {
				
		Geturl(FileReaderManager.getInstanceFR().getInstanceCR().geturl());
		
		Login_Ada ada = new Login_Ada(driver);
		Search_Hotel sh = new Search_Hotel(driver);
		SendkeyElement(ada.getEmail(), FileReaderManager.getInstanceFR().getInstanceCR().getusername());
		SendkeyElement(ada.getPass(), FileReaderManager.getInstanceFR().getInstanceCR().getpassword());
		ClickElement(ada.getLoginbutt());
}
}

