import javax.swing.JOptionPane;
public class C05EX03 {
    public static void main(String[] args) {
        // Autor: Victor Tiago Avelino Da Silva
        double salario, liquido, impostoDeRenda;
        String salarioStr, numeroDependentesStr;
        int numeroDependentes;

        salarioStr = JOptionPane.showInputDialog(null,
                "Informe o salário: ",
                "Salário",
                JOptionPane.QUESTION_MESSAGE);

        salario = Double.parseDouble(salarioStr);

        numeroDependentesStr = JOptionPane.showInputDialog(null,
                "Informe o número de dependentes: ",
                "Cálculo Imposto de Renda",
                JOptionPane.QUESTION_MESSAGE);

        numeroDependentes = Integer.parseInt(numeroDependentesStr);

        liquido = salario - (numeroDependentes * 60);
        impostoDeRenda = liquido * 15 / 100;

        JOptionPane.showMessageDialog(null,
                "valor do imposto de renda: R$" + impostoDeRenda,
                "Área e volume esfera",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
