import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0 ; i < n; i++) {
            int var = sc.nextInt();
            if (var % 6 == 0) {
               sum += var;
            }
        }
        System.out.println(sum);
    }
}