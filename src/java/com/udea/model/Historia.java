
package com.udea.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "historiaclinica")
public class Historia {
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column (nullable = false)
    private String nombre_paciente;
    @Column(nullable = false)
    private String nombre_medico;
    @Column
    private Date fecha;

    public int getId() {
        return id;
    }

    public String getNombre_paciente() {
        return nombre_paciente;
    }

    public String getNombre_medico() {
        return nombre_medico;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre_paciente(String nombre_paciente) {
        this.nombre_paciente = nombre_paciente;
    }

    public void setNombre_medico(String nombre_medico) {
        this.nombre_medico = nombre_medico;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
}
