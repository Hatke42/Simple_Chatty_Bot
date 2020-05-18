import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;
        while(n > 0) {
            int temp = sc.nextInt();
            if(temp % 4 == 0 && temp > max) {
                max = temp;
            }
            n--;
        }
        System.out.println(max);
    }
}