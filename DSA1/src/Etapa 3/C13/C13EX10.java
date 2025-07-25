import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C13EX10 {
    public static void main(String[] args) {
        //Victor Tiago Avelino da Silva

        String nome;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe seu nome completo: ");
        nome = teclado.nextLine().trim().toUpperCase();

        for (int aux = 0; aux < nome.length(); aux++){
            System.out.println(nome.charAt(aux));
        }
    }
}
