package exceptionHandling;

import java.util.Scanner;

public class HandleException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("please enter your first full number: ");
        int firstNum = input.nextInt();
        System.out.print("Please enter your second full number: ");
        int secondNum = input.nextInt();
        int total = 0;

        try {
            total = firstNum / secondNum;
        }catch(Exception ex){
            System.out.println("You have entered invalid number, " +
                    "please enter valid full number");
        }
        finally {
            System.out.println("The result is: "+total);
        }
    }
}
