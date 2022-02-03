package c.util;

import c.inheritance.MemberDTO;

public class FinalReferenceType {
    final MemberDTO dto = new MemberDTO("Kim");
    public static void main(String[] args){
        FinalReferenceType referenceType = new FinalReferenceType();
        referenceType.checkDTO();
    }
    public void checkDTO(){
        System.out.println(dto); // Name : Kim, Phone : null, email : null
        
        // dto = new MemberDTO("Lee");
        // System.out.println(dto);

        dto.name = "Lee";
        System.out.println(dto); // Name : Lee, Phone : null, email : null
    }
}
