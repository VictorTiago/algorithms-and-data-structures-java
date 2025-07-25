import java.util.Scanner;

public class C12EX17 {
    public static void main(String[] args) {
        //Victor Tiago Avelino Da Silva
        int numero[] = new int[10], soma = 0, cont = 0;
        double media;
        Scanner teclado = new Scanner(System.in);

        for (int aux = 0; aux < numero.length; aux++) {
            System.out.print("Informe o número: ");
            numero[aux] = teclado.nextInt();
        }
        for (int aux = 0; aux < numero.length; aux++) {
            for (int x = 0; x < numero.length; aux++) {
                if (numero[aux] % 2 == 0) {
                    cont++;
                    soma += numero[aux];
                    System.out.println(numero[aux]);
                }
            }
        }
        media = soma / cont;
        System.out.println("Média dos números pares: "+media);
        teclado.close();
    }
}

