package com.softtek.presentacion.ejemplosteoria;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int numero = 0;
        numero = numero +1;
        System.out.println(numero);
        numero=+1;
        System.out.println(numero);
        numero++;
        System.out.println(numero);

        int resultado;
        numero = 6;
        resultado = ++numero;
        System.out.println("Resultado con pre-incremento-->" + resultado);
        System.out.println(numero);
        numero = 6;
        resultado = numero++;
        System.out.println("Resultado con post-incremento ->" + resultado);
        System.out.println(numero);

        //Indique la opcion correcta para que x = 6 , y = 5 , z = 6:
        // a) x=6; y=++x; z=y-- b)x=6; y=++x; z=--y
        // c)x=5; y=x++;z=y-- d) x=5;y=++x;z=y--
        //opcion correcta d)



    }
}
