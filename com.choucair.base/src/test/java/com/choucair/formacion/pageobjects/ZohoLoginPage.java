package com.choucair.formacion.pageobjects;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.zoho.com/es-xl/crm/")
public class ZohoLoginPage  extends PageObject{
	
	
	//btn iniciar sesion
	@FindBy(xpath="//*[@id=\"block-block-3\"]/div/div[1]/a[2]")
	public WebElementFacade btniniciarSesion;
	
	
	//campo usuario
		@FindBy(id="lid")
		public WebElementFacade txtUsername;
		
		
		//campo contraseña
		@FindBy(id="pwd")
		public WebElementFacade txtPassword;
		
		//boton inicio de sesion
		@FindBy(id="signin_submit")
		public WebElementFacade btnSignIn;
		
		//label del home verificar
		@FindBy(id="show-uName")
		public WebElementFacade lblHomePpal;
		
		public void BtIniciarSesion() {
			btniniciarSesion.click();
		}
	
	public void IngresarDatos(String strUsuario,String strPass) {
		txtUsername.sendKeys(strUsuario);
		txtPassword.sendKeys(strPass);
		btnSignIn.click();
	}
	
	public void VerificaHome() {
		String labelv = "Bienvenido Jhon Edinson Acevedo";
		String strMensaje = lblHomePpal.getText();
		assertThat(strMensaje, containsString(labelv));
	}

}
