import java.util.Scanner;

public class Exercise36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number(1) :");
        int x = input.nextInt();
        System.out.println("Enter your number(2) :");
        int y = input.nextInt();
        System.out.println("Enter your number(3) :");
        int z = input.nextInt();
        int max ;
        if (x > y){
            if (x > z){
                max = x ;
            }
            else{
                max = z;
            }
        }
        else {
            if(y > z){
                max = y;
            }
            else{
                max = z;
            }
        }
        System.out.println(max);
    }
}