import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        for (int i = 1; count < num ; i++) {
            int temp = i;
            while (temp > 0) {
                System.out.print(i + " ");
                temp--;
                count++;
                if(count == num) {
                    break;
                }
            }
        }
    }
}