import javax.swing.JOptionPane;

public class C05EX05 {
    public static void main(String[] args) {
        // Autor: Victor Tiago Avelino Da Silva
        String celsiusStr;
        double celsius, kelvin, fahrenheit;

        celsiusStr = JOptionPane.showInputDialog(null,
                "Qual o valor em Celsius? ",
                "Conversão de Temperatura",
                JOptionPane.QUESTION_MESSAGE);

        celsius = Double.parseDouble(celsiusStr);

        kelvin = celsius + 273;

        fahrenheit = (9.0 / 5) * celsius + 32;

        JOptionPane.showMessageDialog(null,
                String.format("Temperatura em Fahrenheit: %.2f\nTemperatura em Kelvin: %.2f", fahrenheit, kelvin),
                "Resultado da Conversão",
                JOptionPane.INFORMATION_MESSAGE);
    }
}