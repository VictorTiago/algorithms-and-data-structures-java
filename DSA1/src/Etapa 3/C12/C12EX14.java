import java.util.Scanner;

public class C12EX14 {
    public static void main(String[] args) {
        //Victor Tiago Avelino da Silva

        Scanner teclado = new Scanner(System.in);

        int qnt, bilheteSort, sort = -1;

        System.out.println("Informe a quantidade de bilhetes: ");
        qnt = teclado.nextInt();
        teclado.nextLine();

        int bilhete[] = new int[qnt];

        for (int aux = 0; aux < qnt; aux++){
            System.out.println("Informe o número do bilhete: ");
            bilhete[aux] = teclado.nextInt();
        }

        System.out.println("Informe o número do bilhete sorteado: ");
        bilheteSort = teclado.nextInt();
        teclado.nextLine();

        for (int aux = 0; aux < qnt; aux++){
            if (bilhete[aux] == bilheteSort){
                sort = 1;
                break;
            }
        }

        if (sort == 1){
            System.out.println("Você foi premiado!!!");
        }else {
            System.out.println("Infelizmente, não foi dessa vez!");
        }
    }
}
