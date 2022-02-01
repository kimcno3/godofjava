package volume1.example;

public class OperatorUnary{
    public static void main(String args[]){
        OperatorUnary sample = new OperatorUnary();
        sample.unary();
        sample.complement();
    }
    public void unary(){
        int intValue = -10;
        
        int result = +intValue;
        System.out.println(result); // -10
        
        result = -intValue;
        System.out.println(result); // 10
        
        intValue = 1;
        System.out.println(intValue++); // 1
        System.out.println(intValue);   // 2
        System.out.println(++intValue); // 3
    }
    public void complement(){
        boolean flag = true;
        System.out.println(flag);
        System.out.println(!flag);
    }
}