package com.choucair.formacion.steps;

import java.util.List;

import com.choucair.formacion.pageobjects.ZohoFormNuevaTareaPage;
import com.choucair.formacion.pageobjects.ZohoRegisterValidationPage;

import net.thucydides.core.annotations.Step;

public class ZohoFormNuevaTareaSteps {
	
	
	ZohoFormNuevaTareaPage zohoFormNuevaTareaPage;
	
	@Step
	public void IngresarNuevaTarea(List<List<String>> data,int id) {
		zohoFormNuevaTareaPage.Asunto(data.get(id).get(0).trim());
		//zohoFormNuevaTareaPage.FechaVencimiento(data.get(id).get(1).trim());	
		zohoFormNuevaTareaPage.cmbContacto(data.get(id).get(2).trim());
		zohoFormNuevaTareaPage.Contacto(data.get(id).get(3).trim());
		zohoFormNuevaTareaPage.cmbCuenta(data.get(id).get(4).trim());
		zohoFormNuevaTareaPage.Cuenta(data.get(id).get(5).trim());
		//zohoFormNuevaTareaPage.Estado(data.get(id).get(6).trim());
		//zohoFormNuevaTareaPage.Prioridad(data.get(id).get(7).trim());		
		zohoFormNuevaTareaPage.SendEmail(data.get(id).get(8).trim());
		zohoFormNuevaTareaPage.Recordatorio(data.get(id).get(9).trim());
		zohoFormNuevaTareaPage.Repetir(data.get(id).get(10).trim());
		zohoFormNuevaTareaPage.Descripcion(data.get(id).get(11).trim());
		zohoFormNuevaTareaPage.Guardar();
		//zohoFormNuevaTareaPage.verificarNuevaTarea();
		
	}
	

}
