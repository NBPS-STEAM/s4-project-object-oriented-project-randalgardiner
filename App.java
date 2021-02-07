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
  
         //instance variables for computer guess and player guesses
         int computerNumber;
         int redNumber = 0;
         int blueNumber = 0;
         int counter = 3;
         int redCounter = 3;
         int blueCounter = 3;
         int draws = 3;

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        do {
       System.out.println("--------------------------------");
        computerNumber = rand.nextInt(21);
  
      
      System.out.println("Enter your guess between 1 and 20"+ player1);
      redNumber = scan.nextInt();

       System.out.println("Enter your guess between 1 and 20" + player2);
      blueNumber = scan.nextInt();

      if (redNumber == computerNumber && blueNumber == computerNumber)  {
        System.out.println("It's a draw!");
        counter --;
        draws++;
        System.out.println("You have" +counter+ "game(s) left");
      }
     else if(redNumber == computerNumber) {
       redCounter++;
       System.out.println(player1 + "was right!");
       counter--;
       System.out.println("You have" +counter+ "game(s) left");
     }
     else if(blueNumber == computerNumber) {
       blueCounter++;
       System.out.println(player2 + "was right!");
       counter--;
       System.out.println("You have" +counter+ "game(s) left");
  }
   
   }while(counter!=0);

        System.out.println();

        System.out.println("Scoreboard ----------------");
        System.out.println();

        System.out.println(player1+"won"+redCounter+"games!");
        System.out.println(player2+"won"+blueCounter+"games!");
        System.out.println("Draws made:"+draws);

        System.out.println();

        if (redCounter > blueCounter) {
          System.out.println("Congrats!"+player1+ "for winning the game!");
        }
        else if (redCounter < blueCounter) {
          System.out.println("Congrats!"+player2+ "for winning the game!");
        }
        else {
          System.out.println("No one won :( therefore it was a draw!");
        }
  }

}




