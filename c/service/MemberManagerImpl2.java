package c.service;

import c.inheritance.MemberDTO;

public class MemberManagerImpl2 extends MemberMangerAbstract{
    @Override
    public boolean addMember(MemberDTO member){
        return true;
    }
    @Override
    public boolean removeMember(String name, String phone){
        return true;
    }
    @Override
    public boolean updateMember(MemberDTO member){
        return true;
    }
}
