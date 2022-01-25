package example;
public class Car {
  // public Car(){};
  
  int speed = 5;
  int distance;
  String color;

  public void speedUp(){
    speed = speed + 5;
  }
  public void breakDown(){
    speed = speed - 5;
  }
  public int getCurrentSpeed() {
    return speed; 
  }
}