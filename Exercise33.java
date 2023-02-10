import java.util.Scanner;

public class Exercise33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number ;
        System.out.print("Enter your number :");
           number = input.nextInt();    
           while (number % 2 == 0){
            System.out.print("Enter your number agin :");
            number = input.nextInt();    
           }
           System.out.println("Your number is "+number);

    }
}
   