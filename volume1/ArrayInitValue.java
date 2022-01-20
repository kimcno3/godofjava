package example;
public class ArrayInitValue{
    public static void main(String[] args){
        ArrayInitValue initValue = new ArrayInitValue();
        initValue.referenceTypesSetValue();
    }
    public void referenceTypesSetValue(){
        ArrayInitValue [] array = new ArrayInitValue[2];
        array[0] = new ArrayInitValue();
        System.out.println(array.toString());
        // System.out.println(array[1]);
    }
}