package c.inheritance;

public class Equals {
    public static void main(String[] args){
        Equals thisObject = new Equals();
        // thisObject.equalMethod();
        thisObject.equalMethod2();
    }
    public void equalMethod(){
        MemberDTO obj1 = new MemberDTO("Sangmin");
        MemberDTO obj2 = new MemberDTO("Sangmin");
        if (obj1 == obj2){
            System.out.println("Two obj is same");
        } else {
            System.out.println("Two obj is different");
        }
    }
    public void equalMethod2(){
        MemberDTO obj1 = new MemberDTO("Sangmin");
        MemberDTO obj2 = new MemberDTO("Sangmin");
        if (obj1.equals(obj2)){
            System.out.println("Two obj is same");
        } else {
            System.out.println("Two obj is different");
        }
    }
}
