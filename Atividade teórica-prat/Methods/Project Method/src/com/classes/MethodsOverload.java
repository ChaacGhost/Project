package com.classes;

public class MethodsOverload {
    private String name;
    //Criação de construtor vazio
    public MethodsOverload(){

    }
    //Criando método <setName> para setar nome
    public void setName(String name){
        this.name = name;
    }
    //Criando método <setName> para setar nome de forma diferente
    public void setName(String name, String lastname){
        this.name = name + " " +lastname;
    }
    //Criando método para retornar o valor de <name>
    public String getName(){
        return name;
    }
}
