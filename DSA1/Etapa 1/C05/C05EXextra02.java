import javax.swing.*;
public class C05EXextra02 {
    public static void main(String[] args) {
        long tempo, velocidade, c;
        double velocidadeDaLuz, tempoRelativo;
        String tempoStr, velocidadeStr, tempoRelativoFormatado;

        tempoStr = JOptionPane.showInputDialog(null,
                "Informe o valor do tempo: ",
                "Relatividade",
                JOptionPane.QUESTION_MESSAGE);

        tempo = Long.parseLong(tempoStr);

        velocidadeStr = JOptionPane.showInputDialog(null,
                "Informe a velocidade: ",
                "Relatividade",
                JOptionPane.QUESTION_MESSAGE);

        velocidade = Long.parseLong(velocidadeStr);

        c = 3 * 100000000;

        tempoRelativo = tempo * (1 / (Math.sqrt(1 - Math.pow(velocidade, 2) / Math.pow(c, 2))));

        tempoRelativoFormatado = String.format("%10.4f",tempoRelativo);

        JOptionPane.showMessageDialog(null,
                "Reultado: "+tempoRelativoFormatado,
                "Relatividade",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
