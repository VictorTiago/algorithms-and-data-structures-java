import java.util.Scanner;

public class C12EX03 {
    public static void main(String[] args) {
        // Victor Tiago Avelino Da Silva
        int valor[] = new int[10];
        double valorQuadrado;
        Scanner teclado = new Scanner(System.in);

        for (int aux = 0; aux < valor.length; aux++) {
            System.out.print("Informe um número inteiro: ");
            valor[aux] = teclado.nextInt();
            valorQuadrado = Math.pow(valor[aux], 2);
            System.out.println(valorQuadrado);
        }
        teclado.close();
    }
}

