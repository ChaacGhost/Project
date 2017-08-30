package com.classes;

public class Main {
    public static void main(String[] args){
        //Aqui, um exemplo de como instanciar a classe e mostrar o valor da variável apresentada com o construtor vazio.
        ExampleConstructor constructor1 = new ExampleConstructor();
        constructor1.setName("José");
        System.out.println(constructor1.getName());

        /*Aqui, um exemplo de como instanciar a classe e mostrar o valor da variável
        apresentada com o construtor que necessita de parâmetro
         */
        ExampleConstructor constructor2 = new ExampleConstructor("Alysson");
        System.out.println(constructor2.getName());
    }
}
