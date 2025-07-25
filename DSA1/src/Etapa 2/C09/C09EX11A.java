public class C09EX11A {
    public static void main(String[] args) {
        double num, den, serie = 0;
        //Victor Tiago Avelino da Silva
        //Math para raiz mult.

        for (int aux = 1; aux <= 100; aux++) {
            num = aux + (aux * 7 - 6);
            den = Math.pow(4, aux - 1);
            serie += num / den;
        }
        serie = Math.cbrt(serie);
        System.out.print("Resultado da serie: " + serie);
    }
}