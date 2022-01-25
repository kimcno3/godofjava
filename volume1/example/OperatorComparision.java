package example;
public class OperatorComparision{
    public static void main(String args[]){
        OperatorComparision sample = new OperatorComparision();
        // sample.comparision();
        // sample.comparision2();
        sample.relational();
    }
    // � �� ����
    public void comparision(){
        int intValue1 = 1;
        int intValue2 = 2;
        int intValue3 = 1;
        
        System.out.println(intValue1 == intValue2); // false
        System.out.println(intValue1 == intValue3); // true
        
        System.out.println(intValue1 != intValue2); // true
        System.out.println(intValue1 != intValue3); // false
    }
    // �ٸ� �ڷ����� ��
    public void comparision2(){
        char charValue = 'a';
        System.out.println(97==charValue); // true
        
        int intValue = 1;
        double doubleValue = 1.0;
        System.out.println(intValue == doubleValue); //true
        
        boolean booleanValue1 = true;
        boolean booleanValue2 = false;
        System.out.println(booleanValue1 == booleanValue2); // false
    }
    // ��� �� ������
    public void relational(){
        int intValue1 = 1;
        int intValue2 = 2;
        
        System.out.println(intValue1 > intValue2);  // false
        System.out.println(intValue1 < intValue2);  // true
        System.out.println(intValue1 >= intValue2); // false
        System.out.println(intValue1 <= intValue2); // true
    }
}
