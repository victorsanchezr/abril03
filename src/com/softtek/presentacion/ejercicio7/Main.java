package com.softtek.presentacion.ejercicio7;

import com.softtek.modelo.Ejercicio7.Dado;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dado dados = new Dado();
        Scanner sc = new Scanner(System.in);
        String seguir = "s";
        do {
            System.out.println(dados.tirar());

            System.out.println("Quieres seguir s/n");
            seguir = sc.nextLine();
        }while (!Objects.equals(seguir, "n"));

    }
}
