package c;

import c.service.MemberManager;
import c.service.MemberManagerImpl;
import c.service.MemberManagerImpl2;

public class InterfaceExample {
    public static void main(String[] args) {
        MemberManager member = new MemberManagerImpl();
        boolean result = member.removeMember("Kim", "010-xxxx-xxxx");
        System.out.println(result);

        MemberManager member2 = new MemberManagerImpl2();
        result = member2.removeMember("Kim", "010-xxxx-xxxx");
        System.out.println(result);
    }
}
