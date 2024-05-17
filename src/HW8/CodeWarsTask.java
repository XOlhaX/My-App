package HW8;

public class CodeWarsTask {
    public static void main (String[] args) {

        int n = 3;

        // p - function
        int pFunctionSum = 0;
        for (int i = 1; i <= n; i++) {
            int[] pISource = new int[i];
            for (int j = 0; j < pISource.length; j++) {
                pISource[j] = j + 1; // помилкою була відсутність "+ 1"
            }
            int sIFunctionSum = 0;
            for (int number : pISource) {
                sIFunctionSum += number;
            }
            pFunctionSum += sIFunctionSum;
        }
        // s - function
        int[] source = new int[pFunctionSum];
        for (int i = 0; i < source.length; i++) {
            source[i] = i + 1; // тут також
            }
            int sFunctionSum = 0;
            for (int i : source) {
                sFunctionSum += i;
            }
        System.out.println(sFunctionSum);
    }
}