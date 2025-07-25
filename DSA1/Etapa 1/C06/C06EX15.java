import javax.swing.*;
public class C06EX15 {
    public static void main(String[] args) {
        // Autor: Victor Tiago Avelino Da Silva
        String codigoStr, quantidadeDiasStr, servicosExtrasStr, cidade;
        double servicosExtras;
        long quantidadeDias, codigo, valorFixo, diariasPPP;

        codigoStr = JOptionPane.showInputDialog(null,
                "Informe o código",
                "Aula de Java",
                JOptionPane.QUESTION_MESSAGE);

        codigo = Long.parseLong(codigoStr);

        quantidadeDiasStr = JOptionPane.showInputDialog(null,
                "Informe a quantidade de dias de consumo dos canais",
                "Aula de Java",
                JOptionPane.QUESTION_MESSAGE);

        quantidadeDias = Long.parseLong(quantidadeDiasStr);

        servicosExtrasStr = JOptionPane.showInputDialog(null,
                "Informe o valor dos serviços extras",
                "Aula de Java",
                JOptionPane.QUESTION_MESSAGE);

        servicosExtras = Double.parseDouble(servicosExtrasStr);

        cidade = JOptionPane.showInputDialog(null,
                "Informe sua cidade",
                "Aula de Java",
                JOptionPane.QUESTION_MESSAGE);

        contaBasic = valorFixo + diariasPPP + servicosExtras + imposto
