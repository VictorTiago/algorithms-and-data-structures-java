import javax.swing.*;
public class C06EX14 {
    public static void main(String[] args) {
        // Autor: Victor Tiago Avelino Da Silva
        String numeroStr;
        int numero, n1, n2, n3, n4;

        numeroStr = JOptionPane.showInputDialog(null,
                "Informe um número inteiro de 4 digítos",
                "Aula de Java",
                JOptionPane.QUESTION_MESSAGE);

        numero = Integer.parseInt(numeroStr);

        if (numero > 9999) {
            JOptionPane.showMessageDialog(null,
                    "Número precisa ter 4 DIGÍTOS",
                    "Aula de Java",
                    JOptionPane.ERROR_MESSAGE);
        }
        n1 = numero % 10;
        n2 = numero / 10 % 10;
        n3 = numero / 100 % 10;
        n4 = numero / 1000;

        JOptionPane.showMessageDialog(null,
                "Número invertido = " +n1+n2+n3+n4,
                "Aula de Java",
                JOptionPane.INFORMATION_MESSAGE);
    }
}