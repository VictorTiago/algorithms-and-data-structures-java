import javax.swing.*;
import java.util.Scanner;

public class C08EX18 {
    public static void main(String[] args) {
        //Victor Tiago Avelino Da Silva
        int numero, resultado;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe um número inteiro de 1 a 9: ");
        numero = teclado.nextInt();


        for (int aux = 1; aux <= 9; aux++) {
            resultado = aux * numero;
            System.out.println(aux+" x "+numero+ " = "+resultado);
        }
        teclado.close();
    }
}
