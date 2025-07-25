import java.util.Scanner;

public class C08EX05A {
    public static void main(String[] args) {
        //Autor: Victor Tiago Avelino Da Silva
        int contFulano = 0, contCiclano = 0, contBeltrano = 0, contNulo = 0, voto, somaVotos, contFulano2 = 0, contCiclano2 = 0, contBeltrano2 = 0, contFulano3 = 0, contCiclano3 = 0, contBeltrano3 = 0, contBeltrano4 = 0, contFulano4 = 0, contCiclano4 = 0, contFulano5 = 0, contCiclano5 = 0, contBeltrano5 = 0;
        String vencedor, votoStr, votoSegundoStr, votoSegundo2Str, votoSegundo3Str, votoSegundo4Str;
        Scanner teclado = new Scanner(System.in);

        for (int aux = 1; aux <= 100; aux++) {
            System.out.print("Informe seu voto: ");
            votoStr = teclado.nextLine();

            if (votoStr.equals("1")) {
                contFulano++;
            } else if (votoStr.equals("2")) {
                contCiclano++;
            } else if (votoStr.equals("3")) {
                contBeltrano++;
            } else if (votoStr.equalsIgnoreCase("nulo")) {
                contNulo++;
            } else
                System.out.println("Número invalido, tente novamente");
        }


        somaVotos = contBeltrano + contCiclano + contFulano;

        if (contBeltrano > contCiclano && contBeltrano > contFulano)
            System.out.println("Fulano: " + contFulano + "\nCiclano: " + contCiclano + "\nBeltrano: " + contBeltrano + "\nO vencedor é o candidato Beltrano");

        else if (contFulano > contBeltrano && contFulano > contCiclano)
            System.out.println("Fulano: " + contFulano + "\nCiclano: " + contCiclano + "\nBeltrano: " + contBeltrano + "\nO vencedor é o candidato Fulano");

        else if (contCiclano > contBeltrano && contCiclano > contFulano)
            System.out.println("Fulano: " + contFulano + "\nCiclano: " + contCiclano + "\nBeltrano: " + contBeltrano + "\nO vencedor é o candidato Ciclano");

        else if (contNulo > somaVotos)
            System.out.println("A eleição está anulada");

        else if (contBeltrano == contCiclano) {
            for (int aux2 = 1; aux2 <= 100; aux2++) {
                System.out.print("Informe seu voto: ");
                votoSegundoStr = teclado.nextLine();

                if (votoSegundoStr.equals("2"))
                    contCiclano2++;
                else if (votoSegundoStr.equals("3"))
                    contBeltrano2++;
                else
                    System.out.println("Voto inválido, tente novamente");
            }

            if (contBeltrano2 > contCiclano2)
                System.out.println("Beltrano: " + contBeltrano2 + "\nCiclano: " + contCiclano2 + "\nO vencedor é o candidato Beltrano");

            else if (contCiclano2 > contBeltrano2)
                System.out.println("Ciclano: " + contCiclano2 + "\nBeltrano: " + contBeltrano2 + "\nO vencedor é o candidato Ciclano");
        } else if (contFulano == contCiclano) {
            for (int aux3 = 1; aux3 <= 100; aux3++) {
                System.out.print("Informe seu voto: ");
                votoSegundo2Str = teclado.nextLine();

                if (votoSegundo2Str.equals("1"))
                    contFulano3++;
                else if (votoSegundo2Str.equals("2"))
                    contCiclano3++;
                else
                    System.out.println("Número inválido, tente novamente");
            }

            if (contFulano3 > contCiclano3)
                System.out.println("Fulano: " + contFulano3 + "\nCiclano: " + contCiclano3 + "\nO vencedor é o candidato Fulano");

            else if (contCiclano3 > contFulano3)
                System.out.println("Fulano: " + contFulano3 + "\nCiclano: " + contCiclano3 + "\nO vencedor é o candidato Ciclano");
        } else if (contBeltrano == contFulano) {
            for (int aux4 = 1; aux4 <= 100; aux4++) {
                System.out.print("Informe seu voto: ");
                votoSegundo3Str = teclado.nextLine();
                if (votoSegundo3Str.equals("1"))
                    contFulano4++;
                else if (votoSegundo3Str.equals("3"))
                    contBeltrano4++;
            }
            if (contFulano3 > contBeltrano3)
                System.out.println("Fulano: " + contFulano3 + "\nBeltrano: " + contBeltrano3 + "\nO vencedor é o candidato Fulano");

            else if (contBeltrano3 > contFulano3)
                System.out.println("Fulano: " + contFulano3 + "\nCiclano: " + contBeltrano3 + "\nO vencedor é o candidato Beltrano");
        } else if (contBeltrano == contFulano && contCiclano == contFulano) {
            for (int aux5 = 1; aux5 <= 100; aux5++) {
                System.out.print("Informe seu voto: ");
                votoSegundo4Str = teclado.nextLine();
                System.out.print("Segundo turno entre Fulano, Beltrano e Ciclano\n informe seu voto: ");
                votoSegundo4Str = teclado.nextLine();

                if (votoSegundo4Str.equals("1")) {
                    contFulano5++;
                } else if (votoSegundo4Str.equals("2")) {
                    contCiclano5++;
                } else if (votoSegundo4Str.equals("3")) {
                    contBeltrano5++;
                } else
                    System.out.println("Número invalido, tente novamente");
            }

            if (contFulano5 > contCiclano5 && contFulano5 > contBeltrano5)
                System.out.println("Fulano: " + contFulano5 + "\nCiclano: " + contCiclano5 + "\nBeltrano: " + contBeltrano5 + "\nO vencedor é o candidato Fulano");

            else if (contCiclano5 > contFulano5 && contCiclano5 > contBeltrano5)
                System.out.println("Fulano: " + contFulano5 + "\nCiclano: " + contCiclano5 + "\nBeltrano: " + contBeltrano5 + "\nO vencedor é o candidato Ciclano");

            else if (contBeltrano5 > contFulano5 && contBeltrano5 > contCiclano5)
                System.out.println("Fulano: " + contFulano5 + "\nCiclano: " + contCiclano5 + "\nBeltrano: " + contBeltrano5 + "\nO vencedor é o candidato Beltrano");

            teclado.close();
        }
    }
}

