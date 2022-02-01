package volume1.example;

public class ReferenceReturn{
    public static void main(String[] args){
        ReferenceReturn reference = new ReferenceReturn();
        System.out.println(reference.intReturn());
        System.out.println(reference.intArrayReturn());
        System.out.println(reference.stringReturn());
        System.out.println(reference.DTOReturn()); // DTO ���� , �پ��� �ڷ����� �����ϰ� ������
    }
    public int intReturn(){
        int returnInt = 0;
        return returnInt;
    }
    public int[] intArrayReturn(){
        int[] returnIntArray = new int[10];
        return returnIntArray;
    }
    public String stringReturn(){
        String returnString = "string";
        return returnString;
    }
    public Object DTOReturn(){
        MemberDTO dto = new MemberDTO("kim", "010-xxxx-xxxx", "kimcno3@naver.com");
        return dto;
    }
}