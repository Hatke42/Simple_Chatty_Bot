import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int busHeight = sc.nextInt();
        int bridges = sc.nextInt();
        int temp = 0;
        boolean condition = false;
        int crashbridge = 0;
        while (bridges > 0) {
            temp++;
            int brigeHeight = sc.nextInt();
            if (brigeHeight <= busHeight) {
                condition = true;
                break;
            }
            bridges--;
        }
        if (condition) {
            System.out.println("Will crash on bridge "+ temp);
        } else {
            System.out.println("Will not crash");
        }
    }
}