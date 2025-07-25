import javax.swing.*;
public class C06EX11 {
    public static void main(String[] args) {
        // Autor: Victor Tiago Avelino Da Silva
        String setsEquipe1Str, setsEquipe2Str, nomeEquipe1, nomeEquipe2;
        long setsEquipe1, setsEquipe2, pontosEquipe1, pontosEquipe2;

        nomeEquipe1 = JOptionPane.showInputDialog(null,
                "Informe o nome da equipe 1: ",
                "Aula de Java",
                JOptionPane.QUESTION_MESSAGE);

        nomeEquipe2 = JOptionPane.showInputDialog(null,
                "Informe o nome equipe 2: ",
                "Aula de Java",
                JOptionPane.QUESTION_MESSAGE);

        setsEquipe1Str = JOptionPane.showInputDialog(null,
                "Quantos sets a equipe 1 ganhou:",
                "Aula de Java",
                JOptionPane.QUESTION_MESSAGE);

        setsEquipe1 = Long.parseLong(setsEquipe1Str);

        setsEquipe2Str = JOptionPane.showInputDialog(null,
                "Quantos sets a equipe 2 ganhou:",
                "Aula de Java",
                JOptionPane.QUESTION_MESSAGE);

        setsEquipe2 = Long.parseLong(setsEquipe2Str);

        if (setsEquipe1 == 3 && setsEquipe2 <= 1) {
            pontosEquipe1 = 3;
            pontosEquipe2 = 0;
        } else if (setsEquipe2 == 3 && setsEquipe1 <= 1) {
            pontosEquipe2 = 3;
            pontosEquipe1 = 0;
        } else if (setsEquipe1 == 3 && setsEquipe2 == 2) {
            pontosEquipe1 = 2;
            pontosEquipe2 = 1;
        } else {
            pontosEquipe2 = 2;
            pontosEquipe1 = 1;
        }

        JOptionPane.showMessageDialog(null,
                "Equipe 1: "+nomeEquipe1+"\nSets equipe 1 = "+setsEquipe1+"\nPontos "+nomeEquipe1+" = "+pontosEquipe1+"\nEquipe 2: "+nomeEquipe2+"\nSets equipe 2 = "+setsEquipe2+"\nPontos "+nomeEquipe2+" = "+pontosEquipe2,
                "Aula de Java",
                JOptionPane.INFORMATION_MESSAGE);

    }
}