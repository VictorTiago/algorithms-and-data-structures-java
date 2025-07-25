import java.util.Scanner;

public class C11EX03 {
    public static void main(String[] args) {
        //Autor: Victor Tiago Avelino Da Silva
        int dia, pontos, cont8 = 0, cont8em15 = 0, cont3 = 0, cont5 = 0;
        String placa;
        long valorTotal;

        Scanner teclado = new Scanner(System.in);

        do {
            System.out.print("Informe o dia: ");
            dia = teclado.nextInt();
            if (dia != 99) {
                System.out.print("Informe a placa: ");
                placa = teclado.nextLine();
                System.out.print("Informe os pontos: ");
                pontos = teclado.nextInt();
                teclado.nextLine();
                if (pontos == 8 && dia <= 15)
                    cont8em15++;
                if (pontos == 3) {
                    cont3++;
                    System.out.println("Valor da multa: R$ 42,00 \nPlaca: " + placa);
                } else if (pontos == 5) {
                    cont5++;
                    System.out.println("Valor da multa: R$ 108,00 \nPlaca: " + placa);
                } else if (pontos == 8) {
                    cont8++;
                    System.out.println("Valor da multa: R$ 479,00 \nPlaca: " + placa);
                }
            }
        } while (dia != 99);
        valorTotal = (cont3 * 42) + (cont5 * 108) + (cont8 * 479);
        System.out.println("Quantidade de pontuação 8 na quinzena: " + cont8em15);
        System.out.println("Valor total arrecadado com as multas: R$ "+valorTotal);
        teclado.close();
    }
}
