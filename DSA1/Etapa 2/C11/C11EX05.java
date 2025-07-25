import java.util.Scanner;

public class C11EX05 {
    public static void main(String[] args) {
        //Autor: Victor Tiago Avelino Da Silva
        String nome;
        int codigo;
        long contIngles = 0, contFrances = 0, contEspanhol = 0, contAluno = 0, totalIngles, totalFrances, totalEspanhol;
        double mensalidadeMedia;

        Scanner teclado = new Scanner(System.in);

        do {
            System.out.print("Informe seu nome: ");
            nome = teclado.nextLine();
            if (!nome.equalsIgnoreCase("FIM")) {
                contAluno++;
                System.out.print("Informe o código da opção: ");
                codigo = teclado.nextInt();
                if (codigo == 1) {
                    System.out.println("Nome: " + nome + "\nValor da mensalidade: R$ 100,00");
                    contIngles++;
                } else if (codigo == 2) {
                    System.out.println("Nome: " + nome + "\nValor da mensalidade: R$ 150,00");
                    contFrances++;
                } else if (codigo == 3) {
                    System.out.println("Nome: " + nome + "\nValor da mensalidade: R$ 120,00");
                    contEspanhol++;
                }
            }
        } while (!nome.equalsIgnoreCase("FIM"));
        totalIngles = contIngles * 100;
        totalFrances = contFrances * 150;
        totalEspanhol = contEspanhol * 120;
        mensalidadeMedia = (totalIngles + totalEspanhol + totalFrances) / contAluno;
        System.out.println("Quantidade de alunos matriculados em Ingles: " + contIngles);
        System.out.println("Mensalidade média da escola: " + mensalidadeMedia);
        System.out.println("Valor total da mensalidade de Ingles: " + totalIngles);
        System.out.println("Valor total da mensalidade de Frances: " + totalFrances);
        System.out.println("Valor total da mensalidade de Espanhol: " + totalEspanhol);
    }
}
