package com.softtek.modelo;

public class Producto {

    private int idProducto;

    private String nombre;

    private int cantidadExistencia;

    public Producto(int idProducto, String nombre, int cantidadExistencia) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.cantidadExistencia = cantidadExistencia;
    }

    public Producto() {
    }




    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadExistencia() {
        return cantidadExistencia;
    }

    public void setCantidadExistencia(int cantidadExistencia) {
        this.cantidadExistencia = cantidadExistencia;
    }






    public void comprarProducto(int cantidad){
        if (cantidad >=0){
            cantidadExistencia = cantidadExistencia +cantidad;
        }

    }

    public void ventaProducto(int cantidad){
        if (cantidad <= cantidadExistencia){
            cantidadExistencia = cantidadExistencia -cantidad;
        }

    }

    @Override
    public String toString() {
        return "Producto{" +
                "idProducto=" + idProducto +
                ", nombre='" + nombre + '\'' +
                ", cantidadExistencia=" + cantidadExistencia +
                '}';
    }
}
