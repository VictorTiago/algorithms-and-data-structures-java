import javax.swing.*;
public class C07EX02 {
    public static void main(String[] args) {
        // Victor Tiago Avelino Da Silva
        String nota1Str, nota2Str, nota3Str;
        int nota1, nota2, nota3, conceito;
        double notaFinal;

        nota1Str = JOptionPane.showInputDialog(null,
                "Informe a nota 1:",
                "Aula de Java",
                JOptionPane.QUESTION_MESSAGE);

        nota1 = Integer.parseInt(nota1Str);

        nota2Str = JOptionPane.showInputDialog(null,
                "Informe a nota 2:",
                "Aula de Java",
                JOptionPane.QUESTION_MESSAGE);

        nota2 = Integer.parseInt(nota2Str);

        nota3Str = JOptionPane.showInputDialog(null,
                "Informe a nota 3:",
                "Aula de Java",
                JOptionPane.QUESTION_MESSAGE);

        nota3 = Integer.parseInt(nota3Str);

        notaFinal = (nota1 + nota2 + nota3) / 3.0;

        conceito = (int) Math.round(notaFinal);

        switch (conceito) {
            case 9:
            case 10:
                JOptionPane.showMessageDialog(null,
                        "Conceito: A",
                        "Aula de Java",
                        JOptionPane.INFORMATION_MESSAGE);
                break;
            case 8:
                JOptionPane.showMessageDialog(null,
                        "Conceito: B",
                        "Aula de Java",
                        JOptionPane.INFORMATION_MESSAGE);
                break;
            case 7:
                JOptionPane.showMessageDialog(null,
                        "Conceito: C",
                        "Aula de Java",
                        JOptionPane.INFORMATION_MESSAGE);
                break;
            case 5:
            case 6:
                JOptionPane.showMessageDialog(null,
                        "Conceito: D",
                        "Aula de Java",
                        JOptionPane.INFORMATION_MESSAGE);
                break;
            case 1:
            case 2:
            case 3:
            case 4:
                JOptionPane.showMessageDialog(null,
                        "Conceito: E",
                        "Aula de Java",
                        JOptionPane.INFORMATION_MESSAGE);
                break;
            default:
                JOptionPane.showMessageDialog(null,
                        "Nota Inválida",
                        "Aula de Java",
                        JOptionPane.ERROR_MESSAGE);
        }
    }
}
