import java.util.Scanner;

public class C12EX12 {
    public static void main(String[] args) {
        //Victor Tiago Avelino da Silva

        Scanner teclado = new Scanner(System.in);

        int qntAlun = 3;
        String maiorNotaStr = null;

        String nome [] = new String[qntAlun];
        String [] alunosMaiorNota = new String[qntAlun];
        double [] nota = new double[qntAlun];
        double maiorNota = Double.MIN_VALUE;

        for (int aux = 0; aux <qntAlun; aux++){
            System.out.println("Informe o nome do aluno: ");
            nome[aux] = teclado.nextLine();
            System.out.println("Informe a nota do aluno: ");
            nota[aux] = teclado.nextDouble();
            teclado.nextLine();

            if (nota[aux] > maiorNota){
                maiorNota = nota[aux];
                maiorNotaStr = nome [aux];
            }
        }

        for (int i = 0; i <qntAlun; i++) {
            if (nota[i] == maiorNota) {
                alunosMaiorNota[i] = nome[i];
            } else{
                alunosMaiorNota[i] = " ";
            }
        }

        System.out.println("\nAlunos com a maior nota: ");

        for (int k = 0; k < qntAlun; k++){
            System.out.println(alunosMaiorNota[k]);
        }

    }
}
