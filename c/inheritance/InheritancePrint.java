package c.inheritance;

public class InheritancePrint{
    public static void main(String[] args){
        Child child = new Child();
        child.printName();
        System.out.println();
        ChildPrint childPrint = new ChildPrint();
        childPrint.printAge();
    }
}