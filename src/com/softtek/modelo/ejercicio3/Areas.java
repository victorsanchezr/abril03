package com.softtek.modelo.ejercicio3;

public class Areas {

    private final float PI = 3.14f;
    private float areaCirculo;
    private float areaRectangulo;

    public Areas(float areaCirculo, float areaRectangulo) {
        this.areaCirculo = areaCirculo;
        this.areaRectangulo = areaRectangulo;
    }

    public Areas() {
    }

    public float getAreaCirculo() {
        return areaCirculo;
    }

    public void setAreaCirculo(float areaCirculo) {
        this.areaCirculo = areaCirculo;
    }

    public float getAreaRectangulo() {
        return areaRectangulo;
    }

    public void setAreaRectangulo(float areaRectangulo) {
        this.areaRectangulo = areaRectangulo;
    }

    public float areaCResultado(float radio){
        areaCirculo = PI * (radio*radio);
       return areaCirculo;


    }

    public float areaRResultado(float largo,float ancho){

        areaRectangulo = largo*ancho;
        return areaRectangulo;

    }

    @Override
    public String toString() {
        return "Areas{" +
                "areaCirculo=" + areaCirculo +
                ", areaRectangulo=" + areaRectangulo +
                '}';
    }
}
