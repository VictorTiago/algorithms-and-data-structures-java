import java.util.Scanner;

public class C12EX07 {
    public static void main(String[] args) {
        // Victor Tiago Avelino Da Silva
        String nomes[] = new String[50], conceito;
        int notas;
        Scanner teclado = new Scanner(System.in);

        for (int aux = 0; aux < nomes.length; aux++) {
            System.out.print("Informe o nome: ");
            nomes[aux] = teclado.nextLine();
            System.out.print("Informe sua nota: ");
            notas = teclado.nextInt();
            teclado.nextLine();

            for (int aux2 = 0; aux2 < nomes.length; aux2++) {
                if (notas <= 30)
                    conceito = "D";
                else if (notas < 60)
                    conceito = "C";
                else if (notas < 80)
                    conceito = "B";
                else
                    conceito = "A";
                System.out.println("Aluno: " + nomes[aux] + "\nConceito: " + conceito);
            }
        }
        teclado.close();
    }
}
