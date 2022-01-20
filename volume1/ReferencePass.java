package example;
public class ReferencePass{
    public static void main(String[] args){
        ReferencePass sample = new ReferencePass();
        // sample.callPassByValue();
        sample.callPassByReference();
    }
    public void callPassByValue(){
        int a =10;
        String b = "b";
        System.out.println("Before PassByValue");
        System.out.println(a);
        System.out.println(b);
        
        passByValue();
        System.out.println("After PassByValue");
        System.out.println(a);
        System.out.println(b);
    }
    public void passByValue(){
        int a = 20;
        String b = "z";
        System.out.println("in PassByValue");
        System.out.println(a);
        System.out.println(b);
    }
    public void callPassByReference(){
        MemberDTO member = new MemberDTO("Kim");
        System.out.println("Before passByReference");
        System.out.println(member.name);
        
        passByReference(member); // �Ű������� ��ü�� �Ѱ���� �Ѵ�.
        
        System.out.println("After passByReference");
        System.out.println(member.name);
    }
    public void passByReference(MemberDTO member){
        member.name = "Lee";
        System.out.println("In passByReference");
        System.out.println(member.name);
    }
}