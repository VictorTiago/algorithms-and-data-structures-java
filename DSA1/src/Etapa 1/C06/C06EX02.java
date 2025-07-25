import javax.swing.*;
public class C06EX02 {
    public static void main(String[] args) {
        // Autor: Victor Tiago Avelino Da Silva
        String quantidadePoluentesStr;
        double quantidadePoluentes, quantidadePoluentesMulta;

        quantidadePoluentesStr = JOptionPane.showInputDialog(null,
                "Informe a quantidade de poluentes emitidos: ",
                "Multa x Poluentes",
                JOptionPane.QUESTION_MESSAGE);

        quantidadePoluentes = Double.parseDouble(quantidadePoluentesStr);

        quantidadePoluentesMulta = quantidadePoluentes * 5000;

        if (quantidadePoluentes <= 1500)
            JOptionPane.showMessageDialog(null,
                    "Está isento da multa",
                    "Multa",
                    JOptionPane.INFORMATION_MESSAGE);
        else
            if (quantidadePoluentes <= 3500)
            JOptionPane.showMessageDialog(null,
                    "O valor da multa é R$3.000,00",
                    "Multa",
                    JOptionPane.INFORMATION_MESSAGE);
            else
                JOptionPane.showMessageDialog(null,
                        "O valor da multa é: R$" + quantidadePoluentesMulta,
                        "Multa",
                        JOptionPane.INFORMATION_MESSAGE);

    }
}