package com.classes;

public class ExampleConstructor {
    private String name;
    //Aqui foi criado um construtor vazio, onde não se pede nenhum requisito inicial
    public ExampleConstructor(){

    }
    //Aqui foi criado um construtor que necessita de um parâmetro <String name> para ser instânciado
    public ExampleConstructor(String name){
        this.name = name;
    }
    //Aqui foi criado um método <setName>, para a variável <name> ser implementado com o uso do método vazio
    public void setName(String name){
        this.name = name;
    }
    //Aqui foi criado um método <getName>, que retorna um valor <String> contido na variável name;
    public String getName(){
        return name;
    }
}
