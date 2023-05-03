/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.empleados;

/**
 *
 * @author eduar
 */
public abstract class Empleados {
    
    public static void main(String[] args) {
        EmpleadoTiempoCompleto empleado1 = new EmpleadoTiempoCompleto();
        empleado1.calcularSalario();
    }
    
    //Definimos los datos que queremos obtener de cada empleado.
    private int ID;
    private String nombre;
    private double salario;
    
    //Creamos el método constructor.
    public Empleados() {
    }

    public Empleados(int ID, String nombre, double salario) {
        this.ID = ID;
        this.nombre = nombre;
        this.salario = salario;
    }

    //Creamos métodos getter y setter para cada uno de los datos que solicitamos.
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    //Aquí se definió el método abstracto para calcular el salario de cada empleado.
    public abstract double calcularSalario();
        
    
    
    
    

    
}
