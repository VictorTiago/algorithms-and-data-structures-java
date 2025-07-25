import javax.swing.*;
import java.util.Scanner;

public class C08EX04 {
    public static void main(String[] args) {
        //Autor: Victor Tiago Avelino Da Silva
        int idade, contMaior = 0, contMenor = 0;
        String nome;

        Scanner teclado = new Scanner(System.in);

        for (int aux = 1; aux <= 50; aux++) {
            System.out.print("Informe o nome: ");
            nome = teclado.nextLine();
            System.out.print("Informe a idade: ");
            idade = teclado.nextInt();
            teclado.nextLine();
            if (idade <= 18)
                contMenor++;
            else
                contMaior++;
        }
        System.out.println("Alunos que tem até 18 anos: " + contMenor);
        System.out.println("Alunos que tem idade acima de 18 anos: " + contMaior);

        teclado.close();
    }
}