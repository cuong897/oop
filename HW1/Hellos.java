import java.util.Scanner;

public class Hellos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        for(int i=1;i<=x;i++){
            if(i%10==1) {
                System.out.println(i + "st Hello");
            } else if (i%10==2) {
                System.out.println(i+"nd Hello");
            }else if(i%10==3){
                System.out.println(i+"rd Hello");
            }else System.out.println(i+"th Hello");

            }
        }
}
