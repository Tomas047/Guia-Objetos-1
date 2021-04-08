package com.company;

public class ItemDeVenta {

    private String ID, descripcion;
    private double pUnitario;
    private int cant;

    public ItemDeVenta (){
        pUnitario = 0;
        cant = 0;

    }

    public double calcularTotal (){

        if (cant < 0) cant = 0;

        return cant * pUnitario;
    }

    public void mostrarItem (){

        System.out.println("ItemVenta [id= "+ID
                         + " ,descripcion= "+descripcion
                         + " ,precio unitario= "+ pUnitario
                         + " ,cantidad"+cant
                         + " ,precio total = " +calcularTotal());

    }


    public String getID() {
        return ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getpUnitario() {
        return pUnitario;
    }
    public void setpUnitario(double pUnitario) {
        this.pUnitario = pUnitario;
    }

    public int getCant() {
        return cant;
    }
    public void setCant(int cant) {
        this.cant = cant;
    }

}
