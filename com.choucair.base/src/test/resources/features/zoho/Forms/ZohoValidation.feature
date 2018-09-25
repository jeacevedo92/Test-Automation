#Author: your.email@your.domain.com
@Regresion
Feature: Trabajar con el CRM Zoho
	El usuario debe ingresar usuario y contraseña
	Se realizan las validaciones necesarias
	se valida si se ingresa correctamente	

@RegistroExitoso
Scenario: Registro
  	Se validan todos los campos requeridos
  	Se registra mostrar error alguno
	    Given Ingreso Pagina	   
	    When Diligencio formulario para registro
	    |NombreCompleto      |Correo           |Contraseña         |Telefono   |Pais    |
	    |Jhon Edinson asdf   |fsdffdfbsiu@gmail.com|Utp3154439086* |3154439086 |Colombia|
	    Then Verifica Acceso a la pagina
	    |NombreEmpresa|ZonaHoraria                                   |Idioma |MonedaLocal|    
	    |Choucair     |(GMT -5:0 ) Hora de Colombia( America/Bogota )|español|Colombia|
	    
@NuevaTarea
	Scenario: Creación de Tarea
  	Se ingresa a la creacion de una nueva tarea
  	Se ingresan los datos requeridos
  	Se validan los datos
  	Se valida la  nueva tarea creada
	    Given Autentico en colorlib  con usuario "jeacevedo92@gmail.com" y clave "Utp3154439086*"
	    When Diligencio formulario para nueva tarea
	    |Asunto      |FechaVencimiento |cmbContacto|Contacto |cmbCuenta|Cuenta     |Estado    |Prioridad|EnviarMensaje|Recordatorio|FechaInicio|Hora    |Tipo |notificar|Repetir|Atiempo|AntesDe |FechaInicio|FechaFin  |TipoRep|Descripcion           |
	    |Reunion     |11/09/2018       |Contacto   |Juanito  |Trato    |tratoo     |Completado|Bajo     |si           |si          |26/09/2018 |08:00 AM|Anual|Ventana  |si     |4 días |08:05 AM|27/09/2018 |30/09/2018|Anual  |Reunion Automatizacion|
	    Then Verifica nueva tarea


    
    
    
    
    