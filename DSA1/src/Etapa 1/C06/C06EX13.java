import javax.swing.*;
public class C06EX13 {
    public static void main(String[] args) {
        // Autor: Victor Tiago Avelino Da Silva
        String horaInicialStr, minutoInicialStr, horaFinalStr, minutoFinalStr;
        int horaInicial, minutoInicial, horaFinal, minutoFinal, duracaoHoras, duracaoMinutos;

        horaInicialStr = JOptionPane.showInputDialog(null,
                "Informe a hora inicial",
                "Aula de Java",
                JOptionPane.QUESTION_MESSAGE);

        horaInicial = Integer.parseInt(horaInicialStr);

        minutoInicialStr = JOptionPane.showInputDialog(null,
                "Informe o minuto inicial",
                "Aula de Java",
                JOptionPane.QUESTION_MESSAGE);

        minutoInicial = Integer.parseInt(minutoInicialStr);

        horaFinalStr = JOptionPane.showInputDialog(null,
                "Informe a hora final",
                "Aula de Java",
                JOptionPane.QUESTION_MESSAGE);

        horaFinal = Integer.parseInt(horaFinalStr);

        minutoFinalStr = JOptionPane.showInputDialog(null,
                "Informe o minuto final",
                "Aula de Java",
                JOptionPane.QUESTION_MESSAGE);

        minutoFinal = Integer.parseInt(minutoFinalStr);

        duracaoHoras = horaFinal - horaInicial;

        duracaoMinutos = minutoFinal - minutoInicial;

        JOptionPane.showMessageDialog(null,
                "O jogo durou " + duracaoHoras + " horas e " + duracaoMinutos + " minutos",
                "Aula de Java",
                JOptionPane.INFORMATION_MESSAGE);

    }
}

