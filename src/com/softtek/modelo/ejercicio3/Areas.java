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

    public void areaCResultado(float radio){
        areaCirculo = PI * (radio*radio);


    }

    public void areaRResultado(float largo,float ancho){

        areaRectangulo = largo*ancho;

    }

    @Override
    public String toString() {
        return "Areas" +
                "areaCirculo=" + areaCirculo +
                "\nareaRectangulo=" + areaRectangulo;
    }
}
