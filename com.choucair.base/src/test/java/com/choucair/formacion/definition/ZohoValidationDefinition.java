package com.choucair.formacion.definition;

import java.util.List;

import com.choucair.formacion.pageobjects.ZohoFormNuevaTareaPage;
import com.choucair.formacion.pageobjects.ZohoNuevaTareaPage;
import com.choucair.formacion.steps.ZohoFormNuevaTareaSteps;
import com.choucair.formacion.steps.ZohoFormRegisterSteps;
import com.choucair.formacion.steps.ZohoMenuNuevaTareaSteps;
import com.choucair.formacion.steps.ZohoValidationSteps;
import cucumber.api.DataTable;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;


public class ZohoValidationDefinition {
	
	@Steps
	ZohoValidationSteps zohoValidationSteps;
	
	@Steps
	ZohoFormRegisterSteps zohoFormRegisterSteps;
	
	@Steps
	ZohoMenuNuevaTareaSteps zohoMenuNuevaTareaSteps; 
	
	@Steps
	ZohoFormNuevaTareaSteps zohoFormNuevaTareaSteps; 
	
	@Given("^Ingreso Pagina$")
	public void ingreso_Pagina(){
		zohoValidationSteps.Ingresar();	    
	}
	
	@When("^Diligencio formulario para registro$")
	public void diligencio_formulario_para_registro(DataTable dtDatosRegister) {
		List<List<String>> data = dtDatosRegister.raw();
		
		for (int i = 1; i < data.size(); i++) {			
			zohoFormRegisterSteps.FormularioIngresar(data,i);
			try {
				Thread.sleep(12000);
			} catch (InterruptedException e) {
			}
		}	   
	}

	@Then("^Verifica Acceso a la pagina$")
	public void verifica_Acceso_a_la_pagina(DataTable dtDatosRegister) {
		
		List<List<String>> data = dtDatosRegister.raw();		
		
		zohoFormRegisterSteps.DatosAdicionales(data);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}		
	
		zohoFormRegisterSteps.verificarIngresoDatosFormularioExitoso();	    
	}
	
	
	//Scenario: Creación de Tarea
	
	
	@Given("^Autentico en colorlib  con usuario \"([^\"]*)\" y clave \"([^\"]*)\"$")
	public void autentico_en_colorlib_con_usuario_y_clave(String arg1, String arg2) {
		zohoMenuNuevaTareaSteps.IniciarSesion(arg1,arg2);
		zohoMenuNuevaTareaSteps.MenuNuevaTarea();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}	
	}

	

	@When("^Diligencio formulario para nueva tarea$")
	public void diligencio_formulario_para_nueva_tarea(DataTable dtDatosRegister){
		
		List<List<String>> data = dtDatosRegister.raw();
		
		for (int i = 1; i < data.size(); i++) {			
			zohoFormNuevaTareaSteps.IngresarNuevaTarea(data,i);
		}	
		
	   
	}

	@Then("^Verifica nueva tarea$")
	public void verifica_nueva_tarea(){
	  
	}
	
	
	
	


}
