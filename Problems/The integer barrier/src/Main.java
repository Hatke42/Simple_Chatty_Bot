import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        boolean condition = false;
        while (sc.hasNext()) {
            int temp = sc.nextInt();
            sum += temp;
            if (sum >= 1000 || temp == 0) {
                break;
            }
        }
        if (sum >= 1000) {
            System.out.println(sum - 1000);
        } else {
            System.out.println(sum);
        }
    }
}