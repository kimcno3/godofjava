package volume1.example;
public class ReferenceConstructor{
    public static void main(String[] args){
        ReferenceConstructor sample = new ReferenceConstructor();
        sample.makeMemberObject();

        MemberDTO[] dtos = sample.makeMembersArray();
        for(MemberDTO dto : dtos){
            System.out.println(dto.name + " " + dto.phone + " " + dto.email);
        }
    }
    public void makeMemberObject(){
        MemberDTO dto1 = new MemberDTO();
        MemberDTO dto2 = new MemberDTO("Seonho");
        MemberDTO dto3 = new MemberDTO("Seonho", "010-xxxx-xxxx");
        MemberDTO dto4 = new MemberDTO("Seonho", "010-xxxx-xxxx", "kimcno3@naver.com");
        System.out.println(dto4);
    }
    public MemberDTO[] makeMembersArray(){
        MemberDTO[] dtos = new MemberDTO[3];
        dtos[0] = new MemberDTO("Kim");
        dtos[1] = new MemberDTO("Lee", "010-xxxx-xxxx");
        dtos[2] = new MemberDTO("Park", "010-xxxx-xxxx", "kimcno3@naver.com");

        return dtos;
    }
}