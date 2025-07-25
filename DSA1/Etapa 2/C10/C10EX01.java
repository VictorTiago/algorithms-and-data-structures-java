import java.util.Scanner;

public class C10EX01 {
    public static void main(String[] args) {
        //Autor: Victor Tiago Avelino Da Silva
        double valor, multa, somaMulta = 0, media;
        long contMulta = 0;

        Scanner teclado = new Scanner(System.in);

        do {
            System.out.print("Informe o valor: ");
            valor = teclado.nextDouble();
            if (valor != -1) {
                multa = valor * 0.10;
                System.out.println("Multa: "+multa);
                somaMulta += multa;
                contMulta++;
            }
        } while (valor != -1 );
        media = somaMulta / contMulta;
        System.out.print("A média das multas é: "+media);
        teclado.close();
    }
}
