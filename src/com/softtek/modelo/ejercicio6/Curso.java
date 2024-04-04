package com.softtek.modelo.ejercicio6;

import java.util.ArrayList;
import java.util.Scanner;

public class Curso {
    private String nombreCompleto;
    private float[] notas;

    public Curso(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
        this.notas = new float[5];
    }

    public Curso() {
    }


    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public float[] getNotas() {
        return notas;
    }

    public void setNotas(float[] notas) {
        this.notas = notas;
    }

    public void agregarNotas(){
        Scanner sc = new Scanner(System.in);
        for (int i = 0;i<=notas.length-1;i++){
            System.out.println("Nota " + (i+1)+ "?");
            notas[i] = sc.nextFloat();
        }
    }


    public float media(){
        float suma = 0;
        for (int i = 0;i<=notas.length-1;i++){
            suma = suma + notas[i];
        }

        suma = suma / notas.length;
        return suma;

    }
    public String mostrarnotas(){
        String texto ="";
        for (int i = 0;i<=notas.length-1;i++){
            texto = texto + "Nota "  + i + ": "+ notas[i] + "\n";
        }
        return texto;

    }
}
