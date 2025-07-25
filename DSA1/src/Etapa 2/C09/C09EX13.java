public class C09EX13 {
    public static void main(String[] args) {
        int rep;
        double serie = 0, den = 0, num = 1;
        //Victor Tiago Avelino Da Silva

        rep = 10;

        for (int aux = 1; aux <= rep; aux++){
            if ( aux % 2 == 0) {
                num *= aux;
                den = (den*2)+1;
                serie -= (num / den);
            } else {
                num *= aux;
                den = (den*2)+1;
                serie += ( num / den );
            }
        }
        System.out.println( serie );
    }
}
