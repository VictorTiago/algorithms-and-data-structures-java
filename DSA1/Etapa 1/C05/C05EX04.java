import javax.swing.JOptionPane;
public class C05EX04 {
    public static void main(String[] args) {
        // Autor: Victor Tiago Avelino Da Silva
        String x1Str, x2Str, y1Str, y2Str;
        double distancia, x1, x2, y1, y2;

        x1Str = JOptionPane.showInputDialog(null,
                "Qual o valor de x1? ",
                "Calculo Distância ",
                JOptionPane.QUESTION_MESSAGE);

        x1 = Double.parseDouble(x1Str);

        x2Str = JOptionPane.showInputDialog(null,
                "Qual o valor de x2? ",
                "Calculo Distância ",
                JOptionPane.QUESTION_MESSAGE);

        x2 = Double.parseDouble(x2Str);

        y1Str = JOptionPane.showInputDialog(null,
                "Qual o valor de y1? ",
                "Calculo Distância ",
                JOptionPane.QUESTION_MESSAGE);

        y1 = Double.parseDouble(y1Str);

        y2Str = JOptionPane.showInputDialog(null,
                "Qual o valor de y2? ",
                "Calculo Distância ",
                JOptionPane.QUESTION_MESSAGE);

        y2 = Double.parseDouble(y2Str);

        distancia = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

        JOptionPane.showMessageDialog(null,
                String.format("Resultado: %.2f", distancia),
                "Cálculo da Distância",
                JOptionPane.INFORMATION_MESSAGE);
    }
}



