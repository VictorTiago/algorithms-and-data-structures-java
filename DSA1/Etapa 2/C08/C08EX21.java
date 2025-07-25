import java.util.Scanner;

public class C08EX21 {
    public static void main(String[] args) {
        //Autor: Victor Tiago Avelino Da Silva
        double altura, imc;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe sua altura em metros: ");
        altura = teclado.nextDouble();

        for (int aux = 60; aux <= 100; aux++) {
            for (int auxPeso = 60; auxPeso <= 100; auxPeso++) {
                System.out.println("Peso: " + auxPeso);

                imc = auxPeso / Math.pow(altura, 2);
                System.out.print("IMC: " + imc);
                if (imc < 20)
                    System.out.println("\nSituação corpórea: ABAIXO DO PESO");
                else if (imc >= 20 && imc <= 25)
                    System.out.println("\nSituação corpórea: PESO IDEAL");
                else
                    System.out.println("\nSituação corpórea: ACIMA DO PESO");
            }
        }
        teclado.close();
    }
}