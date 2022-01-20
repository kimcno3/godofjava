package example;
public class Operator{
    public static void main(String args[]){
        Operator sample = new Operator();
        sample.plusMinus();
        sample.mutipleDivision();
        sample.remainder();
    }
    public void plusMinus(){
        int intValue1 = 10;
        int intValue2 = 5;
        
        int result = (byte)intValue1 + (byte)intValue2;
        System.out.println("10 + 5 = " + result);
        
        result = intValue1 - intValue2;
        System.out.println("10 - 5 = " + result);
    }
    public void mutipleDivision(){
        int intValue1 = 10;
        int intValue2 = 5;  
      
        int result = intValue1 * intValue2;
        System.out.println("10 * 5 = " + result);
        
        result = intValue1 / intValue2;
        System.out.println("10 / 5 = " + result);
        
        double doubleValue1 = 5;
        double doubleValue2 = 10;
        
        double doubleResult = doubleValue1 / doubleValue2;
        System.out.println("5 / 10 = " + doubleResult);
    }
    public void remainder(){
        int intValue1 = 53;
        int intValue2 = 10;
        
        int result = intValue1 % intValue2;
        System.out.println("53 % 10 = " + result);
    }
}
