import javax.swing.JOptionPane;
public class C05EX08 {
    public static void main(String[] args) {
        // Autor: Victor Tiago Avelino Da Silva
        String sStr, anguloStr;
        double s, angulo, raio;

        sStr = JOptionPane.showInputDialog(null,
                "Qual o valor de S?",
                "Valor do setor circular",
                JOptionPane.QUESTION_MESSAGE);

        s = Double.parseDouble(sStr);

        anguloStr = JOptionPane.showInputDialog(null,
                "Qual o valor do ângulo?",
                "Valor do ângulo",
                JOptionPane.QUESTION_MESSAGE);

        angulo = Double.parseDouble(anguloStr);

        raio = Math.sqrt((s * 360) / (angulo * 3.1416));

        JOptionPane.showMessageDialog(null,
                "O valor do raio é: "+raio,
                "Valor raio",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
