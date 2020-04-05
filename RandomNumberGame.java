
import java.util.Random;
import java.util.Scanner;
public class RandomNumberGame 
{

    public static void main(String[] args) 
    {
        Random rand = new Random();
        int numberguess = rand.nextInt(101);
        int counters = 0;
        System.out.println(numberguess);

        Scanner sc = new Scanner(System.in);
        System.out.println("Guess a number between 0 to 100, you have 10 tries.");

        int i = 0;
        boolean win = false;
        while(win == false && counters < 10) 
        {
            int guess = sc.nextInt();
            counters++;

            if(guess==numberguess)
            {
                win=true;
                System.out.println("You win");
            }


        }
    }

}