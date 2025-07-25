import javax.swing.JOptionPane;
public class C04EX04 {
    public static void main(String[] args) {
        // Autor: Victor Tiago Avelino Da Silva
        String primeiroNome, nomeDoMeio, sobrenome, idade;

        primeiroNome = JOptionPane.showInputDialog(null,
                "Digite seu primeiro nome:",
                "Dados",
                JOptionPane.QUESTION_MESSAGE);
        System.out.println(primeiroNome);

        nomeDoMeio = JOptionPane.showInputDialog(null,
                "Digite seu nome do meio:",
                "Dados",
                JOptionPane.QUESTION_MESSAGE);
        System.out.println(nomeDoMeio);

        sobrenome = JOptionPane.showInputDialog(null,
                "Digite seu sobrenome",
                "Dados",
                JOptionPane.QUESTION_MESSAGE);
        System.out.println(sobrenome);

        idade = JOptionPane.showInputDialog(null,
                "Digite sua idade:",
                "Dados",
                JOptionPane.QUESTION_MESSAGE);
        System.out.println(idade);

        JOptionPane.showMessageDialog(null,
                sobrenome+", "+primeiroNome+" "+nomeDoMeio+"\nIdade: "+idade);
    }
}
