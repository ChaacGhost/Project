package com.classes;
//Criação de classe abstrata
public abstract class HeritageAndPoly {
    private double area;
    //Criação de construtor vazio
    public HeritageAndPoly(){

    }
    /*Criando método abstrato para calcular área,
    para calcular áreas de diferentes figuras geométricas
     */
    public abstract void calculateArea(double x, double y);
    //Criação de método para mostrar a área
    public double getArea(){
        return area;
    }
}
