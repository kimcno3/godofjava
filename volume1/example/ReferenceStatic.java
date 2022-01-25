package example;
public class ReferenceStatic{
    String name = "Kim"; // �ν��Ͻ�����
    public static void main(String[] args){
        // staticMethod();
        staticMethodCallVariable();
    }
    public static void staticMethod(){
        System.out.println("This is Static Method");
    }
    public static void staticMethodCallVariable(){
        System.out.println(name);
    }
}