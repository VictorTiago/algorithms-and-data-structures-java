import java.util.Scanner;

public class C08EX06 {
    public static void main(String[] args) {
        //Autor: Victor Tiago Avelino Da Silva
        int numero, somaDivisiveis4 = 0, contDiv3 = 0;
        Scanner teclado = new Scanner(System.in);

        for (int aux = 1; aux <= 10; aux++) {
            System.out.print("Informe um número: ");
            numero = teclado.nextInt();

            if (numero % 2 == 0)
                System.out.println(numero + " é par");
            else
                System.out.println(numero + " é impar");

            if (numero % 4 == 0)
                somaDivisiveis4 += numero;
            else if (numero % 3 == 0)
                contDiv3++;

        }
        System.out.println("A soma dos números divisíveis por 4 é: " + somaDivisiveis4);
        System.out.println("A quantidade de números divisíveis por 3 é: " + contDiv3);

        teclado.close();
    }
}