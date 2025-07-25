import javax.swing.JOptionPane;
public class C05EX06 {
    public static void main(String[] args) {
        // Autor: Victor Tiago Avelino Da Silva
        String aStr, bStr, cStr, xStr, yStr;
        double a, b, c, x, y, r, calculoDistancia, distancia;

        aStr = JOptionPane.showInputDialog(null,
                "Qual o valor de A?",
                "Valor de A",
                JOptionPane.QUESTION_MESSAGE);

        a =Double.parseDouble(aStr);

        bStr = JOptionPane.showInputDialog(null,
                "Qual o valor de B?",
                "Valor de B",
                JOptionPane.QUESTION_MESSAGE);

        b = Double.parseDouble(bStr);

        cStr= JOptionPane.showInputDialog(null,
                "Qual o valor de C?",
                "Valor de C",
                JOptionPane.QUESTION_MESSAGE);

        c = Double.parseDouble(cStr);

        xStr= JOptionPane.showInputDialog(null,
                "Qual o valor da coordenada X?",
                "Valor de X",
                JOptionPane.QUESTION_MESSAGE);

        x = Double.parseDouble(xStr);

        yStr= JOptionPane.showInputDialog(null,
                "Qual o valor da coordenada Y?",
                "Valor de Y",
                JOptionPane.QUESTION_MESSAGE);

        y = Double.parseDouble(yStr);

        r = a*x + b*y + c;

        calculoDistancia = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        distancia = r / calculoDistancia;

        JOptionPane.showMessageDialog(null,
                "A distância do ponto x e y é: "+distancia,
                "Calculo Distância",
                JOptionPane.INFORMATION_MESSAGE);
    }
}