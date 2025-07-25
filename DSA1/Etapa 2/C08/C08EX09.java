import java.util.Scanner;

public class C08EX09 {
    public static void main(String[] args) {
        //Autor: Victor Tiago Avelino Da Silva
        String nome, sexo;
        int idade, quantidadePessoas, contFeminino = 0, contMasculino = 0, somaIdadeMasculino = 0, somaIdadeFeminino = 0;
        double mediaIdadeFeminino, mediaIdadeMasculino;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a quantidade de pessoas: ");
        quantidadePessoas = teclado.nextInt();
        teclado.nextLine();

        for (int aux = 1; aux <= quantidadePessoas; aux++) {
            System.out.print("Informe o nome: ");
            nome = teclado.nextLine();
            System.out.print("Informe sua idade: ");
            idade = teclado.nextInt();
            teclado.nextLine();
            System.out.print("Informe seu sexo, sendo F para FEMININO e M para MASCULINO: ");
            sexo = teclado.nextLine();
            if (sexo.equalsIgnoreCase("F") || sexo.equalsIgnoreCase("Feminino")) {
                contFeminino++;
                somaIdadeFeminino += idade;
            } else if (sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("Masculino")) {
                contMasculino++;
                somaIdadeMasculino += idade;
            } else
                System.out.print("Inválido, digite novamente usando M ou F");
        }
        mediaIdadeFeminino = (float) somaIdadeFeminino / contFeminino;
        mediaIdadeMasculino = (float) somaIdadeMasculino / contMasculino;

        System.out.println("Idade média das mulheres: " + mediaIdadeFeminino);
        System.out.println("Idade média dos homens: " + mediaIdadeMasculino);

        teclado.close();
    }
}




                
