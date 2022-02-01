package c.inheritance;

// import volume1.example.MemberDTO;

public class Equals {
    public static void main(String[] args){
        Equals thisObject = new Equals();
        // thisObject.equalMethod();
        // thisObject.equalMethod2();
        thisObject.hashcodeMethod();
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
    public void hashcodeMethod(){
        MemberDTO obj1 = new MemberDTO("Sangmin");
        MemberDTO obj2 = new MemberDTO("Sangmin");
        if (obj1.hashCode() == obj2.hashCode()){
            System.out.println("Two obj is same " + obj1.hashCode() + ", " + obj2.hashCode());
        } else {
            System.out.println("Two obj is different " + obj1.hashCode() + ", " + obj2.hashCode());
        }
    }
}
