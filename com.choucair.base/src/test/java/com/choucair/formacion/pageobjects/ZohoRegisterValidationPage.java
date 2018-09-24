package com.choucair.formacion.pageobjects;

import org.openqa.selenium.WebElement;
import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import static org.hamcrest.Matchers.*;


public class ZohoRegisterValidationPage extends PageObject{	
	
	//Web Elements //////////////////////////////////////////////////
	
	//campo nombre	
	@FindBy(id = "namefield")
	public WebElementFacade txtNombre;	
	
	//campo email
	@FindBy(xpath="//*[@id=\"email\"]")
	public WebElementFacade txtEmail;
	
	//campo contraseña
	@FindBy(xpath="//*[@id=\"dialogRegister\"]/div[3]/div/input")
	public WebElementFacade txtPass;	
		
	//codigo pais
	@FindBy(xpath="//*[@id=\"dialogRegister\"]/div[7]/div[2]/label")
	public WebElementFacade checkTerminos;		
	
	//telefono	
	@FindBy(xpath="//*[@id=\"mobile\"]")
	public WebElementFacade txtTelefono;
	
	//pais		
	@FindBy(xpath="//*[@id=\"country\"]")
	public WebElementFacade cmbPais;
	
	//boton validate
	@FindBy(xpath="//*[@id=\"signupbtn\"]")
	public WebElementFacade btnValidate;
	
	
	//Label Bienvenida
	@FindBy(xpath="//*[@id=\"show-uName\"]")
	public WebElementFacade lblhome;
	
	//DETALLES BASICOS
	
	//nombre empresa
	//Label Bienvenida
	@FindBy(id="orgName")
	public WebElementFacade txtNombreEempresa;
	
	//userTimeZone		
	@FindBy(id="userTimeZone")
	public WebElementFacade cmbZonaHoraria;
	
	//idioma
	@FindBy(xpath="//*[@id=\"language\"]")
	public WebElementFacade cmbIdioma;
	
	//Moneda Local
	@FindBy(id="currencyLocale")
	public WebElementFacade cmbMoneda;
	
	//Moneda Local
	@FindBy(id="profileDetailBtn")
	public WebElementFacade btnExplorarZoho;
	

	//Metodos /////////////////////////////
	
	public void Nombre(String DatoPrueba) {
		
		txtNombre.click();	
		txtNombre.sendKeys(DatoPrueba);
	}
	
	public void Email(String DatoPrueba) {
		txtEmail.click();	
		txtEmail.sendKeys(DatoPrueba);
	}
	
	public void Pass(String DatoPrueba) {
		txtPass.click();		
		txtPass.sendKeys(DatoPrueba);
	}
		
	public void Telefono(String DatoPrueba) {
		txtTelefono.click();		
		txtTelefono.sendKeys(DatoPrueba);
	}
	
	public void Pais(String DatoPrueba) {
		cmbPais.click();
		cmbPais.selectByVisibleText(DatoPrueba);
	}
	
	public void checkTerminos() {
		checkTerminos.click();		
	}	

	public void comenzarAhora() {
		btnValidate.click();
	}
	
	public void NombreEmpresa(String DatoPrueba) {
		txtNombreEempresa.click();
		txtNombreEempresa.sendKeys(DatoPrueba);		
	}
	
	public void ZonaHoraria(String DatoPrueba) {
		cmbZonaHoraria.selectByVisibleText(DatoPrueba);
	}

	public void Idioma(String DatoPrueba) {
		cmbIdioma.selectByVisibleText(DatoPrueba);
	}

	public void Moneda(String DatoPrueba) {	
		cmbMoneda.selectByVisibleText(DatoPrueba);		
		
	}
	
	public void Explorar() {
		btnExplorarZoho.click();		
		
	}	
	
	public void VerificaHome() {
		String labelv = "Bienvenido Jhon Edinson asdf";
		String strMensaje = lblhome.getText();
		assertThat(strMensaje, containsString(labelv));
	}

	

	
	
	
		

}
