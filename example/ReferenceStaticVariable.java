package example;
public class ReferenceStaticVariable{
    static String name;
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
    }
}