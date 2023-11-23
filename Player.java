public class Player {

  private int x, y, maxhealth, currhealth, level, exp;
  private String name;

  public Player(){
    x = 0;
    y = 0;
    maxhealth = 100;
    currhealth = 100;
    level = 1;
  }

  public void setname(String name){
    name = name;
  }

  public String getname(){
    return name;
  }

  public int getCurrhealth(){
    return currhealth;
  }

  public void move(String [][] world){

  }


  public void levelUp(){
    exp = exp - 100;
    level++;
    maxhealth *= 1.5;
    System.out.println("Level Up! You are now level " +level);
  }
}
