import java.util.Scanner;

public class C11EX01 {
    public static void main(String[] args) {
        //Autor: Victor Tiago Avelino Da Silva
        long valor, contFx = 0;
        double fx, somafx = 0, media;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o valor: ");
        valor = teclado.nextLong();

        for (int x = 1; x <= valor; x++) {

            if (x % 2 != 0) {
                fx = Math.pow(x, 2) + (((4.0 * x) - 2.0) / 5);
                somafx += fx;
                contFx++;
                System.out.println("Fx = " + fx);
            }
        }
        media = somafx / contFx;
        System.out.println("Média Fx = "+media);
        teclado.close();
    }
}