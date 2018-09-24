package com.choucair.formacion.steps;

import org.jruby.RubyProcess.Sys;

import com.choucair.formacion.pageobjects.ZohoLoginPage;
import com.choucair.formacion.pageobjects.ZohoMainPage;
import com.choucair.formacion.pageobjects.ZohoNuevaTareaPage;

import net.thucydides.core.annotations.Step;

public class ZohoMenuNuevaTareaSteps {
	
	ZohoNuevaTareaPage zohoNuevaTareaPage;
	ZohoLoginPage zohoLoginPage;
	
	@Step
	public void MenuNuevaTarea() {
		zohoNuevaTareaPage.menuValidation();		
	}

	@Step
	public void IniciarSesion(String strUsuario,String strPass) {		
		zohoLoginPage.open();
		zohoLoginPage.BtIniciarSesion();
		zohoLoginPage.IngresarDatos(strUsuario,strPass);
		zohoLoginPage.VerificaHome();
	}

}
