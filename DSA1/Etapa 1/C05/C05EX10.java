import javax.swing.JOptionPane;
public class C05EX10 {
    public static void main(String[] args) {
        long numero, d1, d2, d3, d4, d5;
        String numeroStr;

        numeroStr = JOptionPane.showInputDialog(null,
                "Informe um número inteiro:",
                "Número inteiro",
                JOptionPane.QUESTION_MESSAGE);

        numero = Long.parseLong(numeroStr);

        d1 = numero / 10000;

        d2 = numero / 1000 % 10;

        d3 = numero / 100 % 10;

        d4 = numero / 10 % 10;

        d5 = numero % 10;

        JOptionPane.showMessageDialog(null,
                "Número impresso:\n"+d1+"\n"+d2+"\n"+d3+"\n"+d4+"\n"+d5,
                "Número inteiro",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
