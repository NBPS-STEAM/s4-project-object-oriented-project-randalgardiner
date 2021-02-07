public class Player {
    
  private String name;
  String player;
  String computerName;
  int age;
        
  // constructor overloading, two constructors, the only difference 
  // is that one specifies which computer they are playing on
  
  public Player(String name, int ageOfPlayer, String nameOfComputer){
      this.name = name;
      age = ageOfPlayer;
      computerName = nameOfComputer;  
  }

  public Player(String playerName, int ageOfPlayer){
    name = playerName;
    age = ageOfPlayer;
  }

  // getter and setter in order to get user name
  public void setName(String name)    {
      this.name = name;
  }
  
  public String getName() {
      return name;
  }
}          
         
        