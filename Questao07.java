public class Questao07 {
    public static boolean ehPrimo(int n, int divisor) {
        if (n <= 1) {
            return false;
        }
        if (divisor * divisor > n) {
            return true;
        }
        if (n % divisor == 0) {
            return false;
        }
        return ehPrimo(n, divisor + 1);
    }
}
