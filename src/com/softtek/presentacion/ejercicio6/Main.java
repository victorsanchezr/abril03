package com.softtek.presentacion.ejercicio6;

import com.softtek.modelo.ejercicio6.Curso;

public class Main {
    public static void main(String[] args) {
        Curso cursos = new Curso("Victor Sanchez");

        cursos.agregarNotas();
        System.out.println(cursos.media());
        System.out.println(cursos.mostrarnotas());
    }

}
