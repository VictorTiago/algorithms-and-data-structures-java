import java.util.Scanner;

public class C11EX07 {
    public static void main(String[] args) {
        //Autor: Victor Tiago Avelino Da Silva
        int temperatura, menorTemperatura = Integer.MAX_VALUE, maiorTemperatura = 0, contMaior = 0;
        long somaTemperatura = 0;
        double mediaTemperaturas;
        Scanner teclado = new Scanner(System.in);

        for (int aux = 1; aux <= 121; aux++) {
            System.out.print("Temperatura do dia: " + aux + ":");
            temperatura = teclado.nextInt();
            somaTemperatura += temperatura;
            if (menorTemperatura > temperatura)
                menorTemperatura = temperatura;
            if (maiorTemperatura < temperatura)
                maiorTemperatura = temperatura;
            if (temperatura == maiorTemperatura)
                contMaior++;
        }
        mediaTemperaturas = (double) somaTemperatura / 121;
        System.out.println("Menor temperatura registrada: " + menorTemperatura);
        System.out.println("Maior temperatura registrada: " + maiorTemperatura);
        System.out.println("Média das temperaturas registradas: " + mediaTemperaturas);
        System.out.println("Quantidade de dias com a temperatura " + maiorTemperatura + ":" + contMaior);
    }
}
