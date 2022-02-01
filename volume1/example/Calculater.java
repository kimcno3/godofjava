package volume1.example;

public class Calculater{
  
  public static void main(String args[]){
    System.out.println("���� ����"); 
    Calculater dogCalc = new Calculater();
    int a = 10;
    int b = 5;
    
    System.out.println("add = " + dogCalc.add(a, b));
    System.out.println("subtract = " + dogCalc.subtract(a, b));
    System.out.println("multiply = " + dogCalc.multiply(a, b));
    System.out.println("divide = " + dogCalc.divide(a,b));
  }
  
  public int add(int num1, int num2){
    int result = num1 + num2;
    return result;  
  }
  
  public int subtract(int num1, int num2){
    int result = num1 - num2;
    return result;  
  }
  public int multiply(int num1, int num2){
    int result = num1 * num2;
    return result;
  }
  public int divide(int num1, int num2){
    int result = num1 / num2;
    return result;  
  }
}