package com.classes;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        //Declaração de classe abstrata
        HeritageAndPoly h;
        double base, height;
        String op = JOptionPane.showInputDialog("Informe uma figura para calcular área:" +
                "\nTriângulo(T)\nRetângulo(R)");
        if(op.equalsIgnoreCase("T")){
            //Instânciando a classe triângulo
            h = new Triangle();
            base = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da base: "));
            height = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da altura: "));
            h.calculateArea(base,height);
            JOptionPane.showMessageDialog(null, h.getArea());
        }else if(op.equalsIgnoreCase("R")){
            //Instânciando a classe retângulo
            h = new Rectangle();
            base = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da base: "));
            height = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da altura: "));
            h.calculateArea(base,height);
            JOptionPane.showMessageDialog(null, h.getArea());
        }
    }
}
