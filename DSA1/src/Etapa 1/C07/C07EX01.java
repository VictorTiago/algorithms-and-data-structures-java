import javax.swing.*;
public class C07EX01 {
    public static void main(String[] args) {
        // Autor: Victor Tiago Avelino Da Silva
        String quantidadeAcertosStr, nomeApostador;
        int quantidadeAcertos;

        nomeApostador = JOptionPane.showInputDialog(null,
                "Informe o nome do apostador: ",
                "Aula de Java",
                JOptionPane.QUESTION_MESSAGE);

        quantidadeAcertosStr = JOptionPane.showInputDialog(null,
                "Informe a quantidade de acertos do apostador: ",
                "Aula de Java",
                JOptionPane.QUESTION_MESSAGE);

        quantidadeAcertos = Integer.parseInt(quantidadeAcertosStr);

        switch (quantidadeAcertos) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                JOptionPane.showMessageDialog(null,
                        "Não obteve prêmio",
                        "Aula de Java",
                        JOptionPane.INFORMATION_MESSAGE);
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                JOptionPane.showMessageDialog(null,
                        "Prêmio = outro cartão",
                        "Aula de Java",
                        JOptionPane.INFORMATION_MESSAGE);
                break;
            case 11:
                JOptionPane.showMessageDialog(null,
                        "Prêmio = R$100,00",
                        "Aula de Java",
                        JOptionPane.INFORMATION_MESSAGE);
                break;
            case 12:
                JOptionPane.showMessageDialog(null,
                        "Prêmio = R$1.000,00",
                        "Aula de Java",
                        JOptionPane.INFORMATION_MESSAGE);
                break;
            case 13:
                JOptionPane.showMessageDialog(null,
                        "Prêmio = R$50.000,00",
                        "Aula de Java",
                        JOptionPane.INFORMATION_MESSAGE);
                break;
            default:
                JOptionPane.showMessageDialog(null,
                        "Número inválido",
                        "Aula de Java",
                        JOptionPane.ERROR_MESSAGE);
                break;
        }
    }
}
