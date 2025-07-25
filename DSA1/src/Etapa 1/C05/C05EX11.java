import javax.swing.JOptionPane;
public class C05EX11 {
    public static void main(String[] args) {
        String numeroChequeStr;
        long numeroCheque, banco, agencia, sequencial;

        numeroChequeStr = JOptionPane.showInputDialog(null,
                "Informe o número do cheque:",
                "Número cheque",
                JOptionPane.QUESTION_MESSAGE);

        numeroCheque = Long.parseLong(numeroChequeStr);

        banco = numeroCheque / 1000000;

        agencia = numeroCheque / 10 % 1000;

        sequencial = numeroCheque % 1000;

        JOptionPane.showMessageDialog(null,
                "Informações cheque: \nBanco = " + banco + ", Agência = " + agencia + ", Sequencial = " + sequencial,
                "Informações do cheque",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
