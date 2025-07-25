import javax.swing.*;
public class C06EX06 {
    public static void main(String[] args) {
        // Autor: Victor Tiago Avelino Da Silva
        String aStr, bStr, cStr;
        int a, b, c;
        double raizes1, raizes2, delta;

        aStr = JOptionPane.showInputDialog(null,
                "Informe o valor de A: ",
                "Aula de Java",
                JOptionPane.QUESTION_MESSAGE);

        a = Integer.parseInt(aStr);

        bStr = JOptionPane.showInputDialog(null,
                "Informe o valor de B:",
                "Aula de Java",
                JOptionPane.QUESTION_MESSAGE);

        b = Integer.parseInt(bStr);

        cStr = JOptionPane.showInputDialog(null,
                "Informe o valor de C:",
                "Aula de Java",
                JOptionPane.QUESTION_MESSAGE);

        c = Integer.parseInt(cStr);

        delta = Math.pow(b, 2) - 4 * a * c;

        raizes1 = (-b + Math.sqrt(delta)) / (2 * a);

        raizes2 = (-b - Math.sqrt(delta)) / (2 * a);

        if (delta > 0)
            JOptionPane.showMessageDialog(null,
                    "resultado raiz 1 = " +raizes1+ "\nresultado raiz 2 = "+raizes2,
                    "Aula de Java",
                    JOptionPane.INFORMATION_MESSAGE);

        else if (delta == 0)
            JOptionPane.showMessageDialog(null,
                    "resultado = " +raizes1,
                    "Aula de Java",
                    JOptionPane.INFORMATION_MESSAGE);

        else
            JOptionPane.showMessageDialog(null,
                    "resultado = não tem raÍzes",
                    "Aula de Java",
                    JOptionPane.INFORMATION_MESSAGE);


    }
}