import javax.swing.*;
public class C06EX09 {
    public static void main(String[] args) {
        // Autor: Victor Tiago Avelino Da Silva
        String [] opcoesSexo = {"F", "M"};
        String alturaStr;
        Object sexo;
        double pesoIdeal, altura;

        alturaStr = JOptionPane.showInputDialog(null,
                "Informe sua altura em metros: ",
                "Aula de Java",
                JOptionPane.QUESTION_MESSAGE);

        alturaStr = alturaStr.replace(',', '.');

        altura = Double.parseDouble(alturaStr);

        sexo = JOptionPane.showInputDialog(null,
                "Informe seu sexo:",
                "Aula de Java",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcoesSexo,
                "F");

        if (sexo == "F") {
            pesoIdeal = 62.1 * altura - 44.7;
            JOptionPane.showMessageDialog(null,
                    "Seu peso ideal é de: " + pesoIdeal,
                    "Aula de Java",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            pesoIdeal = 72.7 * altura - 58;
            JOptionPane.showMessageDialog(null,
                    "Seu peso ideal é de: " + pesoIdeal,
                    "Aula de Java",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
}