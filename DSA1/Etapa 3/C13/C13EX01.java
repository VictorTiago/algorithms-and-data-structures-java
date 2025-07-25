import java.util.Scanner;

public class C13EX01 {

    public static void main(String[] args) {
        //Victor Tiago Avelino Da Silva
        Scanner teclado = new Scanner(System.in);
        int x1, x2, y1, y2;

        System.out.print("Informe o valor de x1: ");
        x1 = teclado.nextInt();

        System.out.print("Informe o valor de y1: ");
        y1 = teclado.nextInt();

        System.out.print("Informe o valor de x2: ");
        x2 = teclado.nextInt();

        System.out.print("Informe o valor de y2: ");
        y2 = teclado.nextInt();

        double distancia = distancia(x1, y1,  x2, y2);
        System.out.println("A distância entre os pontos é: "+distancia);

        teclado.close();
    }

    public static double distancia(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x1-x2, 2)+ Math.pow(y1-y2, 2));
    }
}

