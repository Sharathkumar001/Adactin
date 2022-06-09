package com.Runner_Adactin;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.Baseclass.Base_Class;
import com.Maven_Adac.Login_Ada;
import com.Maven_Adac.Search_Hotel;
import com.Reader.FileReaderManager;

public class Adactin_Runner extends Base_Class {
	
	public static WebDriver driver = getbrowser("msedge");
	
	public static void main(String[] args) throws IOException {
		
		Geturl(FileReaderManager.getInstanceFR().getInstanceCR().geturl());
		
		Login_Ada ada = new Login_Ada(driver);
		Search_Hotel sh = new Search_Hotel(driver);
		
		String user = readparticulardata("C:\\Users\\Lenovo\\eclipse-workspace\\Maven_Project\\Excel_Data\\Data_Driven.xlsx", 4, 1);
		SendkeyElement(ada.getEmail(), user);
		String pwd = readparticulardata("C:\\Users\\Lenovo\\eclipse-workspace\\Maven_Project\\Excel_Data\\Data_Driven.xlsx", 4, 2);
		SendkeyElement(ada.getPass(), pwd);
		ClickElement(ada.getLoginbutt());
		dropDown(sh.getLocation(), "byvisibletext", "London");
		dropDown(sh.getHotel(), "byindex", "2");
		dropDown(sh.getRoomtyp(), "byindex", "4");
		dropDown(sh.getRoomnum(), "byindex", "10");
		SendkeyElement(sh.getCheckindate(), "14/05/2022");
		SendkeyElement(sh.getCheckoutdate(), "15/05/2022");
		dropDown(sh.getAdultperroom(), "byindex", "2");
		dropDown(sh.getChildperroom(), "byindex", "2");
		ClickElement(sh.getSearch());
	}

}
