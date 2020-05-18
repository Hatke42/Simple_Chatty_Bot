import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        double m = sc.nextInt();
        double p = sc.nextInt() * 0.01;
        double k = sc.nextInt();
        int count = 0;
        while (m < k) {
            m = m + (p * m);
            count++;
        }
        System.out.println(count);
    }
}