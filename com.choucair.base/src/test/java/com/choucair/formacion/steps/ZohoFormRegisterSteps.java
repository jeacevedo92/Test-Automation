package com.choucair.formacion.steps;

import java.util.List;

import net.thucydides.core.annotations.Step;
import com.choucair.formacion.pageobjects.ZohoRegisterValidationPage;



public class ZohoFormRegisterSteps {
	
	ZohoRegisterValidationPage zohoRegisterValidationPage;
	
	@Step
	public void FormularioIngresar(List<List<String>> data,int id) {

		zohoRegisterValidationPage.Nombre(data.get(id).get(0).trim());
		zohoRegisterValidationPage.Email(data.get(id).get(1).trim());
		zohoRegisterValidationPage.Pass(data.get(id).get(2).trim());
		zohoRegisterValidationPage.Telefono(data.get(id).get(3).trim());
		zohoRegisterValidationPage.Pais(data.get(id).get(4).trim());
		zohoRegisterValidationPage.checkTerminos();
		zohoRegisterValidationPage.comenzarAhora();
		
	}
	
	@Step
	public void verificarIngresoDatosFormularioExitoso() {
		zohoRegisterValidationPage.VerificaHome();
	}
	
	@Step
	public void DatosAdicionales(List<List<String>> data) {
		
		System.out.println(data.get(1));
		
		
		zohoRegisterValidationPage.NombreEmpresa(data.get(1).get(0).trim());
		zohoRegisterValidationPage.ZonaHoraria(data.get(1).get(1).trim());
		zohoRegisterValidationPage.Idioma(data.get(1).get(2).trim());
		zohoRegisterValidationPage.Moneda(data.get(1).get(3).trim());
		zohoRegisterValidationPage.Explorar();
	}
	

}
