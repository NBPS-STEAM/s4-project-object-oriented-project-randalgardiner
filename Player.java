public class Player {

  String player;  
  private String name;
  private String computerName;
  
        
  // example of constructor overloading, two constructors, the only difference 
  // is that one specifies which computer they are playing on
  
  
  public Player(String name, String computerName){
      this.name = name;
      this.computerName = computerName;  
  }

  public Player(String name){
    this.name = name; 
  }
  // getter and setter in order to get user name
  public void setName(String name)    {
      this.name = name;
  }
  
  public String getName() {
      return name;
  }

  // getter and setter in order to get the name of the computer that
  // the players are using

  public void setComputerName(Sring computerName) {
    this.computerName = computerName
  }

  public String getComputerName(){
    return computerName;
  }

}          
         
        