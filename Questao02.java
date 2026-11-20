import java.util.Locale;
import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int s = sc.nextInt();

        for (int sec = 1; sec <= s; sec++) {
            int n = sc.nextInt();
            double[] precos = new double[n];

            for (int i = 0; i < n; i++) {
                precos[i] = sc.nextDouble();
            }

            for (int i = 0; i < n - 1; i++) {
                int menorIdx = i;
                for (int j = i + 1; j < n; j++) {
                    if (precos[j] < precos[menorIdx]) {
                        menorIdx = j;
                    }
                }
                double temp = precos[i];
                precos[i] = precos[menorIdx];
                precos[menorIdx] = temp;
            }

            System.out.print("Precos ordenados da secao " + sec + ":");
            for (int i = 0; i < n; i++) {
                System.out.printf(Locale.US, " %.2f", precos[i]);
            }
            System.out.println();
            System.out.printf(Locale.US, "Preco mais barato da secao %d: %.2f%n", sec, precos[0]);
            System.out.printf(Locale.US, "Preco mais caro da secao %d: %.2f%n", sec, precos[n - 1]);
        }

        sc.close();
    }
}
