import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int max = num;
        while (num != 0) {
            num = sc.nextInt();
            if (num > max) {
                max = num;
            }
        }
        System.out.println(max);
    }
}