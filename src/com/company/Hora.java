package com.company;

public class Hora {
    public void setHora(int hora) {

        if (hora < 0) hora = 0;
        if (hora > 23) hora = 23;
        this.hora = hora;
    }

    public void setMin(int min) {
        if (hora < 0) hora = 0;
        if (hora > 59) hora = 59;
        this.min = min;
    }

    public void setSeg(int seg) {
        if (hora < 0) hora = 0;
        if (hora > 59) hora = 59;
        this.seg = seg;
    }

    private int hora;
    private int min;
    private int seg;

    public Hora (int hora,int min,int seg){
        setHora(hora);
        setMin(min);
        setSeg(seg);
    }

    public void mostrarHora (){
        System.out.println("Hora: "+hora+":"+min+":"+seg);
    }

    public Hora avanzar (){


        return this;
    }

}
