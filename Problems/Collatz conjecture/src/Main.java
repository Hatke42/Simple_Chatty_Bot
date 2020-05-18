import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc  = new Scanner(System.in);
        int coolatzNumber = sc.nextInt();
       do {
            System.out.print(coolatzNumber + " ");
            if (coolatzNumber % 2 == 0) {
                coolatzNumber /= 2;
            } else {
                coolatzNumber = coolatzNumber * 3 + 1;
            }
        }  while (coolatzNumber != 1);
    }
}