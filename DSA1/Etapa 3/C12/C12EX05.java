import java.util.Scanner;

public class C12EX05 {
    public static void main(String[] args) {
        //Victor Tiago Avelino da Silva

        int[] vet = new int[100];
        int nunInf, pos = -1;

        Scanner teclado = new Scanner(System.in);

        for (int aux = 0; aux< vet.length; aux++){
            System.out.println("Informe um número inteiro: ");
            vet[aux] = teclado.nextInt();
        }

        System.out.println("Informe um número a ser pesquisado: ");
        nunInf = teclado.nextInt();

        for (int aux = 0; aux< vet.length; aux++){
            if (vet[aux] == nunInf){
                pos = aux+1;
            }
        }
        if (pos == -1){
            System.out.println("Valor Não Encontrado");
        }else {
            System.out.printf( "Numero '%d' encontado na posição '%d'",nunInf,pos );;
        }
    }
}
