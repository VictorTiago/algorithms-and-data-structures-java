import java.util.Scanner;

public class C10EX04 {
    public static void main(String[] args) {
        //Autor: Victor Tiago Avelino Da Silva
        int taxaBdi, quantidade;
        double  unitario, parcial, somaTotal = 0, precoFinal, bdi;
        String material;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a taxa BDI: ");
        taxaBdi = teclado.nextInt();

        do {
            System.out.print("Informe o nome do material: ");
            material = teclado.nextLine();
            if (!material.equalsIgnoreCase("FIM")) {
                teclado.nextLine();
                System.out.print("Informe a quantidade: ");
                quantidade = teclado.nextInt();
                System.out.print("Informe o preço unitário: ");
                unitario = teclado.nextDouble();

                parcial = unitario * quantidade;
                somaTotal += parcial;
                System.out.println("Custo parcial: " + parcial);
            }
        } while (!material.equalsIgnoreCase("FIM"));
        bdi = somaTotal * (taxaBdi / 100);
        precoFinal = somaTotal + bdi;
        System.out.println("Preço final: "+precoFinal);
    }
}
