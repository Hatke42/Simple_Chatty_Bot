import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        boolean condition = true;
        String order = "";
        int first = sc.nextInt();
        int second = sc.nextInt();
        if (first < second) {
            order = "asc";
        } else if (first == second) {
            first = second;
            second = sc.nextInt();
            if (first < second) {
                order = "asc";
            } else if (first > second) {
                order = "dsc";
            } else {
                order = "eqaul";
            }
        } else {
            order = "dsc";
        }
        while (sc.hasNext()) {
            first = second;
            second = sc.nextInt();
            if(second == 0) {
                condition = true;
                break;
            }
            if(first < second && order.equals("dsc")) {
                condition = false;
                break;
            }
            if (first > second && order.equals("asc")) {
                condition = false;
                break;
            }
        }
        if (condition) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}