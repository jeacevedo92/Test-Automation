package com.choucair.formacion.pageobjects;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

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
	
	
	//estado -------------
	@FindBy(xpath="//*[@id=\"select2-Crm_Tasks_STATUS-container\"]/span")
	public WebElementFacade divEstado;
	
	//estado 
	@FindBy(id="Crm_Tasks_STATUS")
	public WebElementFacade cmbEstado;
	
	
	
	@FindBy(id="Tasks_fldRow_STATUS	")
	public WebElementFacade lblEstado;
	
	
	
	
	//prioridad -------------
	@FindBy(xpath="//*[@id=\"select2-Crm_Tasks_PRIORITY-container\"]/span")
	public WebElementFacade divPrioridad;
		
	//estado 
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
	
	
	//espacio en  blanco
	@FindBy(id="secDiv_Task_Information")
	public WebElementFacade EspacioBlanco;
	
	
	
	///////////////////////////////////////
	
	//Recordatorio
		
	
	//fecha inicio
	@FindBy(id="Crm_Tasks_RemindAt_Start_Date1")
	public WebElementFacade txtFechaInicio;
	
	
	//hora
	
	@FindBy(xpath="//*[@id=\"Crm_Tasks_RemindAt_Start_Date1_TimeOption\"]")
	public WebElementFacade txtHora;
	
	
	//tipo 
	@FindBy(id="Crm_Tasks_RemindAt_period")
	public WebElementFacade cmbTipo;
	
	@FindBy(xpath="//*[@id=\"select2-Crm_Tasks_RemindAt_period-container\"]/span")
	public WebElementFacade cmbDivTipo;
	
	
	//Notificar
	@FindBy(xpath="//*[@id=\"Tasks_fldRow_RemindAt_Notify\"]/div[2]/label[2]/span[1]")
	public WebElementFacade ckbNotificar;
	
	
	
	//Repetir---------------------
	//a TIEMPO
	@FindBy(id="Crm_Tasks_remTime")
	public WebElementFacade cmbAtiempo;
	
	
	@FindBy(xpath="//*[@id=\"select2-Crm_Tasks_remTime-container\"]/span")
	public WebElementFacade cmbDivAtiempo;
	
	
	//antes de 
	@FindBy(id="Crm_Tasks_remTime_TimeOption")
	public WebElementFacade txtAnteDe;
	
	//Fecha inicio	
	@FindBy(id="Crm_Tasks_Recurring_Start_Date1")
	public WebElementFacade txtFechaRep;
	
	
	//Fecha final	
	@FindBy(id="Crm_Tasks_Recurring_End_Date1")
	public WebElementFacade txtFinRep;
	
	//Tipo repetecion
	@FindBy(id="Crm_Tasks_Recurring_period")
	public WebElementFacade cmbTipoRep;
	
	@FindBy(xpath="//*[@id=\"select2-Crm_Tasks_Recurring_period-container\"]/span")
	public WebElementFacade cmbDivTipoRep;
	
	
	
	
	
	
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
		
		EspacioBlanco.click();
		divEstado.click();
		Select Estado = new Select(cmbEstado);
		Estado.selectByValue(DatoPrueba);
		
		EspacioBlanco.click();
		
	}
	
	public void Prioridad(String DatoPrueba) {
		
		EspacioBlanco.click();
		divPrioridad.click();
		Select Prioridad = new Select(cmbPrioridad);
		Prioridad.selectByValue(DatoPrueba);
		
		EspacioBlanco.click();
	} 
	
	
	public void SendEmail(String DatoPrueba) {
		
		if(DatoPrueba.equals("si")) {
			
			WebDriver driver = this.getDriver();
            WebElement input = driver.findElement(By.id("Crm_Tasks_SENDNOTIFICATION"));
            new Actions(driver).moveToElement(input).click().perform();              

		}			
		
	}
	
	public void Recordatorio(String DatoPrueba,String FechaInicio,String Hora,String Tipo,String notificar) {	
		if(DatoPrueba.equals("si")) {
			
			WebDriver driver = this.getDriver();
            WebElement input = driver.findElement(By.id("Crm_Tasks_REMINDAT"));
            new Actions(driver).moveToElement(input).click().perform();
            
            
            //recordatorio;
            FechaIni(FechaInicio);
            Hora(Hora);
            Tipo(Tipo);
            Notificar(notificar);
            
		}
	}
	
	private void Notificar(String notificar) {
		if (notificar.equals("Ventana")) {
			ckbNotificar.click();
		}
		
		
	}

	private void Tipo(String tipo) {
		cmbDivTipo.click();
		cmbTipo.selectByVisibleText(tipo);
		//EspacioBlanco.click();
		
	}

	private void Hora(String hora) {
		txtHora.sendKeys(hora);
		
		
	}

	private void FechaIni(String fechaInicio) {
		txtFechaInicio.sendKeys(fechaInicio);
		
	}

	public void Repetir(String DatoPrueba,String Atiempo,String AntesDe,String FechaInicio,String FechaFin,String TipoRep) {		
		if(DatoPrueba.equals("si")) {
			
			WebDriver driver = this.getDriver();
            WebElement input = driver.findElement(By.id("Crm_Tasks_RECURRING"));
            new Actions(driver).moveToElement(input).click().perform(); 
            
            Atiempo(Atiempo);
            AntesDe(AntesDe);
            FechaInicio(FechaInicio);
            FechaFin(FechaFin);
            TipoRep(TipoRep);
		}
	}
	
	
	private void TipoRep(String TipoRep) {
		cmbDivTipoRep.click();
		cmbTipoRep.selectByVisibleText(TipoRep);
		
	}

	private void FechaFin(String FechaFin) {
		txtFinRep.sendKeys(FechaFin);
	}

	private void FechaInicio(String FechaInicio) {
		txtFechaRep.sendKeys(FechaInicio);
		
	}

	private void AntesDe(String AntesDe) {
		txtAnteDe.sendKeys(AntesDe);
	}

	private void Atiempo(String Atiempo) {
		cmbDivAtiempo.click();
		cmbAtiempo.selectByVisibleText(Atiempo);
		
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
