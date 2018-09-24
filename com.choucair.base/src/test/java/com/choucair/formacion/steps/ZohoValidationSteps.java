package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.ZohoLoginPage;
import com.choucair.formacion.pageobjects.ZohoMainPage;

import net.thucydides.core.annotations.Step;

public class ZohoValidationSteps {
	
	ZohoMainPage zohoMainPage;
	ZohoLoginPage zohoLoginPage;
	
	@Step
	public void Ingresar() {		
		zohoMainPage.open();
	}
	
	@Step
	public void IniciarSesion(String strUsuario,String strPass) {		
		
		zohoLoginPage.IngresarDatos(strUsuario,strPass);
		zohoLoginPage.VerificaHome();
	}
	

}
