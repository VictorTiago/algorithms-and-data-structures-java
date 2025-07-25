import javax.swing.JOptionPane;
public class C05EX01 {
    public static void main(String[] args) {
        // Autor: Victor Tiago Avelino Da Silva
        double valorX, funcao;
        String xString;

        xString = JOptionPane.showInputDialog(null,
                "Qual o valor de X? ",
                "Valor De X: ",
                JOptionPane.QUESTION_MESSAGE);

        valorX = Double.parseDouble(xString);

        System.out.println(valorX);

        funcao = Math.pow(valorX,3)+(4*valorX)+10;

        System.out.println("Valor de X = "+funcao);

        JOptionPane.showMessageDialog(null,
        "O resultado da função é "+funcao,
                "Função",
                JOptionPane.INFORMATION_MESSAGE);

    }
}