/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author SERGIO
 */
public class Localidad {
    	private long idLocalidad;
        private String nombre;
        private String nom_departamento;
	private int id_provincia;

    /**
     * @return the idLocalidad
     */
    public long getIdLocalidad() {
        return idLocalidad;
    }

    /**
     * @param idLocalidad the idLocalidad to set
     */
    public void setIdLocalidad(long idLocalidad) {
        this.idLocalidad = idLocalidad;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the nom_departamento
     */
    public String getNom_departamento() {
        return nom_departamento;
    }

    /**
     * @param nom_departamento the nom_departamento to set
     */
    public void setNom_departamento(String nom_departamento) {
        this.nom_departamento = nom_departamento;
    }

    /**
     * @return the id_provincia
     */
    public int getId_provincia() {
        return id_provincia;
    }

    /**
     * @param id_provincia the id_provincia to set
     */
    public void setId_provincia(int id_provincia) {
        this.id_provincia = id_provincia;
    }

    @Override
    public String toString() {
        return nombre + " - " + nom_departamento;
    }
       
    
    
    
    
}
