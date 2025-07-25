import java.util.Scanner;

public class C08EX07 {
    public static void main(String[] args) {
        //Autor: Victor Tiago Avelino Da Silva
        int idade, somaIdades = 0, contIdade12 = 0, contIdade30 = 0;
        String nome;
        double media;
        Scanner teclado = new Scanner(System.in);

        for (int aux = 1; aux <=50; aux++) {
            System.out.print("Informe o nome do aluno: ");
            nome = teclado.nextLine();
            System.out.print("Informe a idade do aluno: ");
            idade = teclado.nextInt();
            teclado.nextLine();

            somaIdades += idade;

            if (idade <= 12)
                contIdade12++;
            else if (idade > 30)
                contIdade30++;

        }
        media = (float) somaIdades / 50;

        System.out.println("Alunos com até 12 anos: " + contIdade12);
        System.out.println("Alunos acima de 30 anos: " + contIdade30);
        System.out.println("Média de idade dos alunos: " + media);

        teclado.close();
    }
}