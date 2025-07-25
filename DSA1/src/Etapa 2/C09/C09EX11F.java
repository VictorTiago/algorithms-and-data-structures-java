public class C09EX11F {
    public static void main(String[] args) {
        double num, den, serie = 0;
        //Victor Tiago Avelino da Silva

        for (int aux = 1; aux <= 100; aux++) {
            num = (aux * 2 - 1) * Math.pow(2, aux+1);
            den = Math.pow(aux * 5 - 3, 2);
            serie += num / den;
        }
        serie = 5 * Math.sqrt(serie);
        System.out.print("Resultado da serie: " + serie);
    }
}
