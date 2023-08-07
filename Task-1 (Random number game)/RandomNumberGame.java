import java.util.Random;
import java.util.Scanner;
public class RandomNumberGame {
    public static void main(String[] args) {
        int ans , guess ;
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Enter a number between 0 and 100 :");
        guess = sc.nextInt();
        ans = rand.nextInt(100);

        if(guess>ans){
            System.out.println("Your guess is larger than answer, please make a guess little smaller");
        } else if (guess<ans) {
            System.out.println("Your Guess is smaller than answer, please make guess larger");
        } else {
            System.out.println("Congratulations you made a correct guess.");
        }
    }
}