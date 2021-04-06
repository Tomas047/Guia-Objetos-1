package com.company;

public class Rectangulo {

    Rectangulo (double alt, double anc){
        alto = alt;
        ancho = anc;
    }
    Rectangulo() { this(1.0,1.0);}

public
    double getAlto() {
        return alto;
    }
    void setAlto(double alto) {
        this.alto = alto;
    }

    double getAncho() {
        return ancho;
    }
    void setAncho(double ancho) {
        this.ancho = ancho;
    }

    double Area (){
        return alto*ancho;
    }

    double Perimetro (){
        return (alto*2) + (ancho*2);
    }

    private double alto, ancho;

}
