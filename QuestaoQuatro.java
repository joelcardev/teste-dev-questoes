import java.util.Scanner;

public class QuestaoQuatro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Numeros de linhas do teste:");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
              System.out.println("Entre uma string para decifrar: ");
            String s = sc.nextLine();
            while (s.isEmpty()) {
                s = sc.nextLine();
            }
            int mid = s.length() / 2;
            StringBuilder left = new StringBuilder(s.substring(0, mid)).reverse();
            StringBuilder right = new StringBuilder(s.substring(mid)).reverse();
            System.out.println(left.toString() + right.toString());
        }
    }
}
