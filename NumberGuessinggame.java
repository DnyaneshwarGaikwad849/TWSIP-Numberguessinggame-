import java.util.Random;
import java.util.Scanner;

 class NumberGuessinggame
{
   public static void main(String[]args)
   {
      Random rand=new Random();
      int Numbertoguess=rand.nextInt(100)+1;

      Scanner sc=new Scanner(System.in);
   
      System.out.println("Welcome to the number guessing game:!");
      System.out.println("Guess a number between 1 to 100");

      while(true)
      {
         int guess=sc.nextInt();
         if(guess==Numbertoguess)
         {
            System.out.println("Congratulations you guessesd the correct number..!");
            break;
         }
         else if(guess<Numbertoguess)
         {
            System.out.println("Your guess is too low..please try again!");
         }
         else
         {
            System.out.println("Your guess is too high...please try again!");
         }
      }
      sc.close();
      
   }
}