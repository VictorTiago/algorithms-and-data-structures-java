import java.util.Scanner;

public class C10EX05 {
    public static void main(String[] args) {
        //Autor: Victor Tiago Avelino Da Silva
        int contPessoas = 0, contMulheres = 0, contMulheresPeso = 0, contHomens;
        long peso;
        double mediaAlturaH, somaAlturaH = 0, altura;
        String sexo;

        Scanner teclado = new Scanner(System.in);

        do {
            System.out.print("Informe o sexo: ");
            sexo = teclado.nextLine();
            if ((!sexo.equalsIgnoreCase("FIM"))) {
                System.out.print("Informe o peso: ");
                peso = teclado.nextLong();
                System.out.print("Informe a altura: ");
                altura = teclado.nextDouble();
                contPessoas++;
                teclado.nextLine();
                if (sexo.equalsIgnoreCase("F"))
                    contMulheres++;
                if (sexo.equalsIgnoreCase("M"))
                    somaAlturaH += altura;
                if (sexo.equalsIgnoreCase("F") && peso < 60)
                    contMulheresPeso++;
            }
        } while (!sexo.equalsIgnoreCase("FIM"));
        contHomens = contPessoas - contMulheres;
        mediaAlturaH = contHomens / somaAlturaH;
        System.out.print("Pessoas pesquisadas: "+contPessoas+"\nMulheres: "+contMulheres+"\nAltura média dos homens: "+mediaAlturaH+"\nMulheres com peso menor que 60: "+contMulheresPeso);
    }
}
