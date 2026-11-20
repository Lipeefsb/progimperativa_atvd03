public class Questao09 {
    public static double somaInversos(int n) {
        if (n <= 1) {
            return n;
        }
        return (1.0 / n) + somaInversos(n - 1);
    }
}
