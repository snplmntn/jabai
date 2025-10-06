import java.util.Scanner;

public class MP2_Item7 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("---REVERSE NUMBER CHECKER---\n");

        System.out.print("Enter a number you want to reverse: ");
        int number = scanner.nextInt();

        int reverse = 0;
        int temp = number;

        while (temp != 0){
            int lastDigit = temp % 10;
            reverse = reverse * 10 + lastDigit;
            temp /= 10;
        }

        System.out.println(number + " in reverse is " + reverse);

        //palindrome checker
        if(reverse == number){
            System.out.println("This number is a palindrome number ! !");
        } else {
            System.out.println("This number is not a palindrome number");
        }




        scanner.close();
    }
}