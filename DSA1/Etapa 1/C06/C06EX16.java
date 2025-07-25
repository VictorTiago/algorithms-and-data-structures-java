import javax.swing.*;
public class C06EX15 {
    public static void main(String[] args) {
        // Autor: Victor Tiago Avelino Da Silva
        String faltasStr, nota1Str, nota2Str, nota3Str, notaTrabalhoStr, idadeStr;
        int faltas, idade;
        double nota1, nota2, nota3, notaTrabalho;

        faltasStr = JOptionPane.showInputDialog(null,
                "Informe o número de faltas",
                "Aula de Java",
                JOptionPane.QUESTION_MESSAGE);

        faltas = Integer.parseInt(faltasStr);

        nota1Str = JOptionPane.showInputDialog(null,
                "Informe a nota 1",
                "Aula de Java",
                JOptionPane.QUESTION_MESSAGE);

        nota1Str = nota1Str.replace(",", ".");

        nota1 = Double.parseDouble(nota1Str);

        nota2Str = JOptionPane.showInputDialog(null,
                "Informe a nota 2",
                "Aula de Java",
                JOptionPane.QUESTION_MESSAGE);

        nota2Str = nota2Str.replace(",", ".");

        nota2 = Double.parseDouble(nota2Str);
