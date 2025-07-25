import javax.swing.*;
public class C07EX04 {
    public static void main(String[] args) {
        // Victor Tiago Avelino Da Silva
        String equipe;

        equipe = JOptionPane.showInputDialog(null,
                "Informe a equipe de futebol",
                "Aula de Java",
                JOptionPane.QUESTION_MESSAGE);

        switch (equipe) {
            case "América":
            case "Cruzeiro":
            case "Atlético":
            case "Villa Nova":
                JOptionPane.showMessageDialog(null,
                        "Estado: Minas Gerais",
                        "Aula de Java",
                        JOptionPane.INFORMATION_MESSAGE);
                break;
            case "Botafogo":
            case "Flamengo":
            case "Fluminense":
            case "Vasco":
                JOptionPane.showMessageDialog(null,
                        "Estado: Rio de Janeiro",
                        "Aula de Java",
                        JOptionPane.INFORMATION_MESSAGE);
                break;
            case "Corinthians":
            case "Palmeiras":
            case "Santos":
            case "São Paulo":
                JOptionPane.showMessageDialog(null,
                        "Estado: São Paulo",
                        "Aula de Java",
                        JOptionPane.INFORMATION_MESSAGE);
                break;
            case "Grêmio":
            case "Internacional":
            case "Juventude":
                JOptionPane.showMessageDialog(null,
                        "Estado: Rio Grande do Sul",
                        "Aula de Java",
                        JOptionPane.INFORMATION_MESSAGE);
                break;
            case "Náutico":
            case "Santa Cruz":
            case "Sport":
                JOptionPane.showMessageDialog(null,
                        "Estado: Pernambuco",
                        "Aula de Java",
                        JOptionPane.INFORMATION_MESSAGE);
                break;
            default:
                JOptionPane.showMessageDialog(null,
                        "Equipe inválida",
                        "Aula de Java",
                        JOptionPane.ERROR_MESSAGE);
                break;
        }
    }
}

