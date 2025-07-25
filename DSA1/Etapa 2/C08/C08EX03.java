import javax.swing.*;
import java.util.Scanner;

public class C08EX03 {
    public static void main(String[] args) {
        //Autor: Victor Tiago Avelino Da Silva
        int contReprovado = 0, contAprovado = 0;
        double nota;
        long faltas;
        Scanner teclado = new Scanner(System.in);

        for (int aux = 1; aux <= 50; aux++) {
            System.out.print("Informe a nota final: ");
            nota = teclado.nextLong();
            if (nota == -1)
                break;
            System.out.print("Informe o total de faltas: ");
            faltas = teclado.nextLong();
            if (nota >= 65 && faltas <= 16) {
                contAprovado++;
                System.out.println("O aluno foi aprovado");
            } else {
                contReprovado++;
                System.out.println("O aluno foi reprovado");
            }
        }
        System.out.println("Quantidade de alunos aprovados: "+contAprovado);
        System.out.println("Quantidade de alunos reprovados: "+contReprovado);

        teclado.close();
    }
}