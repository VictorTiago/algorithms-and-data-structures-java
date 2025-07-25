import java.util.Scanner;

public class C10EX03 {
    public static void main(String[] args) {
        //Autor: Victor Tiago Avelino Da Silva
        long angulo, raio;
        double area;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o valor de ângulo: ");
        angulo = teclado.nextLong();

        do {
            System.out.print("Informe o raio: ");
            raio = teclado.nextLong();
            if (raio != -1) {
                area = (angulo * 3.1416 * (Math.pow(raio, 2))) / 360;
                System.out.println("Valor da área: " + area);
            }
        } while (raio != -1);
        teclado.close();
    }
}
