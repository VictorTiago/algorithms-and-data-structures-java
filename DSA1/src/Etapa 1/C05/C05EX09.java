import javax.swing.JOptionPane;
public class C05EX09 {
    public static void main(String[] args) {
        String nota1Str, nota2Str, nota3Str;
        double nota1, nota2, nota3, media;

        nota1Str = JOptionPane.showInputDialog(null,
                "Qual foi a nota 1? ",
                "Nota 1",
                JOptionPane.QUESTION_MESSAGE);

        nota1 = Double.parseDouble(nota1Str);

        nota2Str = JOptionPane.showInputDialog(null,
                "Qual foi a nota 2?",
                "Nota 2",
                JOptionPane.QUESTION_MESSAGE);

        nota2 = Double.parseDouble(nota2Str);

        nota3Str = JOptionPane.showInputDialog(null,
                 "Qual foi a nota 3?",
                  "Nota 3",
                  JOptionPane.QUESTION_MESSAGE);

        nota3 = Double.parseDouble(nota3Str);

        media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;

        JOptionPane.showMessageDialog(null,
                "A média final do aluno é: "+media,
                "Valor Média",
                JOptionPane.INFORMATION_MESSAGE);
    }
}