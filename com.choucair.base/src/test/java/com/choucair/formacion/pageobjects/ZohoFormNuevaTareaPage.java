package com.choucair.formacion.pageobjects;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


public class ZohoFormNuevaTareaPage extends PageObject{
	
	//Titular de la Tarea
	
	//Asunto
		
	@FindBy(id="Crm_Tasks_SUBJECT")
	public WebElementFacade txtAsunto;
	
	//Fecha vencimiento
	@FindBy(xpath="//*[@id=\"Crm_Tasks_DUEDATE\"]")
	public WebElementFacade txtFecha;	
	
	@FindBy(xpath="//*[@id=\"Crm_Tasks_DUEDATE\"]")
	public WebElementFacade txtFecha1;		
	
	//Contacto
	@FindBy(id="Crm_Tasks_CONTACTID")
	public WebElementFacade txtContacto;
	

	@FindBy(id="Crm_Tasks_CONTACTID_WhoId_select")
	public WebElementFacade cmbContacto;	
	
	//cuenta 
	@FindBy(id="Crm_Tasks_SEID")
	public WebElementFacade txtCuenta;	
	
	@FindBy(xpath="//*[@id=\"Crm_Tasks_SEID_label_select\"]")
	public WebElementFacade cmbCuenta;
	
	//estado 
	@FindBy(xpath="//*[@id=\"Crm_Tasks_STATUS\"]")
	public WebElementFacade cmbEstado;
	
	@FindBy(id="Tasks_fldRow_STATUS	")
	public WebElementFacade lblEstado;
	
	
	//prioridad
	@FindBy(id="Crm_Tasks_PRIORITY")
	public WebElementFacade cmbPrioridad;	
	
	//enviar mensaje
	@FindBy(id="Crm_Tasks_SENDNOTIFICATION")
	public WebElementFacade CkBSendEmail;	
	
	
	//recordatorio
	//enviar mensaje
	@FindBy(id="Crm_Tasks_REMINDAT")
	public WebElementFacade CkBRecordatorio;	

	
	//repetir
	//enviar mensaje
	@FindBy(id="Crm_Tasks_RECURRING")
	public WebElementFacade CkBRepetir;	

	
	//Descipcion
	//cuenta 
	@FindBy(id="Crm_Tasks_DESCRIPTION")
	public WebElementFacade txtDescripcion;
	
	
	//Label Tarea creada
	@FindBy(xpath="//*[@id=\"show-uName\"]")
	public WebElementFacade lblhome;
	
	//boton validate
	@FindBy(id="saveTasksBtn_Bottom")
	public WebElementFacade btnGuardar;
	
	
	//dic prioridad
	@FindBy(id="secDiv_Task_Information")
	public WebElementFacade divPrioridad;
		
	
	
	
	public void Asunto(String DatoPrueba) {			
		txtAsunto.click();	
		txtAsunto.sendKeys(DatoPrueba);
	}
	
	public void FechaVencimiento(String DatoPrueba) {
		txtFecha.sendKeys(DatoPrueba);
	}
	
	public void cmbContacto(String data) {
		cmbContacto.selectByVisibleText(data);
		
	}
	
	public void cmbCuenta(String data) {
		cmbCuenta.selectByVisibleText(data);
		
	}
	
	public void Contacto(String DatoPrueba) {
		
		txtContacto.sendKeys(DatoPrueba);	}
	
	public void Cuenta(String DatoPrueba) {
		txtCuenta.sendKeys(DatoPrueba);
	}
	
	public void Estado(String DatoPrueba) {
		
		cmbEstado.selectByValue(DatoPrueba);
	}
	
	public void Prioridad(String DatoPrueba) {
		
		System.out.println(DatoPrueba);
		
		
		cmbPrioridad.selectByVisibleText(DatoPrueba);
	} 
	
	
	public void SendEmail(String DatoPrueba) {
		System.out.println(DatoPrueba);
		if(DatoPrueba.equals("si")) {
			System.out.println("sisi");
			CkBSendEmail.click();
			System.out.println("no");
		}			
		
	}
	
	public void Recordatorio(String DatoPrueba) {	
		if(DatoPrueba.equals("si")) {
			CkBRecordatorio.click();	
		}
	}
	
	public void Repetir(String DatoPrueba) {		
		if(DatoPrueba.equals("si")) {
			CkBRepetir.click();		
		}
	}
	
	
	public void Descripcion(String DatoPrueba) {
		txtDescripcion.sendKeys(DatoPrueba);
	}
	
	
	public void Guardar() {
		btnGuardar.click();
		
	}

	public void verificarNuevaTarea() {
		String labelv = "Bienvenido Jhon Edinson asdf";
		String strMensaje = lblhome.getText();
		assertThat(strMensaje, containsString(labelv));
		
	}
	
	
	
	
	
	

}
