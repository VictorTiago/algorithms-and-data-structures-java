import java.util.Scanner;
public class C08EX02 {
    public static void main(String[] args) {
        //Autor: Victor Tiago Avelino Da Silva
        long notaFinal, faltas;
        Scanner teclado = new Scanner(System.in);

        for (int aux = 1; aux <= 50; aux++) {
            System.out.print("Informe a nota final: ");
            notaFinal = teclado.nextLong();
            if (notaFinal == -1)
                break;
            System.out.print("Informe o total de faltas: ");
            faltas = teclado.nextLong();
            if (notaFinal >= 65 && faltas <= 16)
                System.out.println("O aluno foi aprovado");
            else
                System.out.println("O aluno foi reprovado");
        }
        teclado.close();
    }
}
