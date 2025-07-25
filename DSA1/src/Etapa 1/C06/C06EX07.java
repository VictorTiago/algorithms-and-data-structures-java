import javax.swing.*;
public class C06EX07 {
    public static void main(String[] args) {
        // Autor: Victor Tiago Avelino Da Silva
        String salarioStr, plLiquido;
        double salario, valorFixo, percentualSalario, plBruto, impostoRenda, plLiquidoNaoFormatado;

        salarioStr = JOptionPane.showInputDialog(null,
                "Informe o salário do empregado: ",
                "Aula de Java",
                JOptionPane.QUESTION_MESSAGE);

        salarioStr = salarioStr.replace(',', '.');

        salario = Double.parseDouble(salarioStr);

        if (salario <= 300.00)
            valorFixo = 500.00;

        else
            if (salario <= 1000.00)
                valorFixo = 200.00;

        else
            valorFixo = 0;


        if (salario <= 300.00)
            percentualSalario = 0.70;
        else
            if (salario <= 1000.00)
                percentualSalario = 0.50;
        else
            percentualSalario = 0.30;

        plBruto = valorFixo + (salario * percentualSalario);

        impostoRenda = plBruto * 0.25;

        plLiquidoNaoFormatado = plBruto - impostoRenda;

        plLiquido = String.format("%6.2f",plLiquidoNaoFormatado);


        JOptionPane.showMessageDialog(null,
                "o PL Líquido é de: R$" + plLiquido,
                "Aula de Java",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
