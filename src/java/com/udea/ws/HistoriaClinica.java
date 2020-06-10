/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.ws;

import com.udea.model.Historia;
import java.util.Date;
import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author user
 */
@WebService(serviceName = "HistoriaClinica")
public class HistoriaClinica {

    Historia historia;

    /**
     * Web service operation
     */
    @WebMethod(operationName = "registrar")
    @Oneway
    public void registrar(@WebParam(name = "cedula") int cedula, @WebParam(name = "nombre_paciente") String nombre_paciente, @WebParam(name = "nombre_medico") String nombre_medico, @WebParam(name = "fecha") Date fecha) {
        
        historia.setId(cedula);
        historia.setNombre_medico(nombre_medico);
        historia.setNombre_paciente(nombre_paciente);
        historia.setFecha(fecha);
    
    }


}
