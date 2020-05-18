import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double sum = 0;
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                sum += i;
                count++;
            }
        }
        System.out.println(sum / count);

        int i = 0;
        for (int k = 0; k < 100; k++) {
            i = i++;
            System.out.println(i);
        }
        System.out.println(i);
    }

}