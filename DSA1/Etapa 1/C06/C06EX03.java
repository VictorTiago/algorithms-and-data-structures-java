import javax.swing.*;
public class C06EX03 {
    public static void main(String[] args) {
        // Autor: Victor Tiago Avelino Da Silva
        String vendasStr;
        double salarioFixo, vendas, salarioTotal;

        vendasStr = JOptionPane.showInputDialog(null,
                "Informe o valor de vendas mensal: ",
                "Sálario",
                JOptionPane.QUESTION_MESSAGE);

        vendasStr = vendasStr.replace(',', '.');

        vendas = Double.parseDouble(vendasStr);

        salarioFixo = 240;

        if (vendas <= 1000)
            JOptionPane.showMessageDialog(null,
                    "salarío = R$"+salarioFixo,
                    "Cálculo Comissão",
                    JOptionPane.INFORMATION_MESSAGE);
        else if (vendas <= 10000)
            JOptionPane.showMessageDialog(null,
                    "A comissão será de 10% sobre o valor vendido",
                    "Cálculo Comissão",
                    JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(null,
                    "A comissão será de R$1.000,00",
                    "Cálculo Comissão",
                    JOptionPane.INFORMATION_MESSAGE);
    }
}
