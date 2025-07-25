import java.util.Scanner;

public class C13EX08 {
    public static void main(String[] args) {
        //Victor Tiago Avelino da Silva

        String nome, sobrenome;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe seu nome completo: ");
        nome = teclado.nextLine().trim();

        String [] nomeVet = nome.split(" ");

        sobrenome = nomeVet[nomeVet.length - 1].toUpperCase();

        StringBuilder iniciais = new StringBuilder();
        for (int aux = 0; aux < nomeVet.length - 1; aux++) {

            iniciais.append(nomeVet[aux].charAt(0)).append(". ");
        }
        String iniciaisFormat = iniciais.toString().toUpperCase().trim();


        System.out.printf("""
                Nome no padrão ABNT:
                %s, %s""",sobrenome,iniciaisFormat);
    }
}
