public class Questao11 {
    public static int tribonacci(int n) {
        int resultado;
        if (n == 0) {
            resultado = 0;
        } else if (n == 1 || n == 2) {
            resultado = 1;
        } else {
            resultado = tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
        }
        System.out.println(resultado);
        return resultado;
    }
}
