package volume1.example;

public class ReferenceStaticVariable{
    // static String name;
    String name; // 에러제거를 위한 코드
    public ReferenceStaticVariable(){}
    public ReferenceStaticVariable(String name){
        this.name = name;
    }
    public static void main(String[] args){
        ReferenceStaticVariable sample = new ReferenceStaticVariable();
        sample.checkName();
    }
    public void checkName(){
        ReferenceStaticVariable reference1 = new ReferenceStaticVariable("Kim");
        System.out.println(reference1.name);
        ReferenceStaticVariable reference2 = new ReferenceStaticVariable("Lee");
        System.out.println(reference1.name);
        System.out.println(reference2.name); // for removing Error
    }
}