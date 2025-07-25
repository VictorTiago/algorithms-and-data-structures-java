import java.util.Scanner;

public class C12EX25 {
    public static void main(String[] args) {
        //Victor Tiago Avelino da Silva

        String frase;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe uma frase: ");
        frase = teclado.nextLine();

        String [] vetFrase = frase.split(" ");

        for (int aux = 0; aux < vetFrase.length; aux++){
            System.out.println(vetFrase[aux]);
        }
    }
}
