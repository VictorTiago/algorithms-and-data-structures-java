import java.util.Scanner;
public class C08EX01 {
    public static void main(String[] args) {
        //Autor: Victor Tiago Avelino Da Silva
        long raio;
        double area;
        Scanner teclado = new Scanner(System.in);

        for (int aux = 1; aux <= 10; aux++) {
            System.out.print("Informe o raio do circulo: ");
            raio = teclado.nextLong();
            area = 3.1416 * Math.pow(raio, 2);
            System.out.println("Aréa do circulo = " + area);
        }
        teclado.close();
    }
}
