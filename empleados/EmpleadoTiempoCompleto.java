/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empleados;

/**
 *
 * @author eduar
 */
public class EmpleadoTiempoCompleto extends Empleados{
    
    //Creamos un constructor Default.
    public EmpleadoTiempoCompleto() {
    }

    public EmpleadoTiempoCompleto(int ID, String nombre, double salario) {
        super(22, "Eduardo M", 1800);
    }
    
    //Aquí se calculará el salario del empleado.
    @Override
    public double calcularSalario() {
        return getSalario();
    }
    
}
