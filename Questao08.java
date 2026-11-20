public class Questao08 {
    public static int somaAteN(int n) {
        if (n <= 1) {
            return n;
        }
        return n + somaAteN(n - 1);
    }
}
