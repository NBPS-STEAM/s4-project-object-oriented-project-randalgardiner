import java.util.Scanner;
import java.util.Random;

class App {
  public static void main(String[] args) {

    //ask for name
    String name = "Red";
    String computerName = "Macbook";

    Player player1 = new Player("Red", "Macbook");
    System.out.println("Hello player 1, your name and computer name are: " + player1.getName() + " " +  "and" + " " + player1.getComputerName());

    System.out.println(" ----------------------------");

    Player player2 = new Player("Blue");
    System.out.println("Hello player 2, your name is: " + player2.getName());
   
    System.out.println(" ----------------------------");

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