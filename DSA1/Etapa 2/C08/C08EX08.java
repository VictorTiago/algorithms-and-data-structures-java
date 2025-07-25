import java.util.Scanner;

public class C08EX08 {
    public static void main(String[] args) {
        //Autor: Victor Tiago Avelino Da Silva
        int contReprovado = 0, contAprovado = 0, contFaltas16 = 0, somaAprovados = 0;
        double nota, mediaAprovados;
        long faltas;
        Scanner teclado = new Scanner(System.in);

        for (int aux = 1; aux <= 50; aux++) {
            System.out.print("Informe a nota final: ");
            nota = teclado.nextLong();
            if (nota == -1)
                break;
            System.out.print("Informe o total de faltas: ");
            faltas = teclado.nextLong();
            if (faltas > 16)
                contFaltas16++;

            if (nota >= 65 && faltas <= 16) {
                somaAprovados += nota;
                contAprovado++;
                System.out.println("O aluno foi aprovado");
            } else {
                contReprovado++;
                System.out.println("O aluno foi reprovado");
            }
        }
        mediaAprovados = (float) somaAprovados / contAprovado;

        System.out.println("Média das notas dos aprovados: "+mediaAprovados);
        System.out.println("Quantidade de alunos com mais de 16 faltas: "+contFaltas16);

        teclado.close();
    }
}
