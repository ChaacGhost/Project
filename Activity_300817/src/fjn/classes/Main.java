package fjn.classes;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        Purchase p;
        String kindPerson, typePurchase;
        double value, plots;
        kindPerson = JOptionPane.showInputDialog("Informe: \nPessoa Jurídica-(J)\nPessoa Física-(F)");
        typePurchase = JOptionPane.showInputDialog("Informe: \nPagamento à vista-(PA)\nPagamento parcelado(PP)");
        if (kindPerson.equalsIgnoreCase("F")) {
            p = new Physical();
            p.setValue(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da compra:")));
            if (typePurchase.equalsIgnoreCase("PA")) {
                p.calculatePA(p.getValue());
                JOptionPane.showMessageDialog(null, "O valor é: " + p.getValue());
            } else if (typePurchase.equalsIgnoreCase("PP")) {
                p.setPlots(Double.parseDouble(JOptionPane.showInputDialog("Informe o número de parcelas:")));
                p.calculatePP(p.getValue(), p.getPlots());
                JOptionPane.showMessageDialog(null, p.getPlots() + "x de: " + p.portion() + "\n" +
                        "O valor total é: " + p.getValue());
            }
        }
        else if(kindPerson.equalsIgnoreCase("J")){
            p = new Legal();
            p.setValue(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da compra:")));
            if (typePurchase.equalsIgnoreCase("PA")) {
                p.calculatePA(p.getValue());
                JOptionPane.showMessageDialog(null, "O valor é: " + p.getValue());
            } else if (typePurchase.equalsIgnoreCase("PP")) {
                p.setPlots(Double.parseDouble(JOptionPane.showInputDialog("Informe o número de parcelas:")));
                p.calculatePP(p.getValue(), p.getPlots());
                JOptionPane.showMessageDialog(null, p.getPlots() + "x de: " + p.portion() + "\n" +
                        "O valor total é: " + p.getValue());
            }
        }
    }
}

