import javax.swing.*;
public class C07EX03 {
    public static void main(String[] args) {
        // Victor Tiago Avelino Da Silva
        String valorImpostoStr, diasAtrasoStr;
        double valorImposto;
        int diasAtraso;

        valorImpostoStr = JOptionPane.showInputDialog(null,
                "Informe o valor do imposto",
                "Aula de Java",
                JOptionPane.QUESTION_MESSAGE);

        valorImposto = Double.parseDouble(valorImpostoStr);

        diasAtrasoStr = JOptionPane.showInputDialog(null,
                "Informe os dias de atraso",
                "Aula de Java",
                JOptionPane.QUESTION_MESSAGE);

        diasAtraso = Integer.parseInt(diasAtrasoStr);

        switch (diasAtraso) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                JOptionPane.showMessageDialog(null,
                        "Multa isenta",
                        "Aula de Java",
                        JOptionPane.INFORMATION_MESSAGE);
                break;
            case 6:
            case 7:
            case 8:
                JOptionPane.showMessageDialog(null,
                        "Multa de: " + valorImposto * 0.20,
                        "Aula de Java",
                        JOptionPane.INFORMATION_MESSAGE);
                break;
            case 9:
            case 10:
                JOptionPane.showMessageDialog(null,
                        "Multa de: "+((diasAtraso * 0.005 + 0.1) * valorImposto),
                        "Aula de Java",
                        JOptionPane.INFORMATION_MESSAGE);
                break;
            default:
                JOptionPane.showMessageDialog(null,
                        "Multa de: " + (diasAtraso * 1 + 150),
                        "Aula de Java",
                        JOptionPane.INFORMATION_MESSAGE);
                break;
        }
    }
}

