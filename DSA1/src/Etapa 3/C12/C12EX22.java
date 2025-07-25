import java.util.Scanner;

public class C12EX22 {
    public static void main(String[] args) {
        //Victor Tiago Avelino Da Silva
        String placa[] = new String[100];
        String dono[] = new String[100];
        String nome;
        Scanner teclado = new Scanner(System.in);

        for (int aux = 0; aux < placa.length; aux++) {
            System.out.print("Informe a placa: ");
            placa[aux] = teclado.nextLine();
            System.out.print("Informe o nome do dono: ");
            dono[aux] = teclado.nextLine();
        }
        for (int aux = 0; aux < dono.length; aux++)
            for (int x = 0; x < dono.length; x++) {
                System.out.print("Informe a placa ou o dono: ");
                nome = teclado.nextLine();
                if (placa[aux] == nome)
                    System.out.println("Número da vaga: " + aux);
            }
    }
}
