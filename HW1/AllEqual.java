import  java.util.Scanner;

public class AllEqual {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        if (x == y && y == z) {
            System.out.println("equal");
        }else System.out.println("not equal");
    }
}
