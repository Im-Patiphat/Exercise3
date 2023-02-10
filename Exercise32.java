import java.util.Scanner;

public class Exercise32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;  

        // do while แบบที1

       /*do {
           System.out.print("Enter your number :");
            number = input.nextInt();           
         }        
        while (number <= 0);     
        System.out.println("Your number is "+number);

        //while แบบที่2

        System.out.print("Enter your number :");
           number = input.nextInt();    
           while (number <= 0){
            System.out.print("Enter your number agin :");
            number = input.nextInt();    
           }
           System.out.println("Your number is "+number);*/

           //for แบบที่3

        System.out.print("Enter your number :");
           number = input.nextInt(); 
           for(int i =0; number <= 0 ; i++ ){
            System.out.print("Enter your number agin :");
            number = input.nextInt();  
           } 
           System.out.println("Your number is "+number);
    }
}