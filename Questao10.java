public class Questao10 {
    public static int potencia(int x, int k) {
        if (k == 0) {
            return 1;
        }
        return x * potencia(x, k - 1);
    }
}
