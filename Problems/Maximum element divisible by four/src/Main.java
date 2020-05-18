import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        for (int i = 0; i < n; i++) {
            int var = sc.nextInt();
            if (var % 4 == 0 && var > max) {
                max = var;
            }
        }
        System.out.println(max);
    }
}