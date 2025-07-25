import javax.swing.*;
public class C06EX12 {
    public static void main(String[] args) {
        // Autor: Victor Tiago Avelino Da Silva
        String bolasFabricadasStr, bolasDefeitoStr, unitarioCaixasStr, mesesCopaStr, valorAluguelStr;
        double valorAluguel, unitarioCaixa, custoTotal, quantidadeGalpao, custoEstoque, custoEmbalagem, caixasNecessarias;
        long bolasFabricadas, bolasDefeito, bolasArmazenadas;
        int mesesCopa;

        bolasFabricadasStr = JOptionPane.showInputDialog(null,
                "Informe a quantidade de bolas fabricadas",
                "Aula de Java",
                JOptionPane.QUESTION_MESSAGE);

        bolasFabricadas = Long.parseLong(bolasFabricadasStr);

        bolasDefeitoStr = JOptionPane.showInputDialog(null,
                "Informe a quantidade de bolas com defeito",
                "Aula de Java",
                JOptionPane.QUESTION_MESSAGE);

        bolasDefeito = Long.parseLong(bolasDefeitoStr);

        unitarioCaixasStr = JOptionPane.showInputDialog(null,
                "Informe o valor unitário da caixa de papelão",
                "Aula de Java",
                JOptionPane.QUESTION_MESSAGE);

        unitarioCaixasStr = unitarioCaixasStr.replace(",",".");

        unitarioCaixa = Double.parseDouble(unitarioCaixasStr);

        mesesCopaStr = JOptionPane.showInputDialog(null,
                "Informe a quantidade de meses para a copa",
                "Aula de Java",
                JOptionPane.QUESTION_MESSAGE);

        mesesCopa = Integer.parseInt(mesesCopaStr);

        valorAluguelStr = JOptionPane.showInputDialog(null,
                "Informe o valor do aluguel",
                "Aula de Java",
                JOptionPane.QUESTION_MESSAGE);

        valorAluguel = Double.parseDouble(valorAluguelStr);

        bolasArmazenadas = (bolasFabricadas - bolasDefeito) / 10;

        quantidadeGalpao = bolasArmazenadas / 850; // 5 % 2 =1

        custoEmbalagem = bolasArmazenadas * unitarioCaixa;

        custoEstoque = quantidadeGalpao * valorAluguel;

        custoTotal = custoEmbalagem + custoEstoque;

        JOptionPane.showMessageDialog(null,
                "Custo total: R$"+custoTotal,
                "Aula de Java",
                JOptionPane.INFORMATION_MESSAGE);
    }
}




