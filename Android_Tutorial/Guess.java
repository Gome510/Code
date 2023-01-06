import java.util.Random;
import java.util.Scanner;

public class Guess{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(100) + 1;

        //Intro
        System.out.println("Greetings! Care for a game of chance?\nYou get five chances to guess a number between 1 and 100!\nWhen you're ready, type your name and hit Enter!");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.println("Good luck, " + name);

        //Game
        
        for(int i = 0; i < 5; i++){
            printLives(5-i);
            System.out.print("Guess #"+ (i+1) +": ");
            int guess = scanner.nextInt();

            if(i == 4){
                if(guess == number){
                    System.out.println(name +" wins!");
                    break;
                }else{
                    System.out.println("Game Over!");
                    break;
                }
            }

            if(guess == number){
                System.out.println(name +" wins!");
                break;
            }else if(guess > number){
                System.out.println("Try lower!");
            }else if(guess < number){
                System.out.println("Try higher!");
            }else{
                System.out.println("The gods are angry...");
            }

            
        }

        //End
        scanner.close();
    }
    public static void printLives(int n){
        System.out.print("Lives: ");
        for(int i = 0; i < n; i++){
            System.out.print("<3 ");
        }
        System.out.println();
    }
}