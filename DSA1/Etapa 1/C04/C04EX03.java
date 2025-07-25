import java.util.Scanner;
        public class C04EX03 {
            public static void main(String[] args) {
                // Autor: Victor Tiago Avelino Da Silva
                long quantidade1, quantidade2, quantidade3, quantidade4;
                double resultadoMulta1, resultadoMulta2, resultadoMulta3;
                Scanner teclado = new Scanner(System.in);

                System.out.print("Informe a quantidade de poluentes para aplicar a multa 1: ");
                quantidade1 = teclado.nextLong();

                System.out.print("Informe o valor da multa 1: ");
                resultadoMulta1 = teclado.nextDouble();

                System.out.print("Informe a quantidade de poluentes minima de para aplicar a multa 2: ");
                quantidade2 = teclado.nextLong();

                System.out.print("Informe a quantidade de poluentes maxima para aplicar a multa 2: ");
                quantidade3 = teclado.nextLong();

                System.out.print("Informe o valor da multa 2: ");
                resultadoMulta2 = teclado.nextDouble();

                System.out.print("Informe a quantidade de poluentes para aplicar a multa 3: ");
                quantidade4 = teclado.nextLong();

                System.out.print("Informe o valor da multa 3");
                resultadoMulta3 = teclado.nextDouble();


                System.out.println("Quantidade de Poluente Emitido x Valor da Multa");

                System.out.println();

                System.out.println("Até R$" + quantidade1 + " multa de R$" + resultadoMulta1);

                System.out.println("Entre " + quantidade2 + "e " + quantidade3 + " multa de R$" + resultadoMulta2);

                System.out.println("Acima de " + quantidade4 + "multa de R$" + resultadoMulta3 + "por poluente emitido");
            }
        }
        


