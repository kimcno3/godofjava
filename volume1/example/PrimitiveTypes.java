package volume1.example;

public class PrimitiveTypes{
  public static void main(String args[]){
    PrimitiveTypes types = new PrimitiveTypes();
    types.checkByte();
    types.checkOtherTypes();
    types.checkChar();
    types.defaultValues();
  }
  public void checkByte(){
    byte byteMax = 127;
    byte byteMin = -128;
    System.out.println("byteMax: " + byteMax);
    System.out.println("byteMin: " + byteMin);
    
    byteMax = (byte)(byteMax+1);
    byteMin = (byte)(byteMin-1);
    System.out.println("byteMax+1: "+ (byteMax+1));
    System.out.println("byteMin-1: "+ (byteMin-1));
  }
  public void checkOtherTypes(){
    short shortMax = 32767;
    int intMax = 2147483647;
    long longMax = 9223372036854775807L;
    
    System.out.println((short)(shortMax+1));
    System.out.println((int)(intMax+1));
    System.out.println((long)(longMax+1));
  }
  
  public void checkChar() {
    char charMin = '\u0000';
    char charMax = '\uffff';
    int intValue = 'a';
    System.out.println("charMin=[" + charMin + "]");
    System.out.println("charMax=[" + charMax + "]");
    System.out.println("intValue=[" + intValue + "]");
  }
  
  int intDefault1;
  public void defaultValues(){
      int intDefault2 = 0;
      System.out.println(intDefault1);
      System.out.println(intDefault2);
  }
}
