package com.softtek.modelo.numero5;

public class Tablas {

    private int numeroTabla;

    public Tablas(int numeroTabla) {
        this.numeroTabla = numeroTabla;
    }

    public int getNumeroTabla() {
        return numeroTabla;
    }

    public void setNumeroTabla(int numeroTabla) {
        this.numeroTabla = numeroTabla;
    }

    public String tabla(){
        String texto = "";
        for (int i = 0;i<=10;i++){
            texto = texto + numeroTabla +"x" + i +"="+ (i*numeroTabla) + "\n" ;
        }
        return texto;

    }
}
