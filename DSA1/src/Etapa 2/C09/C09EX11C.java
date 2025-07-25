public class C09EX11C {
    public static void main(String[] args) {
        double num, den, serie = 0;
        //Victor Tiago Avelino da Silva

        for (int aux = 1; aux <= 100; aux++) {
            num = (aux * 2 + 1) * Math.sqrt(aux * 4 + 1) ;
            den = Math.pow(5, aux);
            serie += num / den;
        }
        serie = Math.pow(serie, 2);
        System.out.print("Resultado da serie: " + serie);
    }
}
