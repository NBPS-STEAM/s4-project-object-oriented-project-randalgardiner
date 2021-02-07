import java.util.Scanner;
import java.util.Random;

class App {
  public static void main(String[] args) {

    //ask for name
    String name = "Bob";
    // ask for age
    int age = 17;
    

    Player player1 = new Player(name, age);

    System.out.println("Hello player 1, Enter your name: " + player1.getName() + "!");
    System.out.println("Hello player 2, Enter your name:");


         int computerNumber;
         int userNumber = 0;
         
      
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        computerNumber = rand.nextInt(101);
        boolean win = false;

         while(userNumber != computerNumber){
        System.out.print("Guess a number between 1 and 100: ");
        userNumber = scan.nextInt();
      
        if(userNumber == computerNumber){
        win = true;
        System.out.println("Correct!");
        }
        
        else if(userNumber > computerNumber){
        System.out.println("The number you have guessed is too high!"); 
        }
        
        else if(userNumber < computerNumber){
        System.out.println("The number you have guessed is too low!");
        }
        }


    
  }
}