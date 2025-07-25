import javax.swing.JOptionPane;
public class C05EX07 {
    public static void main(String[] args) {
        // Autor: Victor Tiago Avelino Da Silva
        String xStr;
        double funcao, x;

        xStr = JOptionPane.showInputDialog(null,
                "Qual o valor de X?",
                "Valor de X",
                JOptionPane.QUESTION_MESSAGE);

        x = Double.parseDouble(xStr);

        funcao = Math.sqrt(Math.pow((x / 4.0 + 1), 2) + (1.0 / 5) * x);

        JOptionPane.showMessageDialog(null,
                "O valor da f(x) é: "+funcao,
                "Valor Função",
                JOptionPane.INFORMATION_MESSAGE);
    }
}

