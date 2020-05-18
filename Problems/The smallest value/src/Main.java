import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long fact = 1;
        int num = 0;
        while (fact <= n) {
            num++;
            fact = fact * num;
        }
        System.out.println(num);
    }
}