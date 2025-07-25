import java.util.Scanner;

public class C12EX13 {
    public static void main(String[] args) {
        //Victor Tiago Avelino da Silva

        Scanner teclado = new Scanner(System.in);

        int qnt = 10;

        String fila [] = new String[qnt];
        String nome;
        int pos = -1;

        for (int aux = 0; aux < qnt; aux++){
            System.out.printf("\nInforme o nome da pessoa na posição %d da fila:",aux+1);
            fila[aux] = teclado.nextLine();
        }


        System.out.println("Informe o nome que você quer saber a posição na fila: ");
        nome = teclado.nextLine();

        for (int aux = 0; aux < qnt; aux++){
            if (nome.equalsIgnoreCase(fila[aux])){
                pos = (aux+1);
                break;
            }
        }
        if (pos == -1){
            System.out.println("O nome informado não se encontra na fila");
        }else {
            System.out.printf("O nome informado se encontra na posição %d da fila",(pos));
        }
    }
}
