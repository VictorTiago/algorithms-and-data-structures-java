import javax.swing.JOptionPane;
public class C05EX02 {
    public static void main(String[] args) {
        // Autor: Victor Tiago Avelino Da Silva
        double valorR, area, volume;
        String rStr;

        rStr = JOptionPane.showInputDialog(null,
                "Qual o valor do raio? ",
                "Área e volume esfera ",
                JOptionPane.QUESTION_MESSAGE);

        valorR = Double.parseDouble(rStr);

        area = 4 * 3.1416 * Math.pow(valorR, 2);

        volume = (4.0 / 3) * 3.1416 * Math.pow(valorR, 3);

        JOptionPane.showMessageDialog(null,
                "Área: " + area + "\nVolume; " + volume,
                "Área e volume esfera",
                JOptionPane.INFORMATION_MESSAGE);
    }
}