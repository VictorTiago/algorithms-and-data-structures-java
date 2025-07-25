import javax.swing.*;
public class C06EX01 {
    public static void main(String[] args) {
        // Autor: Victor Tiago Avelino Da Silva
        String xStr;
        double x, fx;

        xStr = JOptionPane.showInputDialog(null,
                "Informe o valor de X: ",
                "Cálculo de fução",
                JOptionPane.QUESTION_MESSAGE);

        x = Double.parseDouble(xStr);

        if (x < 4)
            fx = (5 * x + 3) / (Math.sqrt(16 - Math.pow(x, 2)));
        else
            if (x == 4)
                fx = 0;
            else
                fx = (5 * x + 3) / (Math.sqrt(Math.pow(x, 2) - 16));
            JOptionPane.showMessageDialog(null,
                    "Função = "+fx,
                    "Cálculo de função",
                    JOptionPane.INFORMATION_MESSAGE);
    }
}