package volume1.example;

public class PrimitiveTypesSecond {
  byte byteDefault1;
  short shortDefault1;
  int intDefault1;
  long longDefault1;
  float floatDefault1;
  double doubleDefault1;
  char charDefault1;
  boolean booleanDefault1;
  
  public static void main(String args[]){
    PrimitiveTypesSecond second = new PrimitiveTypesSecond();
    second.printDefault();
  }
  
  public void printDefault(){
    System.out.println(byteDefault1);
    System.out.println(shortDefault1);
    System.out.println(intDefault1);
    System.out.println(longDefault1);
    System.out.println(floatDefault1);
    System.out.println(doubleDefault1);
    System.out.println(charDefault1);
    System.out.println(booleanDefault1);
  }
}
