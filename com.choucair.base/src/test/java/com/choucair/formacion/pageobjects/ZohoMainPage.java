package com.choucair.formacion.pageobjects;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.zoho.com/es-xl/crm/")
public class ZohoMainPage extends PageObject{
	
	@FindBy(xpath="//*[@id=\"block-block-3\"]/div/div[1]/a[2]")
	public WebElement IniciarSesion;
	
	public void Ingresar() {
		IniciarSesion.click();		
	}

}
