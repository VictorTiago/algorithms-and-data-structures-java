import javax.swing.*;
public class C06EX05 {
    public static void main(String[] args) {
        // Autor: Victor Tiago Avelino Da Silva
        String numeroStr;
        int numero, resto5, resto7, resultadoDivisivel;

        numeroStr = JOptionPane.showInputDialog(null,
                "Informe um número inteiro:",
                "Aula de Java",
                JOptionPane.QUESTION_MESSAGE);

        numero = Integer.parseInt(numeroStr);

        resto5 = numero % 5;

        resto7 = numero % 7;

        resultadoDivisivel = 0;

        if (resto5 == resultadoDivisivel && resto7 == resultadoDivisivel)
            JOptionPane.showMessageDialog(null,
                    numero + " é divisível simultaneamente por 5 e 7",
                    "Aula de Java",
                    JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(null,
                    numero + " não é divisível simultaneamente por 5 e 7",
                    "Aula de Java",
                    JOptionPane.INFORMATION_MESSAGE);
    }
}
