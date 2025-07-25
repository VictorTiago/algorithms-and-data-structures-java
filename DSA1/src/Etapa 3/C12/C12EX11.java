import java.util.Scanner;

public class C12EX11 {
    public static void main(String[] args) {
        //Victor Tiago Avelino da Silva

        Scanner teclado = new Scanner(System.in);

        int qntAlun = 8;
        String maiorNotaStr = null;

        String [] nome = new String[qntAlun];
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

        System.out.printf("Aluno com a maior nota: %s",maiorNotaStr);


    }
}
