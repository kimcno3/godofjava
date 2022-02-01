package volume1.example;

public class OperatorCasting{
    public static void main(String args[]){
        OperatorCasting sample = new OperatorCasting();
        // sample.casting();
        sample.casting2();
    }
    public void casting(){
        byte byteValue = 127;
        short shortValue = byteValue;
        
        shortValue++;
        System.out.println(shortValue); // 128
        
        byteValue = (byte)shortValue;
        System.out.println(byteValue); // -128
    }
    public void casting2(){
        short shortValue = 256;
        byte byteValue = (byte)shortValue;
        System.out.println(byteValue);
        
        shortValue = 254;
        byteValue = (byte)shortValue;
        System.out.println(byteValue);
    }
}
