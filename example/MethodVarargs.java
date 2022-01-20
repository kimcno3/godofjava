package example;
public class MethodVarargs{
    public static void main(String[] args){
        MethodVarargs varargs = new MethodVarargs();
        // varargs.calculateNumbersWithArray(new int[]{1,2,3,4,5});
        // varargs.calculateNumbers(1,2,3,4,5);
        
        // prinf Ȱ���
        MemberDTO member = new MemberDTO("Kim", "010-5225-9525", "kimcno3@naver.com");
        System.out.printf("Name:%s Phone:%s E-mail:%s\n", member.name,member.phone,member.email);
    }
    public void calculateNumbersWithArray(int[] numbers){
    }
    public void calculateNumbers(int...numbers){
        int total = 0;
        for(int n : numbers){
            total += n;
        }
        System.out.println(total);
    }
}