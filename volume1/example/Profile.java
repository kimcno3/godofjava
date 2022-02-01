package volume1.example;

public class Profile{
  String name;
  int age;
  
  public void setName(String str){
    name = str;
  }
  public void setAge(int val){
    age = val;
  }
  public void printName(){
    System.out.println("�̸� : " + name);  
  }
  public void printAge(){
    System.out.println("���� : "+ age);
  }
  public static void main(String[] args){
    Profile profile = new Profile();
    
    profile.setName("Kim");
    profile.setAge(27);
    
    profile.printName();
    profile.printAge();
    
    Car car = new Car();
    System.out.println(car.getCurrentSpeed());
  }
}