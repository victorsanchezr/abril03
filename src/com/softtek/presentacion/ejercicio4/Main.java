package com.softtek.presentacion.ejercicio4;

import com.softtek.modelo.ejercicio4.Campos;

public class Main {
    public static void main(String[] args) {
        Campos campo = new Campos(10);
        System.out.println(campo.muestra());
        campo.incrementa();
        System.out.println(campo.muestra());


    }

}
