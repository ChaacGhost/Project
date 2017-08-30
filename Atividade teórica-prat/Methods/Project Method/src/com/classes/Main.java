package com.classes;

public class Main {
    public static void main(String[] args){
        // instânciando objeto da classe
        MethodsOverload m = new MethodsOverload();
        //usando um método para setar o nome
        m.setName("Alysson");
        System.out.println(m.getName());
        //usando um método de mesmo nome para setar um nome com 2 Strings
        m.setName("Alysson", "José");
        System.out.println(m.getName());
    }
}
