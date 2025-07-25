import javax.swing.*;
public class C06EX04 {
    public static void main(String[] args) {
        // Autor: Victor Tiago Avelino Da Silva
        String nome, alturaStr, pesoStr;
        double altura, peso, imc;

        nome = JOptionPane.showInputDialog(null,
                "Informe seu nome: ",
                "IMC",
                JOptionPane.QUESTION_MESSAGE);

        alturaStr = JOptionPane.showInputDialog(null,
                "Informe sua altura em metros: ",
                "IMC",
                JOptionPane.QUESTION_MESSAGE);

        alturaStr = alturaStr.replace(',', '.');

        altura = Double.parseDouble(alturaStr);

        pesoStr = JOptionPane.showInputDialog(null,
                "Informe seu peso: ",
                "IMC",
                JOptionPane.QUESTION_MESSAGE);

        pesoStr = pesoStr.replace(',', '.');

        peso = Double.parseDouble(pesoStr);

        imc = peso / Math.pow(altura, 2);

        if (imc < 18)
            JOptionPane.showMessageDialog(null,
                    nome + " está desnutrido(a)",
                    "IMC",
                    JOptionPane.INFORMATION_MESSAGE);
        else if (imc < 20)
            JOptionPane.showMessageDialog(null,
                    nome + " está abaixo do peso",
                    "IMC",
                    JOptionPane.INFORMATION_MESSAGE);
        else if (imc >= 20 && imc <= 25)
            JOptionPane.showMessageDialog(null,
                    nome + " está no peso ideal",
                    "IMC",
                    JOptionPane.INFORMATION_MESSAGE);
        else if (imc > 25)
            JOptionPane.showMessageDialog(null,
                    nome + " está acima do peso",
                    "IMC",
                    JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(null,
                    nome + " está obeso(a)",
                    "IMC",
                    JOptionPane.INFORMATION_MESSAGE);

    }
}