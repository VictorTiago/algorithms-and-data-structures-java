public class C09EX11E {
    public static void main(String[] args) {
        double num, den, serie = 0;
        //Victor Tiago Avelino da Silva

        for (int aux = 1; aux <= 100; aux++) {
            num = (Math.pow(aux, 2)) * (Math.sqrt(aux * 2 + 3));
            den = Math.pow(aux+1, aux);
            serie += num / den;
        }
        serie = (2.0 / 3) * serie;
        System.out.print("Resultado da serie: " + serie);
    }
}