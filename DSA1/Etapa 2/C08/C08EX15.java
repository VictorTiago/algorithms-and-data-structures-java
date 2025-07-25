import java.util.Scanner;

public class C08EX15 {
    public static void main(String[] args) {
        //Victor Tiago Avelino Da Silva
        String nome, cargo, nomeMaior = " ", cargoMaior = " ";
        double salario, salarioMaior = 0, contSenior = 0, contSalario18 = 0, mediaSalario18, somaSalario = 0;
        int idade;

        Scanner arquivo = new Scanner(
                C08EX15.class.getResourceAsStream("c08ex15.txt"));

        for (int aux = 1; aux <= 7; aux++) {
            nome = arquivo.nextLine();
            cargo = arquivo.nextLine();
            salario = arquivo.nextDouble();
            idade = arquivo.nextInt();
            arquivo.nextLine();

            if (cargo.equalsIgnoreCase("SÊNIOR"))
                contSenior++;

            if (idade <= 18)
                contSalario18++;

            if (aux == 1 || salario > salarioMaior) {
                salarioMaior = salario;
                nomeMaior = nome;
                cargoMaior = cargo;
            }
        }
        mediaSalario18 = somaSalario / contSalario18;
        System.out.print("Média salárial de funcionários com até 18 anos: " + mediaSalario18 + "\nNome do maior salário: " + nomeMaior + "\nCargo do maior salário: " + cargoMaior);
        arquivo.close();
    }
}