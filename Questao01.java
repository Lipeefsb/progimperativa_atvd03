import java.util.Locale;
import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int p = sc.nextInt();

        for (int prod = 1; prod <= p; prod++) {
            int n = sc.nextInt();
            int[] vendas = new int[n];

            for (int i = 0; i < n; i++) {
                vendas[i] = sc.nextInt();
            }

            for (int i = 1; i < n; i++) {
                int chave = vendas[i];
                int j = i - 1;
                while (j >= 0 && vendas[j] > chave) {
                    vendas[j + 1] = vendas[j];
                    j--;
                }
                vendas[j + 1] = chave;
            }

            double mediana;
            if (n % 2 == 1) {
                mediana = vendas[n / 2];
            } else {
                mediana = (vendas[n / 2 - 1] + vendas[n / 2]) / 2.0;
            }

            System.out.print("Vendas ordenadas do produto " + prod + ":");
            for (int i = 0; i < n; i++) {
                System.out.print(" " + vendas[i]);
            }
            System.out.println();
            System.out.println("Mediana das vendas do produto " + prod + ": " + mediana);
        }

        sc.close();
    }
}
