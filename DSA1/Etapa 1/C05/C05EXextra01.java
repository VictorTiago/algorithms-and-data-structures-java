import javax.swing.*;

public class C05EXextra01 {
    public static void main(String[] args) {
        boolean palindromo, palindromoVerificacao;
        String palindromoStr;

        palindromoStr = JOptionPane.showInputDialog(null,
                "Informe um número inteiro de 4 dígitos:",
                "Verificação número palíndromo",
                JOptionPane.QUESTION_MESSAGE);

        palindromo = Boolean.parseBoolean(palindromoStr);

        palindromoVerificacao = palindromo % 10000;

        if (palindromo == palindromoVerificacao)
            JOptionPane.showMessageDialog(null,
                    "O número: " + palindromo + " é palíndromo!",
                    "Verificação número palíndromo",
                    JOptionPane.INFORMATION_MESSAGE);

        else (palindromo != palindromoVerificacao)
            JOptionPane.showMessageDialog(null,
                    "O número: " + palindromo + " não é palindromo",
                    "Verificação de número palíndromo",
                    JOptionPane.INFORMATION_MESSAGE);


    }
}
