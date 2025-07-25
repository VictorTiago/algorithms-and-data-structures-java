import java.util.Scanner;

public class C08EX05 {
    public static void main(String[] args) {
        //Autor: Victor Tiago Avelino Da Silva
        int contFulano = 0, contCiclano = 0, contBeltrano = 0;
        int voto;
        String vencedor;
        Scanner teclado = new Scanner(System.in);

        for (int aux = 1; aux <= 100; aux++) {
            System.out.print("Informe seu voto: ");
            voto = teclado.nextInt();

            if (voto == 1) {
                contFulano++;
            }else if (voto == 2) {
                contCiclano++;
            }else if (voto == 3) {
                contBeltrano++;}
            else{
                System.out.println("Voto inválido. Tente novamente.");
                aux--;}
        }

        if (contFulano > contBeltrano && contFulano > contBeltrano)
            vencedor = "Fulano";
        else if (contBeltrano > contFulano && contBeltrano > contCiclano)
            vencedor = "Beltrano";
        else
            vencedor = "Ciclano";

        System.out.println("Quantidade de votos para Fulano: " + contFulano);
        System.out.println("Quantidade de votos para Ciclano: " + contCiclano);
        System.out.println("Quantidade de votos para Beltrano: " + contBeltrano);
        System.out.println("Vencedor = " + vencedor);

        teclado.close();
    }
}



        
