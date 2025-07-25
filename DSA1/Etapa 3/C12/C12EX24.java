import java.util.Scanner;

public class C12EX24 {
    public static void main(String[] args) {
        //Victor Tiago Avelino da Silva

        Scanner teclado = new Scanner(System.in);

        int ptsEqpsTemp;
        String nomeEqpsTemp, nomePsq, pos = null;
        int ptsEqps[] = new int[20];
        String nomeEqps[] = new String[ptsEqps.length];

        for (int aux = 0; aux < ptsEqps.length; aux++) {
            System.out.println("Informe o nome da equipe: ");
            nomeEqps[aux] = teclado.nextLine();
            System.out.println("Informe a pontuação da equipe: ");
            ptsEqps[aux] = teclado.nextInt();
            teclado.nextLine();
        }

        for (int aux = 0; aux < ptsEqps.length - 1; aux++) {
            for (int aux2 = 0; aux2 < ptsEqps.length - 1; aux2++) {
                if (ptsEqps[aux2] < ptsEqps[aux2 + 1]) {

                    ptsEqpsTemp = ptsEqps[aux2];
                    ptsEqps[aux2] = ptsEqps[aux2 + 1];
                    ptsEqps[aux2 + 1] = ptsEqpsTemp;

                    nomeEqpsTemp = nomeEqps[aux2];
                    nomeEqps[aux2] = nomeEqps[aux2 + 1];
                    nomeEqps[aux2 + 1] = nomeEqpsTemp;
                }
            }
        }
        int found = 0;
        do {

            System.out.println("Informe o nome da equipe a ser pesquisada: ");
            nomePsq = teclado.nextLine();

            for (int aux = 0; aux < ptsEqps.length; aux++) {

                switch (aux){
                    case 0,1,2,3 ->{
                        pos = "Copa Libertadores";
                    }
                    case 4,5,6,7,8,9,10,11 ->{
                        pos = "Copa Sul-americana";
                    }
                    case 16,17,18,19 ->{
                        pos = "Rebaixada";
                    }
                }

                if (nomeEqps[aux].equalsIgnoreCase(nomePsq)) {
                    System.out.printf("Nome da equipe: %s\nPosição: %d\nSituação: %s", nomeEqps[aux], aux, pos);
                    found = -1;
                    break;
                } else if (aux == nomeEqps.length-1){
                    System.out.println("Equipe não encontrada!!!\n");
                }
            }

        } while (found != -1);
    }
}