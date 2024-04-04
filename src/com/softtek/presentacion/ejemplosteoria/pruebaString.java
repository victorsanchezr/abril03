package com.softtek.presentacion.ejemplosteoria;

import java.util.Locale;

public class pruebaString {
    public static void main(String[] args) {
        /*
        Crear la cadena de texto: “Nunca mates una mosca sobre la cabeza de un tigre.”
        • Mostrar la cadena toda en mayúsculas
        • Mostrar la cadena en minúsculas
        • Mostrar solo la palabra Nunca
        • Mostrar solo la palabra mosca
        • Mostrar la palabra cabeza
        • Mostrar la posición de la letra primera m
        • Devolver la longitud de la cadena
         */

        String frase = "Nunca mates una mosca sobre la cabeza de un tigre.";
        String[] aux;

        //mayusulas

        System.out.println(frase.toUpperCase());
        //minusculas
        System.out.println(frase.toLowerCase());
        //solo nunca
        aux = frase.split(" ");
        System.out.println(aux[0]);
        //solo mosca
        System.out.println(aux[3]);
        //solo cabeza
        System.out.println(aux[6]);
        // posición de la letra primera m
        System.out.println(frase.indexOf("m"));
        // longitud de la cadena
        System.out.println(frase.length());
    }
}
