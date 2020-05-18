import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner((System.in));
        int n = sc.nextInt();
        int shipped = 0;
        int fixed = 0;
        int rejected = 0;
        for(int i = 0; i < n; i++) {
            int test = sc.nextInt();
            if (test == 1) {
                fixed++;
            } else if (test == -1) {
                rejected++;
            } else {
                shipped++;
            }
        }
        System.out.println(shipped + " " + fixed + " " + rejected);
    }
}