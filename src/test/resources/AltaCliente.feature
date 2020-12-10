Feature: Funcionalidad Alta clientes

  Validar que se permita el alta de clientes Persona Fisica

# Scenario Example
  @Login
  Scenario Outline: Alta Clientes Persona Fisica

    Given Ingresa al sistema satisfactoriamente <usuario> And <password>
    When Usuario Ingresa Seccion Clientes
    And usuario Ingresa datos mínimos de captura <lineaNegocio> And <ramo> And <producto> And <rol>
    And usuario captura datos generales <titulo> And <nombre> And <aPaterno> And <aMaterno> And <fecNaci> And <rfc> And <curp> And <genero> And <edoCivil> And <tipoIdent> And <numIdent> And <nss>
    And usuario captura Lugar de nacimiento <paisNaci> And <edoPro> And <ciuPoblacion> And <nacionalidad>
    And usuario captura domicilios <tipoDomic> And <calleAvenida> And <numExt> And <cp> And <colonia> And <municDeleg> And <ciudad> And <estado>
    And usuario ingresa Telefonos <Tipo> And <numTel>
    And usuario ingresa ocupacion <ocupacion> And <claveOcupa> And <detalleOcupa>
    And usuario ingresa percepcion mensual <ingresoMensual>
    And usuario ingresa perfil transaccional <apoNumTranAnual> And <retNumTranAnual> And <apoMonTrnAnual> And <retMonTrnAnual>
    And Usuario ingresa Declaracion de impuestos <funcionesPublicas>
    And Usuario ingresa Aviso de Privacidad

    Then Captura Folio

    #Login
    Examples:
      | usuario  | password  | lineaNegocio       | ramo | producto                        | rol          | titulo | nombre | aPaterno | aMaterno  | fecNaci  | rfc           | curp               | genero    | edoCivil    | tipoIdent          | numIdent | nss   |paisNaci|edoPro|ciuPoblacion|nacionalidad|tipoDomic |calleAvenida|numExt|cp   |colonia	    	     |municDeleg	   |ciudad		     |estado |Tipo |numTel    |ocupacion|claveOcupa|detalleOcupa|ingresoMensual|apoNumTranAnual|retNumTranAnual|apoMonTrnAnual|retMonTrnAnual|funcionesPublicas|
      | N3218862 | N3Gr1T0N0V | INDIVIDUAL PRIVADO | VIDA | OTROS PRODUCTOS VIDA INDIVIDUAL | CONTRATANTE | SR.    | Pablo  | MUNGUIA  | Contreras | 29011984 | PAMU8401293U7 | PAMU840129HHGRRR04 | MASCULINO | SOLTERO (A) | CEDULA PROFESIONAL | 1234556  | 98656 |MEXICO  |CDMX  |CDMX        |MEXICO      |PARTICULAR|Abasolo	   |32	  |43000|HUEJUTLA DE REYES CENTRO|HUEJUTLA DE REYES|HUEJUTLA DE REYES|HIDALGO|MOVIL|5539082232|OTRO     |ABOGADO   |pruebas     |25000         |20             |10             |300           |500           |NO               |