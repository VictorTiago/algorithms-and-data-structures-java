import javax.swing.JOptionPane;
public class C05EX12 {
    public static void main(String[] args) {
        long segundos, horas, minutos, segundosRestantes;
        String segundosStr;

        segundosStr = JOptionPane.showInputDialog(null,
                "Informe o tempo de duração do evento em segundos:",
                "Duração evento",
                JOptionPane.QUESTION_MESSAGE);

        segundos = Long.parseLong(segundosStr);

        horas = segundos / 3600;

        minutos = (segundos % 3600) / 60;

        segundosRestantes = segundos % 60;

        JOptionPane.showMessageDialog(null,
                "Horas: " + horas + " Min: " + minutos + " Seg: " + segundosRestantes,
                "Duração evento:",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
