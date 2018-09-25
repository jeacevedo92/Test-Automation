package com.choucair.formacion.steps;

import java.util.List;

import com.choucair.formacion.pageobjects.ZohoFormNuevaTareaPage;
import com.choucair.formacion.pageobjects.ZohoRegisterValidationPage;

import net.thucydides.core.annotations.Step;

public class ZohoFormNuevaTareaSteps {
	
	
	ZohoFormNuevaTareaPage zohoFormNuevaTareaPage;
	
	@Step
	public void IngresarNuevaTarea(List<List<String>> data,int id) throws InterruptedException {
		zohoFormNuevaTareaPage.Asunto(data.get(id).get(0).trim());
		zohoFormNuevaTareaPage.FechaVencimiento(data.get(id).get(1).trim());	
		zohoFormNuevaTareaPage.cmbContacto(data.get(id).get(2).trim());
		zohoFormNuevaTareaPage.Contacto(data.get(id).get(3).trim());
		zohoFormNuevaTareaPage.cmbCuenta(data.get(id).get(4).trim());
		zohoFormNuevaTareaPage.Cuenta(data.get(id).get(5).trim());
		zohoFormNuevaTareaPage.Estado(data.get(id).get(6).trim());
		zohoFormNuevaTareaPage.Prioridad(data.get(id).get(7).trim());		
		zohoFormNuevaTareaPage.SendEmail(data.get(id).get(8).trim());
		zohoFormNuevaTareaPage.Recordatorio(data.get(id).get(9).trim(),data.get(id).get(10).trim(),data.get(id).get(11).trim(),data.get(id).get(12).trim(),data.get(id).get(13).trim());		
		zohoFormNuevaTareaPage.Repetir(data.get(id).get(14).trim(),data.get(id).get(15).trim(),data.get(id).get(16).trim(),data.get(id).get(17).trim(),data.get(id).get(18).trim(),data.get(id).get(19).trim());		
		zohoFormNuevaTareaPage.Descripcion(data.get(id).get(20).trim());
		//zohoFormNuevaTareaPage.Guardar();
		//zohoFormNuevaTareaPage.verificarNuevaTarea();
		
	}
	

}
