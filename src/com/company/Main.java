package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
/*
        Rectangulo x = new Rectangulo();

        x.setAlto(3.2);
        x.setAncho(3.2);

        System.out.println(x.Area());
        System.out.println("sup, brah");

 */

        Empleado a = new Empleado();

        a.setEmpleado("Carlos","Gutierréz","23456345",25000);

        Empleado b = new Empleado();

        b.setEmpleado("Ana","Sanchez","34234123",27500);

        a.mostrarEmpleado();
        b.mostrarEmpleado();

        a.aumento(15);
        System.out.println("El salario anual de "+ a.getNombre() + " es de $" + a.salarioAnual());

    }
}
