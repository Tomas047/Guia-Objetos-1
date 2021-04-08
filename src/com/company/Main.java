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



        Empleado a = new Empleado();

        a.setEmpleado("Carlos","Gutierréz","23456345",25000);

        Empleado b = new Empleado();

        b.setEmpleado("Ana","Sanchez","34234123",27500);

        a.mostrarEmpleado();
        b.mostrarEmpleado();

        a.aumento(15);
        System.out.println("El salario anual de "+ a.getNombre() + " es de $" + a.salarioAnual());

 */

        ItemDeVenta x = new ItemDeVenta();

        x.setID("000000001");
        x.setDescripcion("Taquitos de Pollo MAROLIO");
        x.setCant(2);
        x.setpUnitario(50.5);

        x.mostrarItem();

        System.out.println("El precio total de " + x.getCant() + " " + x.getDescripcion() + " es de $" + x.calcularTotal());

    }
}
