public class C09EX11D {
    public static void main(String[] args) {
        double num, den, serie = 0;
        //Victor Tiago Avelino da Silva

        for (int aux = 1; aux <= 100; aux++) {
            num = Math.pow(aux, 3);
            den = Math.pow(10, aux - 9);
            serie += num / den;
        }
        System.out.print("Resultado da serie: " + serie);
    }
}

