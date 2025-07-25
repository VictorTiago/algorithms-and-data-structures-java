import javax.swing.*;
import java.util.Scanner;
public class C04EX05 {
    public static void main(String[] args) {
        // Autor: Victor Tiago Avelino Da Silva
        String nome, cpf, identidade, nomeEmpresa, tituloEleitor, carteiraMotorista, salario;

        Scanner arquivo = new Scanner(
                C04EX05.class.getResourceAsStream("C04EX05.txt"));

        nome = arquivo.nextLine();
        System.out.println("FICHA FUNCIONAL DE: " + nome);

        System.out.println("Documentos:");

        cpf = arquivo.nextLine();
        System.out.println("CPF............................................. " + cpf);

        identidade = arquivo.nextLine();
        System.out.println("C.I. ............................................... " + identidade);

        tituloEleitor = arquivo.nextLine();
        System.out.println("Titulo de eleitor  ........................... " + tituloEleitor);

        carteiraMotorista = arquivo.nextLine();
        System.out.println("Carteira de motorista ................... " + carteiraMotorista);

        nomeEmpresa = arquivo.nextLine();
        System.out.println("Empresa: " + nomeEmpresa);

        salario = arquivo.nextLine();
        System.out.println("Salário: R$" + salario);

        JOptionPane.showMessageDialog(null,
                nome + "\n\nDocumentos:\n" +
                        "CPF: " + cpf + "\n" +
                        "C.I.: " + identidade + "\n" +
                        "Título de eleitor: " + tituloEleitor + "\n" +
                        "Carteira de motorista: " + carteiraMotorista + "\n\n" +
                        "Empresa: " + nomeEmpresa + "\n" +
                        "Salário: R$" + salario,
                "Dados",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
