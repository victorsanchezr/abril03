package com.softtek.modelo.Ejercicio7;

import java.util.Random;

public class Dado {
    private int numeroAleatorio;
    private Random numeroGenerado = new Random();


    public Dado() {
    }


    public String numero1() {
        return "*";
    }

    public String numero2() {
        return "* *";
    }

    public String numero3() {
        return "* * *";
    }

    public String numero4() {
        return "* *\n* *";
    }

    public String numero5() {
        return "* *\n * \n* *";
    }

    public String numero6() {
        return "* * *\n* * *\n* * *";
    }

    public String tirar() {
        numeroAleatorio = numeroGenerado.nextInt(6)+1;
        if (numeroAleatorio == 1) {
            return numero1();
        } else if (numeroAleatorio == 2) {
            return numero2();
        } else if (numeroAleatorio == 3) {
            return numero3();
        } else if (numeroAleatorio == 4) {
            return numero4();
        } else if (numeroAleatorio == 5) {
            return numero5();
        } else  {
            return numero6();
        }

    }

}
