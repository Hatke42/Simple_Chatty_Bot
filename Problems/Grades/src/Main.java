import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a ,b , c, d;
        a = b = c = d = 0;
        for (int i = 0; i < n; i++) {
            int var = sc.nextInt();
            if(var == 5) {
                a++;
            } else if (var == 4) {
                b++;
            } else if (var == 3) {
                c++;
            } else {
                d++;
            }
        }
        System.out.println(d + " " + c + " " + b + " " + a);

    }
}