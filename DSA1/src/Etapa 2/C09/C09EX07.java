public class C09EX07 {
    public static void main(String[] args) {
        //Victor Tiago Avelino Da Silva
        double num, den, serie = 0;

        for (int aux = 1; aux <= 6; aux++) {
            num = (2 * (aux - 1)) + aux * 3;
            den = aux * 6 + 1;
            serie += num / den;
        }
        System.out.print("o resultado da serie é: " + serie);
    }
}
