package c.service;

import c.inheritance.MemberDTO;

public abstract class MemberMangerAbstract {
    public abstract boolean addMember(MemberDTO member);
    public abstract boolean removeMember(String name, String phone);
    public abstract boolean updateMember(MemberDTO member);
    public void printlog(String data){
        System.out.println("Data = " + data);
    }
}
