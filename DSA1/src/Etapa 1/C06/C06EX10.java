import javax.swing.*;
public class C06EX10 {
    public static void main(String[] args) {
        // Autor: Victor Tiago Avelino Da Silva
        String capitalAplicadoStr, numeroDiasStr, taxaDiariaStr;
        double capitalAplicado, taxaDiaria, rendimento, impostoRenda, valorResgatado;
        long numeroDias, taxaDeAdministracao;

        capitalAplicadoStr = JOptionPane.showInputDialog(null,
                "Informe o capital aplicado:",
                "Aula de Java",
                JOptionPane.QUESTION_MESSAGE);

        capitalAplicadoStr = capitalAplicadoStr.replace(",", ".");

        capitalAplicado = Double.parseDouble(capitalAplicadoStr);

        taxaDeAdministracao = 10;

        numeroDiasStr = JOptionPane.showInputDialog(null,
                "Informe o numero de dias: ",
                "Aula de Java",
                JOptionPane.QUESTION_MESSAGE);

        numeroDiasStr = numeroDiasStr.replace(",", ".");

        numeroDias = Long.parseLong(numeroDiasStr);

        taxaDiariaStr = JOptionPane.showInputDialog(null,
                "Informe a taxa diária:",
                "Aula de Java",
                JOptionPane.QUESTION_MESSAGE);

        taxaDiariaStr = taxaDiariaStr.replace(",", ".");

        taxaDiariaStr = taxaDiariaStr.replace("%", "/100");

        taxaDiaria = Double.parseDouble(taxaDiariaStr);

        rendimento = capitalAplicado * (taxaDiaria / 100) * numeroDias;

        impostoRenda = rendimento * 0.15;

        valorResgatado = capitalAplicado + rendimento - impostoRenda - taxaDeAdministracao;

        JOptionPane.showMessageDialog(null,
                "Rendimento: R$" + rendimento + "\nImposto de renda: R$" + impostoRenda + "\nValor a ser resgatado: R$" + valorResgatado,
                "Aula De Java",
                JOptionPane.INFORMATION_MESSAGE);
    }
}