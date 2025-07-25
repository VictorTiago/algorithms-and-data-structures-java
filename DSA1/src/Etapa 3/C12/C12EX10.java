import java.util.Scanner;

public class C12EX10 {
    public static void main(String[] args) {
        //Victor Tiago Avelino da Silva

        Scanner teclado = new Scanner(System.in);

        int qntAlun = 8;
        double soma = 0, media;

        String [] nome = new String[qntAlun];
        double [] nota = new double[qntAlun];

        for (int aux = 0; aux < qntAlun; aux++){

            System.out.println("Informe o nome do aluno: ");
            nome[aux] = teclado.nextLine();
            System.out.println("Informe a nota do aluno: ");
            nota[aux] = teclado.nextDouble();
            teclado.nextLine();

            soma += nota[aux];
        }

        media = soma / qntAlun;

        for (int aux = 0; aux < qntAlun; aux++){
            if (nota[aux] > media){
                System.out.println(nome[aux]);
            }
        }

    }
}