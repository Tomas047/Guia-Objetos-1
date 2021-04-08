package com.company;

public class CuentaBanco {

    private String Nombre, id;
    private double balance;

    public CuentaBanco (String nombre,String id,double balance){

        this.balance = balance;
        this.id = id;
        this.Nombre = nombre;

    }

    public double credito (double cant){
        balance += cant;
        return balance;
    }

    public double debito (double cant){

        if (balance - cant < 0){
            System.out.println("No se puede realizar la operacion, balance insuficiente.");
        }else balance -= cant;

        return balance;
    }

    public void mostrarCuenta (){

        System.out.println("Cuenta[" +
                                    " Dueño: "+ Nombre
                                   +" Id: "+ id
                                   +" balance: $"+balance
                                   +"]");


    }


    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }







}
