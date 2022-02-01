package volume1.example;

public class Student{
    // 1, �ν��Ͻ� ���� ����
    String name;
    String address;
    String phone;
    String email;
    
    // 2, ������(name��)
    public Student(String name){
        this.name = name;
    }
    // 3, ������(��� ���� ��)
    public Student(String name, String address, String phone, String email){
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }
    // 4, toString �޼ҵ� -> ��� ��� ����!! , �������̵�
    public String toString(){
        return name + " " + address + " " + phone + " " + email;
    }
}