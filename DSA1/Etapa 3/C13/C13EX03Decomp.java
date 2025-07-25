import com.sun.jdi.Value;

public class C13EX03Decomp {
    //Victor Tiago Avelino da Silva
    public static String decomp (long num, int x) {
        String numStr = String.valueOf(num);
        String[] vetInvert = new String[numStr.length()];
        int cont = 0;

        for (int aux = vetInvert.length-1; aux >= 0; aux--) {
            vetInvert[cont] = numStr.substring(aux,aux+1);
            cont++;
        }
        return vetInvert[x-1];
    }
}
