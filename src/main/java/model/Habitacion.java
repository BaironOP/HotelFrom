/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Usuario
 */
public class Habitacion {
    
    private int nHabitacion;
    private TipoHabitacion tipoHabitacion;

    public Habitacion() {
    }

    public Habitacion(int nHabitacion, TipoHabitacion tipoHabitacion) {
        this.nHabitacion = nHabitacion;
        this.tipoHabitacion = tipoHabitacion;
    }

    public int getnHabitacion() {
        return nHabitacion;
    }

    public void setnHabitacion(int nHabitacion) {
        this.nHabitacion = nHabitacion;
    }

    public TipoHabitacion getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(TipoHabitacion tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }
    
    
    
}
