package com.choucair.formacion.pageobjects;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


public class ZohoNuevaTareaPage extends PageObject{
	
	//Plus 
	
	//campo email
	@FindBy(xpath="//*[@id=\"createIcon\"]")
	public WebElementFacade OptPlus;
		
	//opcion Nueva Tarea
	@FindBy(xpath="//*[@id=\"submenu_Tasks\"]")
	public WebElementFacade SubNuevaTarea;
	
	//Label Nueva Tarea validacion
	@FindBy(xpath="//*[@id=\"heading_title\"]/table/tbody/tr/td")
	public WebElementFacade lblNuevaTarea;
	
	
	public void menuValidation() {
		OptPlus.click();		
		SubNuevaTarea.click();		
		String strMensaje = lblNuevaTarea.getText();
		assertThat(strMensaje, containsString("Crear Tarea"));
	}
	
		
	
	
	
	

}
