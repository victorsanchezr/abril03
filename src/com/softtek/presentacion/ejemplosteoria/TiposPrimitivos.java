package com.softtek.presentacion.ejemplosteoria;

public class TiposPrimitivos {
    public static void main(String[] args) {
        byte numeroPequeno;
        numeroPequeno = 5;
        System.out.println(numeroPequeno);
        numeroPequeno = 10;
        short numeroEntero = 350;
        System.out.println(numeroEntero);
        int numero = 56_350; //la barra baja hace de punto para separar miles
        System.out.println(numero);
        long numeroLargo = 56_000_000L;
        System.out.println(numeroLargo);
        float numeroDecimales = 1_123.45F;
        System.out.println(numeroDecimales);
        double numeroDecimalesGrande = 11_235_897.098;
        System.out.println(numeroDecimalesGrande);
        char letra = 'a';
        System.out.println("----------------------");
        System.out.println("Ejercicio1");
        areacuadrado();
        System.out.println("Ejercicio2");
        circulo();
        System.out.println("Ejercicio3");
        perimetro();

    }

    public static void areacuadrado() {
        int lado = 6;
        int area = 0;
        area = lado * lado;
        System.out.println(area);

    }

    public static void circulo() {
        final float PI = 3.14f;
        int radio = 3;
        float area = 0f;
        area = PI * (radio * radio);
        System.out.println(area);


    }

    public static void perimetro() {
        int perimetro = 0;
        int base = 4;
        int base2 = 3;

        perimetro = (2 * base) + (2 * base2);
        System.out.println(perimetro);


    }
}


