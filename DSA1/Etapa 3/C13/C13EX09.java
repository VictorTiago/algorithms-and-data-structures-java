import java.util.Scanner;

public class C13EX09 {
    public static void main(String[] args) {
        //Victor Tiago Avelino da Silva

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe uma frase: ");

        String [] wordVet = teclado.nextLine().split(" ");

        StringBuilder newFrase = new StringBuilder();

        for (String word : wordVet)  {

            String letraCAPS = word.substring(0,1).toUpperCase() + word.substring(1);

            newFrase.append(letraCAPS).append(" ");
        }
        String fraseFormat = newFrase.toString().trim();

        System.out.println(newFrase);
    }
}
