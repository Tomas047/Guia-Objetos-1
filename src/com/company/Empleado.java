package com.company;

public class Empleado {

    private String DNI, nombre, apellido;
    private double salario;

    public Empleado(){
        salario = -1;
    }

    public void mostrarEmpleado (){
        if (salario >= 0){
            System.out.println("Empleado[dni=" + DNI + " ,nombre=" + nombre+ " ,apellido=" + apellido + " ,salario="+ salario+"]");
        }else System.out.println("No hay info del empleado");
    }

    public double salarioAnual (){
        return salario*12;
    }

    public void aumento (float porcentaje){

        double cantidad = (salario*porcentaje) / 100;

        salario += cantidad;

    }

    public String getDNI() {
        return DNI;
    }
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setEmpleado (String n, String a, String DNI, double salario){

        setNombre(n);
        setApellido(a);
        setDNI(DNI);
        setSalario(salario);

    }

}
