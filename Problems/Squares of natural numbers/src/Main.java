import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double square = Math.sqrt(n);
        int temp = 1;
        while (temp <= square) {
            System.out.println((int)Math.pow(temp,2));
            temp++;
        }
    }
}