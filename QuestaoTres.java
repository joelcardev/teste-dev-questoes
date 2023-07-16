import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int count = contarParesComDiferenca(arr, k);
        System.out.println(count);
    }

    public static int contarParesComDiferenca(int[] arr, int k) {
        Map<Integer, Integer> frequencia = new HashMap<>();

        for (int num : arr) {
            frequencia.put(num, frequencia.getOrDefault(num, 0) + 1);
        }

        int count = 0;

        for (int num : arr) {
            int target1 = num - k;
            int target2 = num + k;

            if (frequencia.containsKey(target1)) {
                count += frequencia.get(target1);
            }

            if (k != 0 && frequencia.containsKey(target2)) {
                count += frequencia.get(target2);
            }
        }

        return count;
    }
}
